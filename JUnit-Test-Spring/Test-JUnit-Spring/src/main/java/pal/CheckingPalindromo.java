package pal;

public class CheckingPalindromo {
	
	public String method1(String str) {


		// Custom all the variables
		int count = 0;
		String backwards = "";

		// Creating array of string length 
		// using length() method 
		char[] ch = new char[str.length()]; 

		// Copying character by character into array 
		// using for each loop 
		for (int i = str.length()-1; i > -1; i--) { 

			ch[count] = str.charAt(i); 
			System.out.println("prueba: " + ch[i]);
			count++;
		} 

		// Printing the elements of array 
		// using for each loop 
		for (char c : ch) { 
			System.out.println(c); 
		} 

		backwards = String.valueOf(ch);
		System.out.println(backwards);
		
		return backwards;


	}

}
