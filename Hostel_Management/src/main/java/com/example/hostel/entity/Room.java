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
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomId;
	private int roomNo;
	private String roomType; // regular delux

	@ManyToOne
	@JoinColumn(name = "floor_id")
	private Floor floor;

	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<Bed> beds;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	public List<Bed> getBeds() {
		return beds;
	}

	public void setBeds(List<Bed> beds) {
		this.beds = beds;
	}

	public Room(int roomId, int roomNo, String roomType, Floor floor, List<Bed> beds) {
		super();
		this.roomId = roomId;
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.floor = floor;
		this.beds = beds;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomNo=" + roomNo + ", roomType=" + roomType + ", floor=" + floor
				+ ", beds=" + beds + "]";
	}

}
