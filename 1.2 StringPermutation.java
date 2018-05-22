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

