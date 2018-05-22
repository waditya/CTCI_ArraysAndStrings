/*Entry Class with Main Method*/
package Entry;

public class Entry {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "MR JOHN SMITH    ";
		int str1_length = 13;
		URLify word = new URLify(str1, str1_length);
		System.out.println("\n Word is : "+str1);
		System.out.println("\n Length of Word is : "+str1_length);
		System.out.println("\nURL of word is : "+word.makeURLfromString());
	}

}

/** Core Functional Classes**/
package Entry;

public class URLify {
	String str;
	int strLength;
	String url;
	public URLify(String str, int strLength) {
		// TODO Auto-generated constructor stub
		this.str = str;
		this.strLength = strLength;
		
	}
	
	public String makeURLfromString() {
		//Declare variables
		int numberOfSpaces = 0;
		
		//Convert the string into character array
		char[] strArr = str.toCharArray();
		System.out.println("\nLength of Array : "+strArr.length);
		
		int spaceChar = " ".charAt(0);
		
		
		//Check the number of white spaces in the string
		//O[n]
		
		for(int j=0; j < strLength; j++) {
			if((strArr[j]) == " ".charAt(0)) {
				System.out.println(strArr[j]);
				numberOfSpaces++;
			}
		}
		
		System.out.println("\nNumber of spaces in word : "+numberOfSpaces);
		
		//Calculate the difference diff from where backward traversal of 
		//String Array is to be started. '%20' takes 3 characters.
		
		
		int diff = numberOfSpaces*3 - numberOfSpaces;
		System.out.println("\nInitial Calculated difference : "+diff);
		
		for(int i=strLength-1; i>=0; i--) {			
			//System.out.println("Inside For Loop and the index is : "+i);
			if(strArr[i]!=spaceChar) {
				//System.out.println("Inside String Array");
				strArr[i + diff] = strArr[i];
			}else {
				strArr[i+ diff]='0';
				strArr[i+ (diff - 1)]='2';
				strArr[i +(diff - 2)]='%';
				diff = diff - numberOfSpaces;
				//System.out.println("New Calculated difference : "+diff);
			}
		}
		
		return new String(strArr);	
	}
	
}


