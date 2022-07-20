package com.cg.admin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//created class as admin
@Entity                      
public class Admin {
	
	@Id                                              
    //@Id specifies the primary key
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;            //using id as private and int
	private String name;        //using name as private and String (character) 
	private String password;    //using password as private and String (character) 
	
	
	//created constructor for id,name,password
	private Admin(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
    //created default constructor 
	private Admin() {
	
	}
	//generate getter and setter methods for id,name,password

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
