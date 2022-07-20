package com.cg.admin;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class AdminService {

	@Autowired     
	private AdminRepository repository;
	
	
	public List<Admin> ListAll() {
		return repository.findAll();
	}
	
	public Admin get(int id) {
		
		return repository.findById(id).get();
	}

	public void save(Admin admin) {
     repository.save(admin);
		
	}

	public void delete(int id) 
	{
		repository.deleteById(id);
		
	}

	
}
