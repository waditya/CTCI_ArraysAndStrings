/*Core Classes*/

package CoreLogic;

public class PalindromePermutation {
	
public boolean checkPalindromePermutation(String str) {
	//Declare an integer array of 128 ASCII characters
	//Assumption could be 128 type of characters in the string
	
	int[] letters = new int[128];
	int odd_counter = 0;
	
	//Convert the string into character array so that it is can
	//be iterated over. String cannot be iterated
	
	char[] s_array = str.toLowerCase().toCharArray();
	
	//Scan the array and note the number of times the character
	//is occurs in the string.
	
	for(char ch:s_array) {
		//System.out.println(ch);
		letters[ch]++;
	}
	System.out.println();	
	
	
	//This will take a Big O Time Complexity of O[n] where n is the
	//number of characters in the String
	
	//Now check the string if more than 1 character is repeated odd
	//number of times
	
	for(int i=0; i<128 ;i++) {
		if(letters[i]%2==1) {
			odd_counter++;
			
		}
		
		if(odd_counter>1) {			
			return false;
		}
	}
	return true;
}
}
/********************************************************************************/
/********Main Class****************************************************/
