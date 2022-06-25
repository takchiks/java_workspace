package com.cogent.mock;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validateUsername("ttttttt_job"));

	}
	public static boolean validateUsername(String str) {
		if(str.length()<12) {
			return false;
		}
		return str.endsWith("_job");
	}
	public static boolean matchMethod(String s)
	{
		Pattern p=Pattern.compile("[A-Za-z0-9]{8}_job");
		Matcher m=p.matcher(s);
		boolean b=m.matches();
		return b;
	}

}
