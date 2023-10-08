
public class Lab3_Task1_2 {

	// Task1_2_1:
	public static int iterativeBinarySearch(int target, int[] array) {
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			}
			if (array[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

//Task 1_2_2
	public static int recursiveBinarySearch(int target, int[] array) {
		return recursiveBinarySearch(target, array, 0, array.length - 1);
	}

	private static int recursiveBinarySearch(int target, int[] array, int left, int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				return mid;
			}

			if (array[mid] > target) {
				return recursiveBinarySearch(target, array, left, mid - 1);
			}

			else {
				return recursiveBinarySearch(target, array, mid + 1, right);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] sortedArray = { 1, 3, 5, 7, 9, 11, 13, 15 };
//Test 1_2_1:
		int target1 = 7;
		int result1 = iterativeBinarySearch(target1, sortedArray);
		System.out.println("Target 7 found at index: " + result1);
		int target2 = 1;
		int result2 = iterativeBinarySearch(target2, sortedArray);
		System.out.println("Target 1 found at index: " + result2);
//Test 1_2_2:
		int target3 = 15;
		int result3 = recursiveBinarySearch(target3, sortedArray);
		System.out.println("Target 15 found at index: " + result3);

		int target4 = 8;
		int result4 = recursiveBinarySearch(target4, sortedArray);
		System.out.println("Target 8 not found, result: " + result4);

	}

}
