package com.subba.service;

import java.util.ArrayList;
import java.util.List;

import com.subba.beans.Employee;

public class EmployeeService {
	
	static List<Employee> emps;
	
	public EmployeeService(){
		emps=new ArrayList<Employee>();
		Employee e1=new Employee(1234,"Patel");
		Employee e2=new Employee(1,"Harshita");
		Employee e3=new Employee(2,"Renu");
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
	}

	public String getEmployeeName(int id){
		String response="Invalid ID";
		for(Employee e:emps){
			if(id==e.getId()){
				response=e.getName();
			}
		}
		return response;
		//new Employee().getName()
	}
	
	public int getEmployeeId(String name){
		return 0;
	}
}
