package com.tns.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em=factory.createEntityManager();  
        em.getTransaction().begin();
        
        //employee
        Employee employee=new Employee();
        employee.setName("lokesh");
        employee.setSalary(50000);
        em.persist(employee);
        
        
        Manager manager=new Manager();
        manager.setName("manoj");
        manager.setSalary(25000);
        manager.setDepartmentName("sales");
        em.persist(manager);
        
        
        manager.setName("ayesh");
        manager.setSalary(35000);
        manager.setDepartmentName("selling");
        em.persist(manager);
        
        
        em.getTransaction().commit();
        System.out.println("Added one employee to one manager in database");
        em.close();
        factory.close();
        
	}
	
}
