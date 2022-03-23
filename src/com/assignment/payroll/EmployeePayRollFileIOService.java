package com.assignment.payroll;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/**
 * This class is created for defining IO related methods
 * @author subhashree
 *
 */
public class EmployeePayRollFileIOService {
/**
 * This method is used to write the list of data into a textfile.
 * @param employeelist -list of employee
 */
	public void writeData(List<EmployeePayRollData> employeelist) {
		StringBuffer temp=new StringBuffer();
		employeelist.forEach(employee ->{
			String data=employee.toString().concat("\n");
			temp.append(data);
		});
		try {
			Files.write(Paths.get("C:\\Users\\91824\\Desktop\\contact.txt"),temp.toString().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * This method is used to print the list of data from a text file to console.
	 * 
	 */
	public void printData() {
		try {
			Files.lines(new File("C:\\Users\\91824\\Desktop\\contact.txt").toPath())
			.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * This method is used to count the number of entries to store
	 * into file.
	 */
	public long countEntries() {
		long entries=0;
		try {
			entries=Files.lines(new File("C:\\Users\\91824\\Desktop\\contact.txt").toPath()).count();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entries;
	}
	
	
}



