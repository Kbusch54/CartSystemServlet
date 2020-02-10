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
public class DepartmentServices extends AbstractServices{

	public DepartmentServices() {
		super();
	}

	/**
	 * @param department
	 */
	public void addDepartment(Department department) {
		em.getTransaction().begin();
		em.persist(department);
		em.getTransaction().commit();
	}

	/**
	 * @return list of Department objects
	 */
	@SuppressWarnings("unchecked")
	public List<Department> getDepartmentById(int id) {
		Query query = em.createNamedQuery("GetDepartmentById");
		query.setParameter("deptId", id);
		return query.getResultList();
	}
	
	/**
	 * @return list of Department objects
	 */
	@SuppressWarnings("unchecked")
	public List<Department> getAllDepartments() {
		Query query = em.createNamedQuery("GetAllDepartments");
		return query.getResultList();
	}
	
	public void updateDepartmentTeacherList(int id, List<Teacher> teachers) {
		em.getTransaction().begin();
		Department department = em.find(Department.class, id);
		department.setTeacherList(teachers);
		em.getTransaction().commit();
	}
	
	
	/**
	 * 
	 */
	public void close() {
		cleanup();
	}

}
