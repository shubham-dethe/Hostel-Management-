package com.example.hostel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Bed {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bedId;

	private int bedNo;
	private String status; // Available Occupied
	private int price;
	private String sharing; // 1 Sharing 2 Sharing

	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;

	public int getBedId() {
		return bedId;
	}

	public void setBedId(int bedId) {
		this.bedId = bedId;
	}

	public int getBedNo() {
		return bedNo;
	}

	public void setBedNo(int bedNo) {
		this.bedNo = bedNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSharing() {
		return sharing;
	}

	public void setSharing(String sharing) {
		this.sharing = sharing;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Bed(int bedId, int bedNo, String status, int price, String sharing, Room room) {
		super();
		this.bedId = bedId;
		this.bedNo = bedNo;
		this.status = status;
		this.price = price;
		this.sharing = sharing;
		this.room = room;
	}

	@Override
	public String toString() {
		return "Bed [bedId=" + bedId + ", bedNo=" + bedNo + ", status=" + status + ", price=" + price + ", sharing="
				+ sharing + ", room=" + room + "]";
	}

}
