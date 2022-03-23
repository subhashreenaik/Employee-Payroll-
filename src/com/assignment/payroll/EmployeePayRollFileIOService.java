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
	
	
	
}



