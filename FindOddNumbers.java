package week1.day1.HomeAssignment;

public class FindOddNumbers {
	public static void main(String[] args) {
		System.out.println("Odd numbers");
		displayOddNumbers();
	}

	/**
	 * print the odd numbers from 1 to 10
	 */
	public static void displayOddNumbers() {
		// Write a logic to print the odd numbers from 1 to 10
		int i = 1, max = 10;
		while (i <= max) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}
	}
}
