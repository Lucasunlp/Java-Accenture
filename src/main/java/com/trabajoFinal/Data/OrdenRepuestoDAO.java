package com.trabajoFinal.Data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.trabajoFinal.Model.OrdenRepuesto;


public class OrdenRepuestoDAO implements IOrdenRepuestoDAO{

	
	@Autowired
	SessionFactory sessionFactory;

	
	public OrdenRepuesto getOrdenRepuesto(Long id) {
		Session session = sessionFactory.openSession();
		OrdenRepuesto orden= (OrdenRepuesto) session.load(OrdenRepuesto.class, id);
		session.close();
		return orden;
	}

	public List<OrdenRepuesto> listOrdenRepuesto() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<OrdenRepuesto> listaOrdenRepuesto = session.createQuery("from OrdenRepuesto").list();
		session.close();
		return listaOrdenRepuesto;
	}

	@Transactional
	public void addOrdenRepuesto(OrdenRepuesto OrdenRepuesto) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(OrdenRepuesto);
		tx.commit();
		session.close();
	}

	@Transactional
	public void updateOrdenRepuesto(OrdenRepuesto OrdenRepuesto) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(OrdenRepuesto);
		tx.commit();
		session.close();		
	}

	@Transactional
	public void removeOrdenRepuesto(Long id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		OrdenRepuesto OrdenRepuesto = (OrdenRepuesto) session.load(OrdenRepuesto.class, id);
		session.delete(OrdenRepuesto);
		tx.commit();
		session.close();		
	}



}
