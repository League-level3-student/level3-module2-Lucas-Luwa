package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int j = 0; j < array.length - 1; j++) {
			for (int i = j + 1; i < array.length; i++) {
				if (array[j] > array[i]) {
					int holder = array[i];
					array[i] = array[j];
					array[j] = holder;
					display.updateDisplay();
				}
			}
		}
		
		
	}
	
}
