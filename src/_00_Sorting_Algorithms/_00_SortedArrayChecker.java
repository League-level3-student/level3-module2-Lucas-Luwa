package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	static boolean intArraySorted(int[] array) {
		boolean truth = true;
		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] > array[i + 1]) {
				truth = false;
			} else {

			}
		}
		return truth;
	}

	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integerskk
	// and it returns a boolean.
	// The method returns true if the integer//doinne
	// array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] array) {
		boolean truth = true;
		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] > array[i + 1]) {
				truth = false;
			} else {

			}
		}
		return truth;
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise//done
	static boolean charArraySorted(char[] array) {
		boolean truth = true;
		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] > array[i + 1]) {
				truth = false;
			} else {

			}
		}
		return truth;
	}
	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)//done

	// 4. Write a static method called stringArraySorted.//
	// This method takes in an array of Strings
	// and it returns a boolean.kk
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] array) {
		boolean truth = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].compareTo(array[i + 1]) > 0) {

				truth = false;
			} else {

			}
		}
		return truth;
	}

}
