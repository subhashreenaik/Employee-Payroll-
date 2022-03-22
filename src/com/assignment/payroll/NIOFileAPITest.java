package com.assignment.payroll;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NIOFileAPITest {
	private static String HOME =System.getProperty("user.home");
	private static String play_with_nio= "TempplayGround";
	String directory = "C:\\Users\\91824\\Desktop\\Assignment";
	File playpath=new File("C:\\Users\\91824\\Desktop\\contact.txt");
	Path play = Paths.get("C:\\Users\\91824\\Desktop\\Assignment");

	@Test
	public void givenPathWhenCheckedThenConfirm() throws IOException{
		Path homePath = Paths.get(HOME);
		Assert.assertTrue(Files.exists(homePath));
	

	
	
	
	if(playpath.exists()) 
		playpath.delete();
	//Assert.assertTrue(playpath.exists());
	
	
	//Create Directory
	playpath.createNewFile();
	Assert.assertTrue(playpath.exists());
	
	//create Files
	IntStream.range(1, 10).forEach(cntr ->{
		Path temp = Paths.get(play+"/Arithmetic"+cntr);
		Assert.assertTrue(Files.notExists(temp));
		try {
			Files.createFile(temp);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(Files.exists(temp));
		
	});
	
	//List files,directory
	try {
		  List<File> files = Files.list(Paths.get(directory))
		    .map(Path::toFile)
		    .filter(File::isFile)
		    .collect(Collectors.toList());

		  files.forEach(System.out::println);
		} catch (IOException e) {
			
			
		  e.printStackTrace();
		  
		}

}
}
