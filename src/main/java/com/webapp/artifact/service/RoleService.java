package com.webapp.artifact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.artifact.dao.impl.RoleDaoImpl;
import com.webapp.artifact.entity.HcsRole;

@Service
public class RoleService {
	
	@Autowired
	private RoleDaoImpl daoImpl;
	
	public List<HcsRole> getAllRoles() {
		return daoImpl.getAllRoles();
	}
	
}
