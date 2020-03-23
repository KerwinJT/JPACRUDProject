package com.skilldistillery.jpacrud.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disc {
	// Fields

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String manufacturer;//

	@Column(name = "disc_model") //
	private String discModel;
	
	@Column(name = "max_weight") //
	private Double maxWeight;
	
	@Column(name = "diameter_CM")
	private Double diameterCM;
	
	@Column(name = "height_CM")
	private Double heightCM;
	
	@Column(name = "rim_depth_CM")
	private Double rimDepthCM;
	
	@Column(name = "inside_rim_diameter_CM")
	private Double insideRimDiameterCM;
	
	@Column(name = "rim_thickness_CM")
	private Double rimThicknessCM;
	
	@Column(name = "rim_depth_diameter_ratio_percentage")
	private Double rimDepthRatio;
	
	@Column(name = "rim_configuration")
	private Double rimConfiguration;
	
	@Column(name = "certification_number")
	private String certificationNumber;
	
	@Column(name = "approved_date") //
	private LocalDate approvedDate;
	
	@Column(name = "flexibility_kg")
	private Double flexibilityKG;
	
	@Column(name = "class")
	private String discClass;
	
	@Column(name = "max_weight_vint_gr")
	private Double maxDiscWeightGR;

	// Methods Begin

	public Disc(String manufacturer, String discModel, Double maxWeight, Double diameterCM, Double heightCM,
			Double rimDepthCM, Double insideRimDiameterCM, Double rimThicknessCM, Double rimDepthRatio,
			Double rimConfiguration, String certificationNumber, LocalDate approvedDate, Double flexibilityKG,
			String discClass, Double maxDiscWeight) {
		super();
		this.manufacturer = manufacturer;
		this.discModel = discModel;
		this.maxWeight = maxWeight;
		this.diameterCM = diameterCM;
		this.heightCM = heightCM;
		this.rimDepthCM = rimDepthCM;
		this.insideRimDiameterCM = insideRimDiameterCM;
		this.rimThicknessCM = rimThicknessCM;
		this.rimDepthRatio = rimDepthRatio;
		this.rimConfiguration = rimConfiguration;
		this.certificationNumber = certificationNumber;
		this.approvedDate = approvedDate;
		this.flexibilityKG = flexibilityKG;
		this.discClass = discClass;
		this.maxDiscWeightGR = maxDiscWeight;
	}

	public Disc() {
	}

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

	public Double getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(Double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public Double getDiameterCM() {
		return diameterCM;
	}

	public void setDiameterCM(Double diameterCM) {
		this.diameterCM = diameterCM;
	}

	public Double getHeightCM() {
		return heightCM;
	}

	public void setHeightCM(Double heightCM) {
		this.heightCM = heightCM;
	}

	public Double getRimDepthCM() {
		return rimDepthCM;
	}

	public void setRimDepthCM(Double rimDepthCM) {
		this.rimDepthCM = rimDepthCM;
	}

	public Double getInsideRimDiameterCM() {
		return insideRimDiameterCM;
	}

	public void setInsideRimDiameterCM(Double insideRimDiameterCM) {
		this.insideRimDiameterCM = insideRimDiameterCM;
	}

	public Double getRimThicknessCM() {
		return rimThicknessCM;
	}

	public void setRimThicknessCM(Double rimThicknessCM) {
		this.rimThicknessCM = rimThicknessCM;
	}

	public Double getRimDepthRatio() {
		return rimDepthRatio;
	}

	public void setRimDepthRatio(Double rimDepthRatio) {
		this.rimDepthRatio = rimDepthRatio;
	}

	public Double getRimConfiguration() {
		return rimConfiguration;
	}

	public void setRimConfiguration(Double rimConfiguration) {
		this.rimConfiguration = rimConfiguration;
	}

	public String getCertificationNumber() {
		return certificationNumber;
	}

	public void setCertificationNumber(String certificationNumber) {
		this.certificationNumber = certificationNumber;
	}

	public LocalDate getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDate approvedDate) {
		this.approvedDate = approvedDate;
	}

	public Double getFlexibilityKG() {
		return flexibilityKG;
	}

	public void setFlexibilityKG(Double flexibilityKG) {
		this.flexibilityKG = flexibilityKG;
	}

	public String getDiscClass() {
		return discClass;
	}

	public void setDiscClass(String discClass) {
		this.discClass = discClass;
	}

	public Double getMaxDiscWeightGR() {
		return maxDiscWeightGR;
	}

	public void setMaxDiscWeightGR(Double maxDiscWeightGR) {
		this.maxDiscWeightGR = maxDiscWeightGR;
	}

	@Override
	public String toString() {
		return "Disc [id=" + id + ", manufacturer=" + manufacturer + ", discModel=" + discModel + ", maxWeight="
				+ maxWeight + ", diameterCM=" + diameterCM + ", heightCM=" + heightCM + ", rimDepthCM=" + rimDepthCM
				+ ", insideRimDiameterCM=" + insideRimDiameterCM + ", rimThicknessCM=" + rimThicknessCM
				+ ", rimDepthRatio=" + rimDepthRatio + ", rimConfiguration=" + rimConfiguration
				+ ", certificationNumber=" + certificationNumber + ", approvedDate=" + approvedDate + ", flexibilityKG="
				+ flexibilityKG + ", discClass=" + discClass + ", maxDiscWeight=" + maxDiscWeightGR + ", getId()="
				+ getId() + ", getManufacturer()=" + getManufacturer() + ", getDiscModel()=" + getDiscModel()
				+ ", getMaxWeight()=" + getMaxWeight() + ", getDiameterCM()=" + getDiameterCM() + ", getHeightCM()="
				+ getHeightCM() + ", getRimDepthCM()=" + getRimDepthCM() + ", getInsideRimDiameterCM()="
				+ getInsideRimDiameterCM() + ", getRimThicknessCM()=" + getRimThicknessCM() + ", getRimDepthRatio()="
				+ getRimDepthRatio() + ", getRimConfiguration()=" + getRimConfiguration()
				+ ", getCertificationNumber()=" + getCertificationNumber() + ", getApprovedDate()=" + getApprovedDate()
				+ ", getFlexibilityKG()=" + getFlexibilityKG() + ", getDiscClass()=" + getDiscClass()
				+ ", getMaxDiscWeight()=" + getMaxDiscWeightGR() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Disc(String manufacturer, String discModel, Double maxWeight, Double diameterCM, Double heightCM,
			Double rimDepthCM, Double insideRimDiameterCM, Double rimThicknessCM) {
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
