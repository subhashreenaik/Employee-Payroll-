package com.assignment.payroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public enum IOService{
		CONSOLE_IO,FILE_IO,DB_IO,REST_IO
	}
	
List<EmployeePayRollData> 	employeelist ;
public	EmployeePayrollService(){
		
	}
public	EmployeePayrollService(ArrayList<EmployeePayRollData> employeelist){
	this.employeelist =employeelist;
}
/**
 * This method is used to enter information about employee
 * @param consoleInputReader
 */
private void readEmployeePayRollData(Scanner consoleInputReader) {
	System.out.println("Enter Employee Id :");
	int id = consoleInputReader.nextInt();
	System.out.println("Enter Employee Name :");
	String name =consoleInputReader.next();
	System.out.println("Enter Emplyee Salary :");
	double salary=consoleInputReader.nextDouble();
	employeelist.add(new EmployeePayRollData(id, name, salary));
}
private void writeEmployeePayrollData() {
	//System.out.println("Writing Payroll Roaster to console "+employeelist);
	new EmployeePayRollFileIOService().writeData(employeelist);
	
}

public static void main(String[] args)
{
	
	/*
	 * Here arraylist of Employeepayroll object is created
	 */
	ArrayList<EmployeePayRollData> 	employeelist= new ArrayList<EmployeePayRollData>();
	EmployeePayrollService  employeeService = new EmployeePayrollService(employeelist);
	Scanner consoleInputReader =new Scanner(System.in);
	/*
	 * calling the employeepayrolldata method
	 */
	employeeService.readEmployeePayRollData(consoleInputReader);
	employeeService.writeEmployeePayrollData();
	/*
	 * calling printData method
	 */
	new EmployeePayRollFileIOService().printData();
	

}

}
