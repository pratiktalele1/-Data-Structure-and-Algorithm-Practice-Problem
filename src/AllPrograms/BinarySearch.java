package AllPrograms;

public class BinarySearch {
	public static void main(String[] args) {

		String[] arr = { "contribute", "pratik", "ajinkya", "ram", "sham", "anvar" };
		String checkString = "ram";
		int result = binarySearch(arr, checkString);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + " index " + result);
	}

	static int binarySearch(String[] arr, String checkString) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int midElement = l + (r - l) / 2;

			int res = checkString.compareTo(arr[midElement]);

			if (res == 0)
				return midElement;

			if (res > 0)
				l = midElement + 1;

			else
				r = midElement - 1;
		}

		return -1;
	}
}
