package com.cogent.exceptions;

public class Manager69 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ja";
		String s2 = "va";
		String s3 = new String("ja");
		String s4 = new String("va");
		String s5 = "java";
		String s6 = new String("java");
		String s7 = s1+s2;
		String s8 = s3+s4;
		String s9 = s1+s4;
		String s10 = s3+s2;
		String s11 = "ja"+"va";
		String s12 = s1+"va";
		String s13 = s1.concat(s2);
		String s14 = "ja".concat(s2);
		String s15 = "ja".concat("va");
		String s16 = s1.concat("va");
//		System.out.println();

		System.out.println((s5==s6)+" "+s6);
		System.out.println((s5==s7)+" "+s7);
		System.out.println((s5==s8)+" "+s8);
		System.out.println((s5==s9)+" "+s9);
		System.out.println((s5==s10)+" "+s10);
		System.out.println("hello"+(s5==s11)+" "+s11);
		System.out.println((s5==s12)+" "+s12);
		System.out.println((s5==s13)+" "+s13);
		System.out.println((s5==s14)+" "+s14);
		System.out.println((s5==s15)+" "+s15);
		System.out.println((s5==s16)+" "+s16);
		Double d = 7.9;
		System.out.println(d.intValue());
		
		
	}

}
