package com.samplearray;

public class Accesstheelement {

	public static void main(String[] args) {
		// Access the element of an Array
		String[] cars= {"VOLVO","BMW","FORD","TATA"};
		System.out.println(cars[1]);
        //change an array element
		cars[0]="opel";
		System.out.println(cars[0]);
		//Array length
		System.out.println(cars.length);
		//loop through an array 
		System.out.println("**************");
		for(int i = 0; i<cars.length;i++)
		System.out.println(cars[i]);
		//loop through an array with for-each
		System.out.println("**************");
		for(String i:cars)
		{
			System.out.println(i);
		
		}
		//multidimensional arrays
		System.out.println("***********");
		int[] [] mynumber= {{1,2,3},{5,6,7}};
		int x=mynumber[1][2];
		System.out.println(x);
	}

}
