package _00_Sorting_Algorithms;

public class HeapSorter extends Sorter {
	public HeapSorter() {
		type = "Heap";
	}

	// 1. Since this sorting algorithm uses recursion,
	// we'll make a helper method called heapSort.
	// Complete the steps in the heapSort method.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.ok
	@Override
	void sort(int[] array, SortingVisualizer display) {
		display.updateDisplay();
		// 8. create an integer called n and set it equal
		// to the length of the array
		int n = array.length;
		// 9. make a for loop that starts half way between
		// 0 and n and counts down until it is less than 0.
		// Inside this for loop, call the heapSort method with n and i
		int halfway = (n / 2) + 1;
		for (int i = halfway; i > -1; i--) {
			heapSort(array, n, i, display);
		}
		// 10. make a for loop that starts at n-1
		// and counts down until it is less than 0.
		for (int i = n - 1; i > -1; i--) {
			int saver = array[i];
			array[i] = array[0];
			array[0] = saver;
			heapSort(array, i, 0, display);
		}
		// 11. swap the array elements at 0 and 1.
		// 12. call the heapSort method with i and 0
	}

	public void heapSort(int[] array, int n, int i, SortingVisualizer display) {
		display.updateDisplay();
		// 2. create an integer called largest and set it equal to i
		int largest = i;
		// 3. create an integer called l and set it equal to (i + 1) * 2
		int l = 2 * i + 1;
		// 4. create an integer called r and set it equal to (i + 2) * 2
		int r = 2 * i + 2;
		// 5. if l is less than n
		// and array element at l is greater than array element at largest
		// then set largest equal to l
		if (l < n && array[l] > array[largest]) {
			largest = l;
		}
		// 6. if r is less than n
		// and array element at r is greater than array element at largest
		// then set largest equal to r
		if (r < n && array[r] > array[largest]) {
			largest = r;
		}
		// 7. if largest is not equal to i
		// then swap the array elements at i and largest.
		// Also, call the heapSort method with n and largest
		if (largest != i) {
			int saver = array[largest];
			array[largest] = array[i];
			array[i] = saver;
			heapSort(array, n, largest, display);
		}
	}
}
