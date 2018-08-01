package com.webapp.artifact.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.webapp.artifact.entity.HcsRole;

@Component
public class RoleDaoImpl {

	@PersistenceContext
	private EntityManager em;
	
	
	@SuppressWarnings("unchecked")
	public List<HcsRole> getAllRoles() {
		Query query=em.createQuery("SELECT r FROM HcsRole r");
		List<HcsRole> ls=query.getResultList();
		return ls;
	}
	
	
	
}
