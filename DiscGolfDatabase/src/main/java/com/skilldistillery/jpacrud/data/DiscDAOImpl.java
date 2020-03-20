package com.skilldistillery.jpacrud.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpacrud.entities.Disc;

@Service
@Transactional
public class DiscDAOImpl implements DiscDAO {
	@PersistenceContext
	EntityManager em;

	@Override
	public Disc findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Disc.class, id);
	}

	@Override
	public List<Disc> findAll() {
		String findAllQuery = "SELECT d from Disc d";
		// TODO Auto-generated method stub
		return em.createQuery(findAllQuery, Disc.class).getResultList();
	}

}
