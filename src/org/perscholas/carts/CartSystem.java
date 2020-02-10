package org.perscholas.carts;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

/**
 * @author Stefanski
 *
 */
public class CartSystem extends HashMap< String, Item>
implements Cart, Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CartSystem() {
		super();
	}

	/* (non-Javadoc)
	 * @see cartSystemExample.Cart#display()
	 */
	public void display() {
		for (Item i : this.values()) {
			System.out.println(i);
		}
	}

	public Boolean addItem(Item item) {
		put(item.getItemName(), item);
		return true;
	}

	public Item removeItem(String itemName) {
		return remove(itemName);
	}
	
	public Item getItem(String name) {
		return this.get(name);
	}
	
	@Override
	public Collection<Item> values(){
		return super.values();
	}
}
