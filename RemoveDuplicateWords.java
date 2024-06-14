package homeassignment;

import java.util.Arrays;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		System.out.println("RemoveDuplicateWords in the string");
		String text = "We learn Java basics as part of java sessions in java week1";
		removeDuplicateWordsInStr(text);
	}


	public static void removeDuplicateWordsInStr(String aStr) {
		// TODO Auto-generated method stub
	   int counter=0;
		String[] words = aStr.split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					words[i]="";
					counter++;
				}
			}
		}
		if(counter>0)
		{
			for (String string : words) {
				System.out.println(string);
			}
		}
	}
}

