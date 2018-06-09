/*Entry.java*/

package Master;

import businessLogic.CompressString;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		CompressString cs = new CompressString();
		System.out.println(cs.compressBad("aabcccccaa"));;
		System.out.println(cs.compressBetter("aabcccccaa"));;
		

	}

}

/*CompressString.java*/

package businessLogic;

public class CompressString {
	public String compressBad(String str) {
		String compressedString = "";
		int countConsecutive = 0;
		
		for(int i=0; i < str.length(); i++) {
			countConsecutive++;
			
			/*If next character is different from current character, append this character to the result*/
			
			/*Check for current character being the last character or a possible 
			 * mismatch between current and next*/
			
			
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
				compressedString += ""+str.charAt(i)+countConsecutive;
				countConsecutive = 0;
			}
		}
		return compressedString.length()<str.length()? compressedString:str;
	}
	
	public String compressBetter(String str) {
		
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		
		
		for(int j = 0 ; j < str.length(); j++) {
			countConsecutive++;			

		/*If next character is different than current character,
		 * append this character to the result*/
			//System.out.println("j is : "+j+" Character at j is : "+str.charAt(j));
			if(j+1 >= str.length() || str.charAt(j) != str.charAt(j+1)) {
				
				compressed.append(str.charAt(j));
				compressed.append(countConsecutive);
				countConsecutive = 0;				
			}		
			
		}
		return compressed.length() < str.length()? compressed.toString(): str;
	}

}
