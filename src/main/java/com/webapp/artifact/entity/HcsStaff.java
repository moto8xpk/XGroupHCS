package com.webapp.artifact.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "HCS_Staff", uniqueConstraints = { @UniqueConstraint(columnNames = { "StaffId" }) })
@Access(AccessType.FIELD)
public class HcsStaff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StaffId", unique = true, nullable = false)
	private Integer staffId;
	@Column(name = "Username")
	private String username;
	@Column(name = "Password")
	private String password;
	@Column(name = "FullName")
	private String fullname;
	@Column(name = "Sex")
	private String sex;
	@Column(name = "DayOfBirth")
	private Date dayOfBirth;
	@Column(name = "PhoneNumber")
	private String phoneNumber;
	@Column(name = "Address")
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="RoleId")
	private List<HcsRole> roles= new ArrayList<HcsRole>();
	
	
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public Date getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(Date dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<HcsRole> getRoles() {
		return roles;
	}
	public void setRoles(List<HcsRole> roles) {
		this.roles = roles;
	}
	
	
	
	
	
}
