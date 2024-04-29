package com.springBoot.SimpleKey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.SimpleKey.Entity.Renting;

@Repository
public interface RentingRepo extends JpaRepository<Renting, Integer>{

}
