package com.springBoot.SimpleKey.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springBoot.SimpleKey.Entity.Admin;
import com.springBoot.SimpleKey.Repository.AdminRepo;
import com.springBoot.SimpleKey.Service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminRepo adminRepo;

	@Override
	public Admin createAdmin(Admin admin) {
		Admin ad = adminRepo.save(admin);
		return ad;
	}

	@Override
	public Admin getAdminById(int id) {
		Optional<Admin> ad = adminRepo.findById(id);
		
		if(ad.isPresent()) {
			return ad.get();
		}
		
		return null;
	}

	@Override
	public void deleteAdmin(int id) {
		adminRepo.deleteById(id);
		
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		Admin ExistingAdmin = adminRepo.findById(admin.getAId()).get();
		ExistingAdmin.setAName(admin.getAName());
		ExistingAdmin.setAEmail(admin.getAEmail());
		ExistingAdmin.setAPass(admin.getAPass());
		
		Admin updateAdmin = adminRepo.save(ExistingAdmin);
		return updateAdmin;
	}

	
	}
	
	


