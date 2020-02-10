package org.perscholas.JPA.Entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	
	@ManyToMany(mappedBy ="students")
	private Collection<Teacher> teachers;

	public Student() {
		super();
	}
	public Student(int id, String name) {
		this();
		this.setId(id);
		this.setName(name);
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the teachers
	 */
	public Collection<Teacher> getTeachers() {
		return teachers;
	}
	/**
	 * @param teachers the teachers to set
	 */
	public void setTeachers(Collection<Teacher> teachers) {
		this.teachers = teachers;
	}
}
