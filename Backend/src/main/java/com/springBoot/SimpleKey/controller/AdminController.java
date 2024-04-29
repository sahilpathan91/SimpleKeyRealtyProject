package com.springBoot.SimpleKey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.SimpleKey.Entity.Admin;
import com.springBoot.SimpleKey.Service.AdminService;

import jakarta.validation.Valid;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/admin")
	public Admin saveAdmin(@RequestBody @Valid Admin admin) {
		return adminService.createAdmin(admin);
		
	}
	
	@GetMapping("/admin/{id}")
	public Admin getAdminById(@PathVariable("id")int id) {
		return adminService.getAdminById(id);
	}
	
	@DeleteMapping("/admin/delete/{id}")
	public void deleteAdmin(@PathVariable int id) {
		System.out.println("Data deleted successsfully");
	    
	}
	@PutMapping("/admin/update/{id}")
	public Admin updateAdmin(@PathVariable("id")int id, @RequestBody @Valid Admin admin) {
		admin.setAId(id);
		Admin updateAdmin = adminService.updateAdmin(admin);
		return updateAdmin;
		
		
		
		
	}

}
