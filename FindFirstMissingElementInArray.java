package homeassignment;

import java.util.Arrays;

public class FindFirstMissingElementInArray {
	public static void main(String[] args) {
		int[] inputArray= {1, 4,3,2,8,6,7};
		displayFirstMissingElementInArray(inputArray);
	}
	/*
	 *  Displaying the missing elements in an array
	 */

	public static void displayFirstMissingElementInArray(int[] inputArray) {
		// TODO Auto-generated method stub
		Arrays.sort(inputArray);

		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i]!=i+1) {
				System.out.println((i+1) + " is missing");
				break;
			}
		}
	}
}


