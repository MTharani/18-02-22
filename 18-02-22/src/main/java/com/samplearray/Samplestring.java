package com.samplearray;

public class Samplestring {

	public static void main(String[] args) {
		// get length of a string
		String var="Hello World";
		String var1=" Welcome";
		String var2=" welcome";
		String var3="This is \"JAVA\" class";
		//join the two string
		String join=var.concat( var1);
		System.out.println(var);
		System.out.println("**JOIN THE TWO STRING**");
		System.out.println("joing the two string:"+join);
		//length of the string
		int length=var.length();
		System.out.println("Length of String is:"+length);
        // Compare two string
		boolean result1=var.equals(var1);
		boolean result2=var1.equals(var2);
		System.out.println("**COMPARE THE TWO STRING**");
		System.out.println("RESULT1:"+result1);
		System.out.println("RESULT2:"+result2);
		//Escape character
		System.out.println("**ESCAPE CHARACTER BY DOUBLE QUOTES**");
		System.out.println(var3);
		
	}

}
