package com.springBoot.SimpleKey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.SimpleKey.Entity.Property;

@Repository
public interface PropertyRepo extends JpaRepository<Property, Integer>{

}
