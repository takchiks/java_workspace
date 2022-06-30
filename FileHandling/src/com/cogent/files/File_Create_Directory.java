package com.cogent.files;

import java.io.File;

public class File_Create_Directory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("/home/taku/newDir");
		if(file.mkdir())
			System.out.println("Created");
		else 
			System.out.println("Not Created");
	

	}

}
