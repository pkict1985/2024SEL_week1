package homeassignment;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Fibonacci numbers");
		displayFibonacciNumbers();
	}
	/*
	 *  Displaying the generated Fibonacci series as the program output – 0, 1, 1, 2, 3, 5, 8, and 13.
	 */

	public static void displayFibonacciNumbers() {
		// TODO Auto-generated method stub
		int n=8,counter=1, i=0, j=1, k;
		System.out.println(i);
		System.out.println(j);
		while(counter<= n-2){
			k=i+j;
			System.out.println(k);
			i=j;
			j=k;
			counter++;
		}
	}
}

