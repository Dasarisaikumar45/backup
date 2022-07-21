package com.ibm.emp;
public class Employee {
private int empNo;
private String empName;
private double salary;


public Employee() {
	
}

public Employee(int empNo, String empName, double salary) {
	this.empNo = empNo;
	this.empName = empName;
	this.salary = salary;
}

public double getSalary() {
	return salary;
}


public void paySlip() {
	System.out.println("Emp No:"+ empNo);
	System.out.println("Emp Name:"+ empName);
	System.out.println("Salary:"+ salary);
}

public void payslip() {
	// TODO Auto-generated method stub
	
}

public double getsalary() {
	// TODO Auto-generated method stub
	return 0;
}

}