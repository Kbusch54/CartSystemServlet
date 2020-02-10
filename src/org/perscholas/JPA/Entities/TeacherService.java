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
public class TeacherService extends AbstractServices {
	
	/**
	 * 
	 */
	public TeacherService() {
		super();
	}

	/**
	 * @param teacher
	 */
	public void addTeacher(Teacher teacher) {
		em.getTransaction().begin();
		em.persist(teacher);
		em.getTransaction().commit();
	}

	/**
	 * @return list of Teacher objects
	 */
	@SuppressWarnings("unchecked")
	public List<Teacher> getTeacherById(int id) {
		Query query = em.createNamedQuery("GetTeacherById");
		query.setParameter("teachId", id);
		return query.getResultList();
	}
	
	/**
	 * @return list of Teacher objects
	 */
	@SuppressWarnings("unchecked")
	public List<Teacher> getAllTeachers() {
		Query query = em.createNamedQuery("GetAllTeachers");
		return query.getResultList();
	}
	/**
	 * @return list of Teacher objects
	 */
	@SuppressWarnings("unchecked")
	public List<Teacher> getTeachersByDepartment(Department dept) {
		Query query = em.createNamedQuery("GetTeachersByDepartment");
		query.setParameter("deptId", dept);
		return query.getResultList();
	}
	/**
	 * 
	 */
	public void close() {
		cleanup();
	}

}
