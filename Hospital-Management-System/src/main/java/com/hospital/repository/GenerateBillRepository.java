package com.hospital.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.entity.GenerateBill;

@Repository
public interface GenerateBillRepository extends JpaRepository<GenerateBill, Long> {

	
}
