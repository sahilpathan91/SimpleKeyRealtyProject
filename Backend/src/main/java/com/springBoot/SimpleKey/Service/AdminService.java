package com.springBoot.SimpleKey.Service;

import com.springBoot.SimpleKey.Entity.Admin;

public interface AdminService {
	
	Admin createAdmin(Admin admin);
	Admin getAdminById(int id);
	void deleteAdmin(int id);
	Admin updateAdmin (Admin admin);
	

}
