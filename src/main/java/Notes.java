
class Notes {
	public static void main(String[] args) {

		//declaring an array

		int num;
		int[] numArr;
		int numArr2[];

		//initalize an array

		numArr = new int[5]; //"Empty" Array - fills it with default values
		//int - 0

		//prebuilt array

		numArr = new int[]{1, 3, 5};
		numArr = new int[]{2, 4, 6, 8}; //array can be replaced, but not altered
		int[] numArr3 = {1, 3, 5, 7}; //only possible if declaring and assigning on the same line

		numArr[0] = 5;
		System.out.println(numArr[0]);

		System.out.println(numArr);//reference

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}

		//altering values
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = numArr[i] + 8;
			System.out.println(numArr[i]);
		}

		//sequentail search

		numArr = new int[]{13, 11, 13};

		num = 13;
		int index = -1; //default value - invalid if we don't find the number

		for (int i = 0; i < numArr.length; i++) { //finds the last occurance
			if (numArr[i] == num) {
				index = i;
				// break;
				// i = numArr.length; //make the condition false
			}
		}

		System.out.println(index);

		String[] arr = {"z", "b", "c"};
		firstElementA(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void firstElementA(String[] arr) {
		//any array modifications will alter the array outside of the function
		//arrays don't to return anything if they are altering
		arr[0] = "a";
	}
}
