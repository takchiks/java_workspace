package com.cogent.files;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileObjectWriting {
	public static void main(String[] args) {
		File file = new File("/home/taku/newDir/game.txt");
		Player p1 = new Player("Taku",2344,9000);
		try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));){
			
		oos.writeObject(p1);
		oos.flush();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Done!");
		
		
	}
}
