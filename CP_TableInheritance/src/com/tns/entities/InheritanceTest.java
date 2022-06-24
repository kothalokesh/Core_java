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
 
 Employee employee=new Employee();
 employee.setName("ram");
 employee.setSalary(35000);
 em.persist(employee);
 
 Manager manager=new Manager();
 manager.setName("charan");
 manager.setSalary(45000);
 manager.setDepartmentName("selling");

 em.persist(manager);
 
 em.getTransaction().commit();
 System.out.println("added one employee and manager in database");
em.close();
factory.close();
 
	}

}
