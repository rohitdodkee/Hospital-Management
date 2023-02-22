package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.entity.Pharmacist;

@Repository
public interface PharmacistRepository extends JpaRepository<Pharmacist, Long>{

}
