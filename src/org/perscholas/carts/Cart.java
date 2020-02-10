/**
 * 
 */
package org.perscholas.carts;

import java.util.Collection;

/**
 * @author Stefanski
 *
 */
public interface Cart {
	void display() ;

	Boolean addItem(Item item);

	Item removeItem(String itemName) ;
 
	Item getItem(String name);
	
	Collection<Item> values();
}
