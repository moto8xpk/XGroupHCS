package com.webapp.artifact.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "HCS_Role", uniqueConstraints = { @UniqueConstraint(columnNames = { "RoleId" }) })
public class HcsRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RoleId", unique = true, nullable = false)
	private Integer roleId;
	
	@Column(name = "RoleName")
	private String 	roleName;
	
	@Column(name = "Salary")
	private Double salary;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "StaffId")
//	private HcsStaff staff;
	
//	public HcsStaff getStaff() {
//		return staff;
//	}
//	public void setStaff(HcsStaff staff) {
//		this.staff = staff;
//	}
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public HcsRole(Integer roleId, String roleName, Double salary) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.salary = salary;
	}
	
	public HcsRole(Integer roleId) {
		super();
		this.roleId = roleId;
	}
	
	public HcsRole() {
		super();
	}
	
	public HcsRole(Integer roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	
}
