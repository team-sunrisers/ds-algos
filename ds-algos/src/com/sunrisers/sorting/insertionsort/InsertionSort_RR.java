package com.sunrisers.sorting.insertionsort;

import java.util.Arrays;

public class InsertionSort_RR {

	public static void main(String[] args) {
		int[] input = { 5, 8, 4, 7, 2, 8, 1, 3 };
		System.out.println("Given Array: " + Arrays.toString(input));
		sort(input);
		System.out.println("Sorted Array: " + Arrays.toString(input));
	}

	private static void sort(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int key = input[i];
			int j = i - 1;
			while (j >= 0 && input[j] > key) {
				input[j + 1] = input[j--];
			}
			input[j + 1] = key;
		}
	}
}
