/**
 * 
 */
package org.perscholas.JPA.Entities;

import java.util.List;

import javax.persistence.Query;

/**
 * @author Stefanski
 *
 */
public class FruitService extends AbstractServices{
	public FruitService() {
		super();
	}

	/**
	 * @param fruit
	 */
	public void addFruit(Fruit fruit) {
		em.getTransaction().begin();
		em.persist(fruit);
		em.getTransaction().commit();
	}

	/**
	 * @return list of Fruit objects
	 */
	public List<Fruit> getAllFruits() {
		Query query = em.createNamedQuery("GetAllFruits");
		return query.getResultList();
	}
	
	public void close() {
		cleanup();
	}
}
