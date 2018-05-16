
public class Entry {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "abcdea";
		int flag = 1;
		
		for (int i=0; i < myString.length(); i++) {
			for (int j=0; j < myString.length(); j++) {
				if(myString.charAt(i)==myString.charAt(j) && i!=j) {
					flag = 0;
					break;
				}
			}
			
			
		}
		if(flag==1) {
			System.out.println("The string has unique characters");
		}else {
			System.out.println("The string does not have unique characters");
		}

	}

}
