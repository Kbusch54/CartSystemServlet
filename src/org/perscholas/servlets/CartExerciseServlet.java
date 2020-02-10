package org.perscholas.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.perscholas.carts.Cart;
import org.perscholas.carts.CartFactory;
import org.perscholas.carts.Item;

/**
 * Servlet implementation class CartExerciseServlet
 */
@WebServlet("/CartExerciseServlet")
public class CartExerciseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Grab a session
		HttpSession session = request.getSession(true);

		// Add a cart to the session
		Cart cart = CartFactory.newInstance();
		session.setAttribute("cart", cart);

		// Get on with it
		RequestDispatcher rd = request.getRequestDispatcher("/addItem.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Get parameters and make an Item
		String name = request.getParameter("name");
		String desc = request.getParameter("desc");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");

		double d = Double.parseDouble(price);
		int q = Integer.parseInt(qty);

		Item item = new Item(name, desc, d, q, 0);

		// Add item to Cart on the session
		HttpSession session = request.getSession(true);
		Cart cart = (Cart) session.getAttribute("cart");
		cart.addItem(item);

		// Head out to the next job
		RequestDispatcher rd = request.getRequestDispatcher("/displayCart.jsp");
		rd.forward(request, response);

	}

}
