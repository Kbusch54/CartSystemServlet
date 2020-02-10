/**
 * 
 */
package org.perscholas.carts;

/**
 * @author Stefanski
 *
 */
public class CartFactory {

	
	public static Cart newInstance() {
		return new CartSystem();
	}
}
