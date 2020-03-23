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

	@Override
	public List<String> allManufacturers() {
		String queryManufacturer = "SELECT DISTINCT d.manufacturer from Disc d";
		// TODO Auto-generated method stub
		return em.createQuery(queryManufacturer, String.class).getResultList();
	}

	@Override
	public List<Disc> discsByManufacturer(String manu) {
		String queryGroupManu = "SELECT d FROM Disc d WHERE d.manufacturer LIKE :manu";
		// TODO Auto-generated method stub
		return em.createQuery(queryGroupManu, Disc.class).setParameter("manu", manu).getResultList();
	}

	@Override
	public List<Disc> discsByKeyword(String keyword) {
		String keywordDiscSearch = "SELECT d FROM Disc d where d.manufacturer like :keyword or d.discModel like :keyword";

		// TODO Auto-generated method stub
		return em.createQuery(keywordDiscSearch, Disc.class).setParameter("keyword", keyword).getResultList();
	}

	@Override
	public boolean destroyDisc(int id) {
		String discId = "SELECT d from Disc d where d.id = :id";
		Disc toDelete = em.createQuery(discId, Disc.class).setParameter("id", id).getSingleResult();
		if (em.contains(toDelete)) {
			try {
				em.remove(toDelete);
				em.flush();
			} catch (Exception e) {
				em.flush();
				e.printStackTrace();
			}
			return true;
		} else {
			em.flush();
			return false;
		}

	}

	@Override
	public Disc updateDisc(Disc disc) {
		Disc managedDisc = em.find(Disc.class, disc.getId());;
		System.out.println(disc);
		if (em.contains(disc)) {
			try {
				managedDisc.setManufacturer(disc.getManufacturer());
				managedDisc.setDiscModel(disc.getDiscModel());
				managedDisc.setMaxWeight(disc.getMaxWeight());
				managedDisc.setDiameterCM(disc.getDiameterCM());
				managedDisc.setHeightCM(disc.getHeightCM());
				managedDisc.setRimDepthCM(disc.getRimDepthCM());
				managedDisc.setInsideRimDiameterCM(disc.getInsideRimDiameterCM());
				managedDisc.setRimThicknessCM(disc.getRimThicknessCM());
				managedDisc.setRimDepthRatio(disc.getRimDepthRatio());
				managedDisc.setRimConfiguration(disc.getRimConfiguration());
				managedDisc.setCertificationNumber(disc.getCertificationNumber());
				managedDisc.setApprovedDate(disc.getApprovedDate());
				managedDisc.setFlexibilityKG(disc.getFlexibilityKG());
				managedDisc.setDiscClass(disc.getDiscClass());
				managedDisc.setMaxDiscWeightGR(disc.getMaxDiscWeightGR());;
//				managedDisc.set
				em.flush();
			} catch (Exception e) {
				em.flush();
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			em.flush();
		}
		System.out.println(disc);// TODO Auto-generated method stub
		return managedDisc;
	}

	@Override
	public Disc createDisc(Disc disc) {
		Disc newDisc = disc;
		em.persist(newDisc);
		em.flush();
		// TODO Auto-generated method stub
		return newDisc;
	}

}
