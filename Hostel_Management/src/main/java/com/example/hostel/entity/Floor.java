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
public class Floor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int floorId;
	private int floorNo;
	private int numRooms;

	@ManyToOne
	@JoinColumn(name = "building_id")
	private Building building;

	@OneToMany(mappedBy = "floor", cascade = CascadeType.ALL)
	private List<Room> rooms;

	public int getFloorId() {
		return floorId;
	}

	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	public int getNumRooms() {
		return numRooms;
	}

	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Floor [floorId=" + floorId + ", floorNo=" + floorNo + ", numRooms=" + numRooms + ", building="
				+ building + ", rooms=" + rooms + "]";
	}

	public Floor(int floorId, int floorNo, int numRooms, Building building, List<Room> rooms) {
		super();
		this.floorId = floorId;
		this.floorNo = floorNo;
		this.numRooms = numRooms;
		this.building = building;
		this.rooms = rooms;
	}

}
