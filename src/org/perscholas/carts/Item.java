package org.perscholas.carts;

import java.io.Serializable;

public class Item implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String itemName;
    private String itemDesc;
    private Double itemPrice;
	private Integer quantity;
    private Integer availableQuantity;
    
    public Item() {
    	
    }
    
	/**
	 * @param itemName
	 * @param itemDesc
	 * @param itemPrice
	 * @param quantity
	 * @param availableQuantity
	 */
	public Item(String itemName, String itemDesc, Double itemPrice, Integer quantity, Integer availableQuantity) {
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.availableQuantity = availableQuantity;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the itemDesc
	 */
	public String getItemDesc() {
		return itemDesc;
	}
	/**
	 * @param itemDesc the itemDesc to set
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	/**
	 * @return the itemPrice
	 */
	public Double getItemPrice() {
		return itemPrice;
	}
	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the availableQuantity
	 */
	public Integer getAvailableQuantity() {
		return availableQuantity;
	}
	/**
	 * @param availableQuantity the availableQuantity to set
	 */
	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availableQuantity == null) ? 0 : availableQuantity.hashCode());
		result = prime * result + ((itemDesc == null) ? 0 : itemDesc.hashCode());
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((itemPrice == null) ? 0 : itemPrice.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (availableQuantity == null) {
			if (other.availableQuantity != null)
				return false;
		} else if (!availableQuantity.equals(other.availableQuantity))
			return false;
		if (itemDesc == null) {
			if (other.itemDesc != null)
				return false;
		} else if (!itemDesc.equals(other.itemDesc))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (itemPrice == null) {
			if (other.itemPrice != null)
				return false;
		} else if (!itemPrice.equals(other.itemPrice))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Item [itemName=%s, itemDesc=%s, itemPrice=%s, quantity=%s, availableQuantity=%s]",
				itemName, itemDesc, itemPrice, quantity, availableQuantity);
	}
}
