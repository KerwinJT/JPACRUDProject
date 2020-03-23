package com.skilldistillery.jpacrud.data;


import java.util.List;

import com.skilldistillery.jpacrud.entities.Disc;


public interface DiscDAO {
	Disc findById(int id);
	List<Disc> findAll();
	List<String> allManufacturers();
	List<Disc> discsByManufacturer(String manu);
	List<Disc> discsByKeyword(String keyword);
	boolean destroyDisc(int id);
	Disc updateDisc(Disc disc);
	Disc createDisc(Disc disc);
	
	
}
