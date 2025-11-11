package com.example.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hostel.entity.Bed;

public interface BedRepo extends JpaRepository<Bed, Integer>  {

}
