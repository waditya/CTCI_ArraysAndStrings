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

//Second Method of checking if First String is permjutation of Second.

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
		Boolean flag1 = sac1.checkEquality();
		SortAndCompare sac2 = new  SortAndCompare(str3, str4);
		Boolean flag2 = sac2.checkEquality();
		SortAndCompare sac3 = new  SortAndCompare(str5, str6);
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
	}
}


