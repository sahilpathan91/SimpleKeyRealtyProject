package com.springBoot.SimpleKey.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.SimpleKey.Entity.PropertyOwner;

@Repository
public interface PropertyOwnerRepo extends JpaRepository<PropertyOwner, Integer> {

}
