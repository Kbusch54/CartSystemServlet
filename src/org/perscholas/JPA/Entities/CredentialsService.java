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
public class CredentialsService extends AbstractServices {
	
	/**
	 * 
	 */
	public CredentialsService() {
		super();
	}

	/**
	 * @param Credentials
	 */
	public void addCredential(Credentials credential) {
		em.getTransaction().begin();
		em.persist(credential);
		em.getTransaction().commit();
	}

	/**
	 * @return list of Credential objects
	 */
	@SuppressWarnings("unchecked")
	public List<Credentials> getCredentialsById(int id) {
		Query query = em.createNamedQuery("GetCredentialsById");
		query.setParameter("credId", id);
		return query.getResultList();
	}
	
	/**
	 * @return list of Credential objects
	 */
	@SuppressWarnings("unchecked")
	public List<Credentials> getAllCredentials() {
		Query query = em.createNamedQuery("GetAllCredentials");
		return query.getResultList();
	}

	/**
	 * 
	 */
	public void close() {
		cleanup();
	}
}