package com.cogent.mock;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConsonantString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(consonant("Java"));

	}
	public static String consonant(String str) {
		char [] arr = str.toCharArray();
		Set<Character> set = new HashSet<Character>(); 
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		set.add('A');
		set.add('E');
		set.add('I');
		set.add('O');
		set.add('U');
		
		for(int i = 0; i<arr.length;i++) {
			if(!(set.contains(arr[i]))) {
				arr[i]= (char) (arr[i]+1); 
			}
		}
		str = "";
		for(char c:arr) {
			str+=c;
		}
		
		
		return str;
	}

}
