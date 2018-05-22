public class SortAndCompare {
	String str1;
	String str2;

	public SortAndCompare(String str1, String str2) {
		// TODO Auto-generated constructor stub
		this.str1 = str1;
		this.str2 = str2;		
	}
	
	private String sort(String s) {
		char[] s_array = s.toCharArray();
		java.util.Arrays.sort(s_array);
		return new String(s_array);
		
		//The Time Complexity of this sorting algorithm is O[nlog(n)]
	}
	
	public boolean checkEquality() {
		String s_arr1 = sort(str1);
		String s_arr2 = sort(str2);
		
		System.out.println("Sorted string array 1 is :" +s_arr1);
		System.out.println("Sorted string array 2 is :" +s_arr2);
		
		if(!s_arr1.equals(s_arr2)) {
			return false;
		}
		return true;
	}
}

//Class //Second Method of checking if First String is permjutation of Second..java

//Class CheckLengthAndCompare.java

import java.util.Arrays;
public class CheckLengthAndCompare {
	String str1;
	String str2;

	public CheckLengthAndCompare(String str1, String str2) {
		// TODO Auto-generated constructor stub
		this.str1 = str1;
		this.str2=str2;
	}
	
	public boolean checkPermutation() {
		
		//If the 2 strings have different lengths, they 
		//cannot be permutations of each other
		
		if (this.str1.length()!=this.str2.length()) {
			return false;
		}
		
		//Assumption - 128 characters are used to create Strings
		int [] letters_count = new int [128];
		
		//Convert the strings into character array to make them iterate
		
		char[] str1_array = this.str1.toCharArray();
		char[] str2_array = this.str2.toCharArray();
		
		//Check the First String by iterating over it and add the 
		//number of occurrences for each character by incrementing the 
		//count in letters_count array
		
		for(char ch: str1_array) {
			int val = ch; // Get ASCII value of the character
			letters_count[val]++;
		}
		
		//Check the Second String by iterating over it for number of occurrences
		//of a character in the string. Compare it with previous string by 
		//decrementing it from letters_count array 
		
		for(char ch: str2_array) {
			int val = ch; // Get ASCII value of the character
			letters_count[val]--;
			
			if(letters_count[val] < 0) {
				//The 2nd string has more occurrence of character
				//in comparison with 1st String
				
				return false;
			}
		}
		
		
		return true;
	}

}



/*----MAIN FUNCTION---------------------------------------------------------*/



public class Entry {
	
	
	public static void main(String args[]) {
		String str1 = "abbccdd";
		String str2 = "ddabcbc";
		String str3 = "abcde";
		String str4 = "cdefg";
		String str5 = "abcde";
		String str6 = "abcdefg";
		
		System.out.println("Method - 1 : Sort and Equate \nMethod Complexity : O(log(n)))\n");
		
		SortAndCompare sac1 = new  SortAndCompare(str1, str2);
		SortAndCompare sac2 = new  SortAndCompare(str3, str4);
		SortAndCompare sac3 = new  SortAndCompare(str5, str6);
		
		CheckLengthAndCompare clac1 = new CheckLengthAndCompare(str1, str2);
		CheckLengthAndCompare clac2 = new CheckLengthAndCompare(str3, str4);
		CheckLengthAndCompare clac3 = new CheckLengthAndCompare(str5, str6);
		
		
		
		Boolean flag1 = sac1.checkEquality();
		
		Boolean flag2 = sac2.checkEquality();
		
		Boolean flag3 = sac3.checkEquality();
		
		
		if(flag1) {
			System.out.println(str1+" and "+str1+" are permutations of each other");
		}else {
			System.out.println(str1+" and "+str1+" are not permutations of each other");
		}
		
		if(flag2) {
			System.out.println(str3+" and "+str4+" are permutations of each other");
		}else {
			System.out.println(str3+" and "+str4+" are not permutations of each other");
		}
		
		if(flag3) {
			System.out.println(str5+" and "+str6+" are permutations of each other");
		}else {
			System.out.println(str5+" and "+str6+" are not permutations of each other");
		}
		
		
		System.out.println("\n\nMethod - 2 :Check Length and Compare Method \nMethod Complexity : O[N]\n");
		
		Boolean flag4 = clac1.checkPermutation();
		
		Boolean flag5 = clac2.checkPermutation();
		
		Boolean flag6 = clac3.checkPermutation();
		
		if(flag4) {
			System.out.println(str1+" and "+str1+" are permutations of each other");
		}else {
			System.out.println(str1+" and "+str1+" are not permutations of each other");
		}
		
		if(flag5) {
			System.out.println(str3+" and "+str4+" are permutations of each other");
		}else {
			System.out.println(str3+" and "+str4+" are not permutations of each other");
		}
		
		if(flag6) {
			System.out.println(str5+" and "+str6+" are permutations of each other");
		}else {
			System.out.println(str5+" and "+str6+" are not permutations of each other");
		}
		
	}
}



