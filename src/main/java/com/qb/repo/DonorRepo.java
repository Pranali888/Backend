package com.qb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qb.entity.Donor;

public interface DonorRepo extends JpaRepository<Donor, Integer>{

}
