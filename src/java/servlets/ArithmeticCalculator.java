
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
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        
            String firstNumber = request.getParameter("first_num");
            String secondNumber = request.getParameter("second_num");
            String calculatedAns = request.getParameter("calc");
            
            request.setAttribute("firstNum", firstNumber);
            request.setAttribute("secondNum", secondNumber);

            // validation if the parameters don't exist or are empty or is a letter instead of number, or has a space between numbers
            if (firstNumber == null || firstNumber == ("") || firstNumber == (" ") || Character.isLetter(firstNumber.charAt(0))
                    || secondNumber == null || secondNumber == ("") || secondNumber == (" ") || Character.isLetter(secondNumber.charAt(0))) {
                //create helpful message to user
                request.setAttribute("message", "invalid");
                //forward the request and response objects to the JSP
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
                return;//stop code call
            }
            
            
            
    
    }
}
