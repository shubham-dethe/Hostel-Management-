package com.example.hostel.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Building {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int buildingId;

	private String blockName; // a b c
	private String noofFloors;
	private String wardenName;
	private String securityContact;

	@ManyToOne
	@JoinColumn(name = "hostel_id")
	private Hostel hostel;

	@OneToMany(mappedBy = "building", cascade = CascadeType.ALL)
	private List<Floor> floors;

	public int getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(int buildingId) {
		this.buildingId = buildingId;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public String getNoofFloors() {
		return noofFloors;
	}

	public void setNoofFloors(String noofFloors) {
		this.noofFloors = noofFloors;
	}

	public String getWardenName() {
		return wardenName;
	}

	public void setWardenName(String wardenName) {
		this.wardenName = wardenName;
	}

	public String getSecurityContact() {
		return securityContact;
	}

	public void setSecurityContact(String securityContact) {
		this.securityContact = securityContact;
	}

	public Hostel getHostel() {
		return hostel;
	}

	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}

	public List<Floor> getFloors() {
		return floors;
	}

	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	}

	@Override
	public String toString() {
		return "Building [buildingId=" + buildingId + ", blockName=" + blockName + ", noofFloors=" + noofFloors
				+ ", wardenName=" + wardenName + ", securityContact=" + securityContact + ", hostel=" + hostel
				+ ", floors=" + floors + "]";
	}

	public Building(int buildingId, String blockName, String noofFloors, String wardenName, String securityContact,
			Hostel hostel, List<Floor> floors) {
		super();
		this.buildingId = buildingId;
		this.blockName = blockName;
		this.noofFloors = noofFloors;
		this.wardenName = wardenName;
		this.securityContact = securityContact;
		this.hostel = hostel;
		this.floors = floors;
	}

}
