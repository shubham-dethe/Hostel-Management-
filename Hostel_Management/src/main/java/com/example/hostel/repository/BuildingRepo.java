package com.example.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hostel.entity.Building;

public interface BuildingRepo extends JpaRepository<Building, Integer>{

}
