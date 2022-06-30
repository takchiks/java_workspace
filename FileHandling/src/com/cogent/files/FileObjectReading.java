package com.cogent.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileObjectReading {
	public static void main(String[] args) {
		File file = new File("/home/taku/newDir/game.txt");
		try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(file));) {
			
			Player p1 = (Player) oos.readObject();
			System.out.println(p1);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
