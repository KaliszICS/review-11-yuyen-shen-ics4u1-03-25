public class PracticeProblem {

	public static void main(String args[]) {
		createIntArray();
		createArray("you", "are", "so", "smart");
		System.out.println(findValue(5, new int[]{4, 5, 7, 9, 5}));
		System.out.println(findValue(7, new int[]{4, 5, 1, 9, 5}));
		System.out.println(findThirdValue("a", new String[]{"a", "b", "c", "a", "a", "f"}));
		System.out.println(findThirdValue("g", new String[]{"a", "b", "c", "a", "a", "f"}));
	}

	//q1
	public static int[] createIntArray() {
		int[] arr1 = new int[5];
		for (int a = 0; a < 5; a++) {
			arr1[a] = a + 1;
			System.out.println(arr1[a]);
		}
		return arr1;
	}

	//q2
	public static String[] createArray(String word1, String word2, String word3, String word4) {
		String[] arr2 = new String[]{word1, word2, word3, word4};
		for (int b = 0; b < arr2.length; b++) {
			System.out.println(arr2[b]);
		}
		return arr2;
	}

	//q3
	public static int findValue(int num, int[] arr3) {
		int index = 0;
		for (int c = 0; c < arr3.length; c++){
			if (arr3[c] == num){
				index = c;
				return index;
			}
		}
		return -1;
	}

	//q4
	public static int findThirdValue(String word, String[] arr4) {
		int index0 = 0;
		int count = 0;
		for (int d = 0; d < arr4.length; d++) {
			if (arr4[d].equals(word)) {
				count++;
				if (count == 3) {
					index0 = d;
					return index0;
				}
			}
		}
		return -1;
	}
}
