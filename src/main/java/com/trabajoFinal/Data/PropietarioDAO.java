package com.trabajoFinal.Data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.trabajoFinal.Model.Propietario;

public class PropietarioDAO implements IPropietarioDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public Propietario getPropietario(Long id) {
		Session session = sessionFactory.openSession();
		Propietario propietario = (Propietario) session.load(Propietario.class, id);
		session.close();
		return propietario;
	}

	public List<Propietario> listPropietario() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Propietario> listaPropietarios = session.createQuery("from Propietario").list();
		session.close();
		return listaPropietarios;
	}

	@Transactional
	public void addPropietario(Propietario propietario) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(propietario);
		tx.commit();
		session.close();
	}

	@Transactional
	public void updatePropietario(Propietario propietario) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(propietario);
		tx.commit();
		session.close();		
	}

	@Transactional
	public void removePropietario(long id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Propietario propietario = (Propietario) session.load(Propietario.class, id);
		session.delete(propietario);
		tx.commit();
		session.close();		
	}
}
