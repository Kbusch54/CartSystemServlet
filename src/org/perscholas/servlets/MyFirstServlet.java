package org.perscholas.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyFirstServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * PrintWriter resWriter = response.getWriter();
		 * resWriter.print("<HTML><HEAD></HEAD><Body bgcolor='red'>");
		 * resWriter.print("Served at: "); resWriter.print(request.getContextPath());
		 * resWriter.print("</body></html>");
		 */

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/FirstModelServlet");
		rd.include(request, response);

		if ((boolean) request.getAttribute("loggedIn")) {
			rd = getServletContext().getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		} else {
			rd = getServletContext().getRequestDispatcher("/invalidLogin.jsp");
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
