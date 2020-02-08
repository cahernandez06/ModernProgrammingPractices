package Lesson11;

import java.util.Arrays;

public class Ocurrences {

	public static <T> long countOcurrences(T[] arr, T target) {
/*		int count=0;
		if (target==null) {
			for (T item:arr) {
				if (item==null)
					count++;
			}
		} else {
			for (T item:arr)
				if (target.equals(item))
					count++;
		}
		return count;*/
		return Arrays.stream(arr).filter(e -> e.equals(target)).count();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {1,2,5,10,5};
		String[] arr2 = {"1","2","5","10","5","5"};
		System.out.printf("Using array of ints: %d \n",countOcurrences(arr1, 5));
		System.out.printf("Using array of ints: %d \n",countOcurrences(arr2, "5"));

	}

}
