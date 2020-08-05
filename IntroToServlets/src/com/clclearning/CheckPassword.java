package com.clclearning;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckPassword
 */
@WebServlet("/CheckPassword")
public class CheckPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String errorMessage="";
		boolean error = true;
		if(!username.isBlank() && !password.isBlank()) {
			if(username.equals("changmasa") && password.equals("admin123")) {
				error=false;
				response.sendRedirect("member.jsp");
			}else {
				error=true;
				errorMessage="Incorrect Username/Password";
				request.setAttribute("error", error);
				request.setAttribute("errorMessage", errorMessage);
				request.getRequestDispatcher("error.jsp").forward(request,response);
				//response.sendRedirect("error.jsp");
			}
		}else {
			error=true;
			errorMessage="Username/Password is blank";
			response.sendRedirect("error.jsp");
		}
	}

}
