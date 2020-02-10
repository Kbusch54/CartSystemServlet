package org.perscholas.JPA.Entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Teacher
 *
 */
@Entity
@NamedQueries( { 
    @NamedQuery(query = "Select d from Teacher d", name = "GetAllTeachers"),
	@NamedQuery(query = "Select d from Teacher d where d.id = :teachId", name = "GetTeacherById"),
	@NamedQuery(query = "Select d from Teacher d where d.department = :deptId", name = "GetTeachersByDepartment")
    
} )
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id	
	private Integer id;
	
	@OneToOne(optional=false)
	@MapsId
	private Credentials credentials;
	
	private double salary;
	private String name;
	
	@ManyToOne
	private Department department;
	
	@ManyToMany
	private Collection<Student> students;

	public Teacher() {
		super();
		
	}
	
	
	/**
	 * @param id
	 * @param salary
	 * @param name
	 * @param department
	 */
	public Teacher(Integer id, double salary, String name, Department department, Credentials credential) {
		this();
		this.setId(id);
		this.setSalary(salary);
		this.setName(name);
		this.setDepartment( department);
		this.setCredentials(credential);
	}


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}


	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	/**
	 * @return
	 * @see org.perscholas.JPA.Entities.Department#getDeptID()
	 */
	public Integer getDeptID() {
		return department.getDeptID();
	}


	/**
	 * @return
	 * @see org.perscholas.JPA.Entities.Department#getState()
	 */
	public String getState() {
		return department.getState();
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teacher [id=");
		builder.append(id);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", name=");
		builder.append(name);
		builder.append(", department=");
		builder.append(department.getName());
		builder.append("]");
		return builder.toString();
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Teacher other = (Teacher) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}


	/**
	 * @return the credentials
	 */
	public Credentials getCredentials() {
		return credentials;
	}


	/**
	 * @param credentials the credentials to set
	 */
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}


	/**
	 * @return the students
	 */
	public Collection<Student> getStudents() {
		return students;
	}


	/**
	 * @param students the students to set
	 */
	public void setStudents(Collection<Student> students) {
		this.students = students;
	}
   
}
