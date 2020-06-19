package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerEntry {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Code 		: ");
		int code=sc.nextInt();
		System.out.println("Enter Name 		: ");
		String name=sc.next();
		System.out.println("Enter Address 	: ");
		String adr=sc.next();
		
		Customer customer=new Customer();
		customer.setCode(code); customer.setName(name); customer.setAddress(adr);
		
		//save the customer object to DB
		
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(customer);
		tr.commit();
		session.close();
		System.out.println("Record Added ..........!");

	}

}
