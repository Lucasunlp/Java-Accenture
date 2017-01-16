package com.trabajoFinal.Data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.trabajoFinal.Model.Repuesto;

public class RepuestoDAO  implements IRepuestoDAO{


	@Autowired
	SessionFactory sessionFactory;

	

	public List<Repuesto> listRepuesto() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Repuesto> listaRepuestos = session.createQuery("from Repuesto").list();
		session.close();
		return listaRepuestos;
	}

	@Transactional
	public void addRepuesto(Repuesto repuesto) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(repuesto);
		tx.commit();
		session.close();
	}

	@Transactional
	public void updateRepuesto(Repuesto repuesto) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(repuesto);
		tx.commit();
		session.close();		
	}

	@Transactional
	public void removeRepuesto(long id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Repuesto repuesto = (Repuesto) session.load(Repuesto.class, id);
		session.delete(repuesto);
		tx.commit();
		session.close();		
	}

	@Transactional
	public Repuesto getRepuesto(Long id) {
		Session session = sessionFactory.openSession();
		Repuesto repuesto = (Repuesto) session.load(Repuesto.class, id);
		session.close();
		return repuesto;
	}

	public Repuesto getRepuesto(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
