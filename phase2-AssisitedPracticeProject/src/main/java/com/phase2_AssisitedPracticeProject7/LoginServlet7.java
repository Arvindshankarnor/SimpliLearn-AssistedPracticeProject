package com.phase2_AssisitedPracticeProject7;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/LoginServlet")
public class LoginServlet7 extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
  
    public LoginServlet7() {
        super();
        // TODO Auto-generated constructor stub
    }

     
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
                 String userId = request.getParameter("userid");
             response.sendRedirect("dashboard?userid=" + userId);  
                
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}
