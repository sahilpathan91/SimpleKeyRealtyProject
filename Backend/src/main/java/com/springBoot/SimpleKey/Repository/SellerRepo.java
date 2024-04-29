package com.springBoot.SimpleKey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.SimpleKey.Entity.Seller;

@Repository
public interface SellerRepo extends JpaRepository<Seller, Integer> {

}
