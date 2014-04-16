package com.codestrive.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codestrive.mvc.model.User;
import com.codestrive.mvc.services.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "Handleing login details", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String userId,password;
		 userId = request.getParameter("userId");
		 password = request.getParameter("userPass");
		 
		 LoginService loginService = new LoginService();
		 boolean result = loginService.authenticate(userId, password);
		 if(result){
			// User user = loginService.getUserDetails(userId);
			 response.sendRedirect("success.jsp");
			 return;
		 }else{
			 response.sendRedirect("login.jsp");
			 return;
		 }
		 
	}

}
