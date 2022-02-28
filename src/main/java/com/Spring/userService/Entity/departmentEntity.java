package com.Spring.userService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class departmentEntity {

	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String departname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartname() {
		return departname;
	}
	public void setDepartname(String departname) {
		this.departname = departname;
	}
	@Override
	public String toString() {
		return "departmentEntity [id=" + id + ", departname=" + departname + "]";
	}
	public departmentEntity(int id, String departname) {
		super();
		this.id = id;
		this.departname = departname;
	}
	public departmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
