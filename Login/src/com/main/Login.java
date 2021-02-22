package com.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idcheck = "pranav";
		String passcheck = "1234";
		String id = request.getParameter("id");
		String pass = request.getParameter("password");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		if (id.equalsIgnoreCase(idcheck) && pass.equals(passcheck)) {
			
			rd=request.getRequestDispatcher("success");
			rd.forward(request, response);
		}

	else
	{
		
		rd=request.getRequestDispatcher("index.html");
		out.print("Invalid Login");
		rd.include(request, response);

	}
		
	}

}
