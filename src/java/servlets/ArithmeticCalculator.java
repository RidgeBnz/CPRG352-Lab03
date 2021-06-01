
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 840288
 */
public class ArithmeticCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            request.setAttribute("ans", "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        

        try{
            //capture the parameters from the POST request(the form)
            int x = Integer.parseInt(request.getParameter("1stNum"));
            int y = Integer.parseInt(request.getParameter("2ndNum"));
            
            //set the attribute for the JSP
            request.setAttribute("firstNum", x);
            request.setAttribute("secNum", y);
            
            if(request.getParameter("plus") != null) {
                 request.setAttribute("ans", (x + y));
            }
            if (request.getParameter("minus") != null) {
                request.setAttribute("ans", (x - y));
            }
            if (request.getParameter("mult") != null) {
                request.setAttribute("ans", (x * y));
            }
            if (request.getParameter("div") != null && y != 0) {
                request.setAttribute("ans", (x % y));
            } else if (request.getParameter("div") != null && y == 0) {
                request.setAttribute("ans", "Error, Cannot Divide By Zero");
            }
        }catch (NumberFormatException e) {
            request.setAttribute("ans", "invalid");
        }
        //forward the request and response objects to the JSP
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }
}
