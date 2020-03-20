package com.skilldistillery.jpacrud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disc {
	//Fields
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String manufacturer;
	
	@Column(name = "disc_model")
	private String discModel;
	@Column(name = "max_weight")
	private double maxWeight;
	@Column(name = "diameter_CM")
	private double diameterCM;
	@Column(name = "height_CM")
	private double heightCM;
	@Column(name = "rim_depth_CM")
	private double rimDepthCM;
	@Column(name = "inside_rim_diameter_CM")
	private double insideRimDiameterCM;
	@Column(name = "rim_thickness_CM")
	private double rimThicknessCM;
	
	//Methods Begin
	public Disc() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getDiscModel() {
		return discModel;
	}

	public void setDiscModel(String discModel) {
		this.discModel = discModel;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getDiameterCM() {
		return diameterCM;
	}

	public void setDiameterCM(double diameterCM) {
		this.diameterCM = diameterCM;
	}

	public double getHeightCM() {
		return heightCM;
	}

	public void setHeightCM(double heightCM) {
		this.heightCM = heightCM;
	}

	public double getRimDepthCM() {
		return rimDepthCM;
	}

	public void setRimDepthCM(double rimDepthCM) {
		this.rimDepthCM = rimDepthCM;
	}

	public double getInsideRimDiameterCM() {
		return insideRimDiameterCM;
	}

	public void setInsideRimDiameterCM(double insideRimDiameterCM) {
		this.insideRimDiameterCM = insideRimDiameterCM;
	}

	public double getRimThicknessCM() {
		return rimThicknessCM;
	}

	public void setRimThicknessCM(double rimThicknessCM) {
		this.rimThicknessCM = rimThicknessCM;
	}

	@Override
	public String toString() {
		return "Disc [id=" + id + ", manufacturer=" + manufacturer + ", discModel=" + discModel + ", maxWeight="
				+ maxWeight + ", diameterCM=" + diameterCM + ", heightCM=" + heightCM + ", rimDepthCM=" + rimDepthCM
				+ ", insideRimDiameterCM=" + insideRimDiameterCM + ", rimThicknessCM=" + rimThicknessCM + "]";
	}

	public Disc(String manufacturer, String discModel, double maxWeight, double diameterCM, double heightCM,
			double rimDepthCM, double insideRimDiameterCM, double rimThicknessCM) {
		super();
		this.manufacturer = manufacturer;
		this.discModel = discModel;
		this.maxWeight = maxWeight;
		this.diameterCM = diameterCM;
		this.heightCM = heightCM;
		this.rimDepthCM = rimDepthCM;
		this.insideRimDiameterCM = insideRimDiameterCM;
		this.rimThicknessCM = rimThicknessCM;
	}
	
	
	
}
