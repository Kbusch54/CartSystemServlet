package org.perscholas.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.perscholas.JPA.Entities.Credentials;
import org.perscholas.JPA.Entities.CredentialsService;

/**
 * Servlet implementation class FirstModelServlet
 */
@WebServlet("/FirstModelServlet")
public class FirstModelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user= request.getParameter("username");
		String pass = request.getParameter("password");
		request.setAttribute("username", user);
		request.setAttribute("loggedIn", false);
		
		CredentialsService cs = new CredentialsService();	
		List<Credentials> credentials = cs.getAllCredentials();
		request.setAttribute("credList", credentials);
		
		for( Credentials creds : credentials) {
			if( creds.getUsername().equals(user)
					&& creds.getPassword().equals(pass)) {
				request.setAttribute("loggedIn", true);
				break;
			}
		}
		
		cs.close();
		cs=null;
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}
}
