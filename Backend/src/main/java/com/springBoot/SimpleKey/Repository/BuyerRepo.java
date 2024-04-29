package com.springBoot.SimpleKey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.SimpleKey.Entity.Buyer;

@Repository
public interface BuyerRepo extends JpaRepository<Buyer, Integer> {

}
