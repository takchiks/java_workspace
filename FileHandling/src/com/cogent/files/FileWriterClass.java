package com.cogent.files;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterClass {
	public static void main(String[] args) throws IOException {
		File file = new File("/home/taku/taku.txt");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("Hello its me\n I am very happy, Happiest in the world Ichoo".getBytes());
		bos.flush();
		{
			System.out.println("Done");
		}
	}
}
