package com.skilldistillery.jpacrud.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DiscTest {

	private static EntityManagerFactory emf ;
	private EntityManager em;
	private Disc disc;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("DiscPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		disc = em.find(Disc.class, 200);
	}

	@AfterEach
	void tearDown() throws Exception {
		
	em.close();
	disc = null;
	}

	@Test
	@DisplayName("test all mappings are correct")
	void test1() {
		assertNotNull(disc);
		assertEquals("Essence", disc.getDiscModel());
		assertEquals("Discmania", disc.getManufacturer());
		assertEquals(174.3, disc.getMaxWeight());
		assertEquals(21.0, disc.getDiameterCM());
		assertEquals(1.8, disc.getHeightCM());
		assertEquals(1.2, disc.getRimDepthCM());
		assertEquals(17.4, disc.getInsideRimDiameterCM());
		assertEquals(1.8, disc.getRimThicknessCM());
		assertEquals(5.7, disc.getRimDepthRatio());
		assertEquals(33.25, disc.getRimConfiguration());
		assertEquals("20-22", disc.getCertificationNumber());
		assertEquals(LocalDate.parse("2020-03-05"), disc.getApprovedDate());
		assertEquals(11.59, disc.getFlexibilityKG());
		assertEquals("N/A", disc.getDiscClass());
		assertEquals(0.0, disc.getMaxDiscWeightGR());
	}

}
