package homeassignment;

public class FindIntersection {
	public static void main(String[] args) {
		displayMatchingElementsFromArrays();
	}

	/*
	 *  Displaying matching elements from the arrays
	 */

	public static void displayMatchingElementsFromArrays() {
		// TODO Auto-generated method stub
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		System.out.println("Matching numbers are ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}

