package com.skilldistillery.jpacrud.data;


import java.util.List;

import com.skilldistillery.jpacrud.entities.Disc;


public interface DiscDAO {
	Disc findById(int id);
	List<Disc> findAll();
	
}
