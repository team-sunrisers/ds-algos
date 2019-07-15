package com.sunrisers.sorting.insertionsort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String args[]) {
		int[] input = { 5, 8, 4, 7, 2, 8, 1, 3 };
		System.out.println("Given Array: " + Arrays.toString(input));
		sort(input, 0, input.length-1);
		System.out.println("Sorted Array: " + Arrays.toString(input));
	}

	private static void sort(int[] input, int low, int high) {
		if (low >= high) {
			return;
		}
		int pivotalIndex = getPivotal(input, low, high);
		sort(input, low, pivotalIndex - 1);
		sort(input, pivotalIndex + 1, high);
	}

	private static int getPivotal(int[] input, int low, int high) {
		int pivotalIndex = high;
		int j = low - 1;
		for (int i = low; i < high; i++) {
			if (input[i] <= input[pivotalIndex]) {
				j++;
				int temp = input[j];
				input[j] = input[i];
				input[i] = temp;

			}
		}
		int temp = input[pivotalIndex];
		input[pivotalIndex] = input[j + 1];
		input[j + 1] = temp;
		return j + 1;
	}

}
