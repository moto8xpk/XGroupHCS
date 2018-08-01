package com.webapp.artifact.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.webapp.artifact.entity.HcsStaff;

@Component
public class StaffDaoImpl {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@SuppressWarnings("unchecked")
	public List<HcsStaff> getStaffList() {
		Query query=entityManager.createQuery("SELECT staff FROM HcsStaff staff");
		List<HcsStaff> ls= query.getResultList();
//		Session session=entityManager.unwrap(Session.class);
//		Query query=(Query) session.createQuery("SELECT staff FROM HcsStaff staff");
//		List<HcsStaff> ls=query.getResultList();
		return ls;
	}
	
}
