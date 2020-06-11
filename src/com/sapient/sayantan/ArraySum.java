package com.sapient.sayantan;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySum {

	public static void main(String[] args) {

		Integer arr[] = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
		List<Integer> intArray = Arrays.asList(arr);

		int k = 4;

		Iterator<Integer> itInt = intArray.iterator();
		int m = 0;
		Integer sum = 0;
		if (k > intArray.size()) {
			System.out.println("Invalid");
		} else {
			while (itInt.hasNext()) {
				if (m + k > intArray.size()) {
					break;
				}
				Integer sumOfSubArray = intArray.subList(m, m + k).stream()
						.collect(Collectors.summingInt(Integer::intValue));
				if (sumOfSubArray > sum) {
					sum = sumOfSubArray;
				}
				m++;
			}
			System.out.println(sum);
		}

	}

}
