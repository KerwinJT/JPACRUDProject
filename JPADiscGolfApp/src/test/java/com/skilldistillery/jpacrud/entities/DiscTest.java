package com.skilldistillery.jpacrud.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
		disc = em.find(Disc.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		
	em.close();
	disc = null;
	}

	@Test
	@DisplayName("test that disc database is being accesed")
	void test1() {
		assertNotNull(disc);
		assertEquals("NukeTest", disc.getDiscModel());
	}

}
