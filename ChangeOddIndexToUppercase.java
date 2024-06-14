package homeassignment;

import java.util.Iterator;

public class ChangeOddIndexToUppercase {
	public static void main(String[] args) {
		System.out.println("ChangeOddIndexToUppercase");
		String test = "changeme";
		changeLetterCaseAtOddIndexToUppercaseM(test);
	}
	
	public static void changeLetterCaseAtOddIndexToUppercaseM(String text) {
		char[] chars = text.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c= chars[i];
			if(i%2==1) {
				chars[i]=Character.toUpperCase(c);
		    }
			System.out.println(chars[i]);
	}
}
}

