package com.example.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hostel.entity.Hostel;

public interface HostelRepo extends JpaRepository<Hostel, Integer>{

}
