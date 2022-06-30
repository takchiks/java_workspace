package com.cogent.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/home/taku/taku.txt");
		BufferedInputStream br=null;
		try {
			FileInputStream fis = new FileInputStream(file);
//			FileInputStream isr = new FileInputStream(fis);
			br = new BufferedInputStream(fis);
			int line;
			while(!((line=br.read())==-1))
			System.out.println((char)line);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
