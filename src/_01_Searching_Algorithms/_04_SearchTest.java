package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String[] words = { "Hi", "Bye", "Go", "Stop", "Cat" };
		assertEquals(3, _00_LinearSearch.linearSearch(words, "Stop"));
		assertEquals(0, _00_LinearSearch.linearSearch(words, "Hi"));
		assertEquals(4, _00_LinearSearch.linearSearch(words, "Cat"));
	}

	@Test
	void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int[] nums = { 1, 4, 9, 12, 16, 18, 118, 254 };
		assertEquals(2, _01_BinarySearch.binarySearch(nums, 0, 7, 9));
		assertEquals(7, _01_BinarySearch.binarySearch(nums, 0, 7, 254));
		assertEquals(6, _01_BinarySearch.binarySearch(nums, 0, 7, 118));
	}

	@Test
	void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int[] nums = { 100, 200, 300, 400, 500 };
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(nums, 300));
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(nums, 400));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(nums, 600));
	}

	@Test
	void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] nums = { 1, 4, 9, 12, 16, 18, 118, 254 };
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(nums, 16));
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(nums, 12));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(nums, 7000));
	}
}
