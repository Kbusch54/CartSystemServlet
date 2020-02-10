/**
 * 
 */
package org.perscholas.JPA.Entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

 
/**
 * @author Stefanski
 *
 */
public abstract class AbstractServices {
	protected EntityManagerFactory emf;
	protected EntityManager em;

	public AbstractServices() {
		this("MySecondJPAWeb");
	}
	
	public AbstractServices(String PU) {  
		emf = Persistence.createEntityManagerFactory(PU);
		em = emf.createEntityManager();
	}
	
	protected void cleanup() {
		em.close();
		emf.close();
	}
}
