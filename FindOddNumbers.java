package week1.day1.HomeAssignment;

public class FindOddNumbers {
public static void main(String[] args) {
	System.out.println("Odd numbers");
	displayOddNumbers();
	System.out.println("Fibonacci numbers");
	displayFibonacciNUmbers();
}
/*
 *  Displaying the generated Fibonacci series as the program output – 0, 1, 1, 2, 3, 5, 8, and 13.
 */

public static void displayFibonacciNUmbers() {
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

/**
 * print the odd numbers from 1 to 10
 */
public static void displayOddNumbers() {
	//Write a logic to print the odd numbers from 1 to 10
	int i=1;
	while(i<=10) {
		if(i%2 != 0) {
			System.out.println(i);
		}
		i++;
	}
}
}
