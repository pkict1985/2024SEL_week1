package homeassignment;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseOddWords {
	public static void main(String[] args) {
		String test="I am a software tester";
		reverseOddWordsInString(test);
//		for (int i = 0; i < test.length(); i++) {
//			System.out.println(test);
//		}
	}
	

	public static void reverseOddWordsInString(String test) {
		// TODO Auto-generated method stub
		String[] words = test.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(i%2==1) {
				String odd=words[i];
				words[i]=reverseOddWord(odd);
			}
			System.out.println(words[i]);
		}
	}


	private static String reverseOddWord(String odd) {
		// TODO Auto-generated method stub
		char[] charArray = odd.toCharArray();
		StringBuilder resultArraySB=new StringBuilder();
		for (int i = charArray.length-1; i >=0; i--) {
			resultArraySB.append(charArray[i]);
		}
		//charArray = Arrays.copyOf(resultArray, resultArray.length);
		return resultArraySB.toString();
	}
}

