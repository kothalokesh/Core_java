package com.cg.admin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//created class as admin
@Entity                      //
public class Admin {
	private Long id;            //using id as private and Long( wrapper class)
	private String name;        //using name as private and String (character) 
	private String password;    //using password as private and String (character) 
	
	
	//created constructor for id,name,password
	private Admin(Long id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

    
   //generate one default constructor because calling for crud operations
	
	private Admin() {
		super();
	}
   
	//generate getter and setter methods for id,name,password
	
    @Id                                              
    //@Id specifies the primary key
    
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
//password
	public void setPassword(String password) {
		this.password = password;
	}

     //generated Tostring for different colums are using in a table
	
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
}
