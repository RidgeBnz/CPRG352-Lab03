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
           
            
            // validation if the parameters don't exist or are empty or is a letter instead of number, or has a space between numbers
            if (age == null || age == ("") || age == (" ") || Character.isLetter(age.charAt(0))) {
                //create helpful message to user
                request.setAttribute("message", "You must give your current age.");
                //forward the request and response objects to the JSP
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
                return;//stop code call
            }else {
                int ageNextYear = Integer.parseInt(age) + 1; //takes user age and adds 1
                //Gives user calculated age for 1 year
                request.setAttribute("calculatedAge", "Your age next birthday will be " + ageNextYear );
                 //forward the request and response objects to the JSP
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
                return;//stop code call
            }       
    }

}
