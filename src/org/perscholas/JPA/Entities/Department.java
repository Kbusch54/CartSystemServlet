package org.perscholas.JPA.Entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Department
 *
 */
@Entity
@NamedQueries({ @NamedQuery(query = "Select d from Department d", name = "GetAllDepartments"),
		@NamedQuery(query = "Select d from Department d where d.deptID = :deptId", name = "GetDepartmentById") })

public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer deptID;
	private String name;
	private String state;
	@OneToMany(targetEntity = Teacher.class, fetch = FetchType.EAGER)
	private List<Teacher> teacherList;

	/**
	 * @param deptID
	 * @param name
	 * @param state
	 */
	public Department(Integer deptID, String name, String state, List<Teacher> teacherList) {
		this();
		this.setDeptID(deptID);
		this.setName(name);
		this.setState(state);
		this.setTeacherList(teacherList);
	}

	public Department() {
		super();
	}

	/**
	 * @return the teacherList
	 */
	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	/**
	 * @param teacherList
	 *            the teacherList to set
	 */
	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	/**
	 * @return
	 */
	public Integer getDeptID() {
		return this.deptID;
	}

	/**
	 * @param deptID
	 */
	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}

	/**
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [deptID=");
		builder.append(deptID);
		builder.append(", name=");
		builder.append(name);
		builder.append(", state=");
		builder.append(state);
		builder.append(", teacherList=");
		for (Teacher t : teacherList) {
			builder.append(t);
		}
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptID == null) ? 0 : deptID.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		Department other = (Department) obj;
		if (deptID == null) {
			if (other.deptID != null)
				return false;
		} else if (!deptID.equals(other.deptID))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

}
