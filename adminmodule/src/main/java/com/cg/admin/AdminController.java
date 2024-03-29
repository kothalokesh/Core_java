package com.cg.admin;
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	
	 @Autowired
	 private AdminService service;
	 
	 //Retrieve all rows from database
	 @GetMapping("/admins")
	 public List<Admin> List() 
	 {
		 return service.ListAll(); 
	 }
	 //Retrive specific record from database
	 @GetMapping("/admins/{id}") 
	 public ResponseEntity<Admin> get (@PathVariable Integer id) 
	 { 
			Admin admin=service.get(id); 
			 return new ResponseEntity<Admin> (admin, HttpStatus.OK);
	 }
	 
	 //RESTful API methods for Create operation 
	 @PostMapping("/admins")
	 public void  add(@RequestBody Admin admin)
	 {
		 //System.out.println(admin.getId()+"/n"+admin.getName()+"/n"+admin.getPassword());
		 service.save(admin);
	 }

	//RESTful API methods for Update operation
	 @PutMapping("/admins")
	 public ResponseEntity<?> update (@RequestBody Admin admin,@PathVariable Integer id) 
	 { 
		 try {
			Admin existAdmin=service.get(id); 
			service.save(admin);
			 return new ResponseEntity<Admin> (admin, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	 }
	 
	//RESTful API methods for Delete operation
	 @DeleteMapping("/admins/{id}")
	 public void delete(@PathVariable Integer id)
	 {
		 service.delete(id);
	 }
}
