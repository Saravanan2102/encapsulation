package org.test;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<>();
		
		Employee e=new Employee();
		
		e.setId(200);
		e.setName("saran");
		e.setPhno(9976180453l);
		
		
		Employee e1 = new Employee();
		
		e1.setId(300);
		e1.setName("sarath");
		e1.setPhno(8098425380l);
		
		
		l.add(e);
		l.add(e1);
		
		System.out.println(l.get(0).getPhno());
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getId());
			System.out.println(l.get(i).getName());
			System.out.println(l.get(i).getPhno());
		}
		
		
	}

}
