package com.trabajoFinal.Data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.trabajoFinal.Model.OrdenTrabajo;

public class OrdenTrabajoDAO implements IOrdenTrabajoDAO{

	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public OrdenTrabajo getOrdenTrabajo(Long id) {
		Session session = sessionFactory.openSession();
		OrdenTrabajo orden = (OrdenTrabajo) session.load(OrdenTrabajo.class, id);
		session.close();
		return orden;
	}

	public List<OrdenTrabajo> listOrdenTrabajo() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<OrdenTrabajo> listaOrdenTrabajo = session.createQuery("from OrdenTrabajo order by fecha").list();
		session.close();
		return listaOrdenTrabajo;
	}
	
	public List<OrdenTrabajo> listOrdenTrabajoEstado() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<OrdenTrabajo> listaOrdenTrabajo = session.createQuery("from OrdenTrabajo order by estado").list();
		session.close();
		return listaOrdenTrabajo;
	}

	@Transactional
	public void addOrdenTrabajo(OrdenTrabajo OrdenTrabajo) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(OrdenTrabajo);
		tx.commit();
		session.close();
	}

	@Transactional
	public void updateOrdenTrabajo(OrdenTrabajo OrdenTrabajo) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(OrdenTrabajo);
		tx.commit();
		session.close();		
	}

	@Transactional
	public void removeOrdenTrabajo(long id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		OrdenTrabajo OrdenTrabajo = (OrdenTrabajo) session.load(OrdenTrabajo.class, id);
		session.delete(OrdenTrabajo);
		tx.commit();
		session.close();		
	}
	
}
