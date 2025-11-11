package com.example.hostel.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Hostel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hostelId;
	private String name;
	private String address;
	private Integer capacity;
	private String contactNumber;
	private String type;

	@OneToMany(mappedBy = "hostel", cascade = CascadeType.ALL)
	private List<Building> buildings;

	public int getHostelId() {
		return hostelId;
	}

	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

	@Override
	public String toString() {
		return "Hostel [hostelId=" + hostelId + ", name=" + name + ", address=" + address + ", capacity=" + capacity
				+ ", contactNumber=" + contactNumber + ", type=" + type + ", buildings=" + buildings + "]";
	}

	public Hostel(int hostelId, String name, String address, Integer capacity, String contactNumber, String type,
			List<Building> buildings) {
		super();
		this.hostelId = hostelId;
		this.name = name;
		this.address = address;
		this.capacity = capacity;
		this.contactNumber = contactNumber;
		this.type = type;
		this.buildings = buildings;
	}

}
