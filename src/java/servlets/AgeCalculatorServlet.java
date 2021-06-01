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
public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            //capture the parameters from the POST request(the form)
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            //capture the parameters from the POST request(the form)
            String age = request.getParameter("user_age");
           
            try {
                int ageNextYear = Integer.parseInt(age) + 1; //takes user age and adds 1
                //Gives user calculated age for 1 year
                request.setAttribute("calculatedAge", "Your age next birthday will be " + ageNextYear );
            } catch(NumberFormatException e) {
            request.setAttribute("message", "invalid");
        }
            //forward the request and response objects to the JSP
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
    }
}
