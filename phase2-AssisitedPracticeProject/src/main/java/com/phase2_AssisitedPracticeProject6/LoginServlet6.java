package com.phase2_AssisitedPracticeProject6;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet6 extends HttpServlet {
        private static final long serialVersionUID = 1L;
   
    public LoginServlet6() {
        super();
        // TODO Auto-generated constructor stub
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
                 Cookie userId = new Cookie("userid", request.getParameter("userid"));
                 response.addCookie(userId);
              response.sendRedirect("dashboard");  
                
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}
