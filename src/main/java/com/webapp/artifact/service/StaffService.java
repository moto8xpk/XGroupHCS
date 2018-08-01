package com.webapp.artifact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.artifact.dao.impl.StaffDaoImpl;
import com.webapp.artifact.entity.HcsStaff;

@Service
public class StaffService {

	@Autowired
	private StaffDaoImpl daoImpl;
	
	public List<HcsStaff> getStaffs() {
		return daoImpl.getStaffList();
	}
}
