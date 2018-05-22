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


