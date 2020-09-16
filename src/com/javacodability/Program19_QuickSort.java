package com.javacodability;

public class Program19_QuickSort {
	
	public static void quickSort(int[] arr, int start, int end) {
		if (end - start < 2) {
			return;
		}
		int pivotIndex = partition(arr, start, end);
		quickSort(arr, start, pivotIndex); // left array
		quickSort(arr, pivotIndex + 1, end); // right array
	}
	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i = start;
		int j = end;
		while (i < j) {
			while (i < j && arr[--j] >= pivot)
				;
			if (i < j) {
				arr[i] = arr[j];
			}
			while (i < j && arr[++i] <= pivot)
				;
			if (i < j) {
				arr[j] = arr[i];
			}
		}
		arr[j] = pivot;
		return j;
	}
	public static void main(String[] args) {
		int[] arr = { 67, 3, -12, 5, 89, 0 };
		quickSort(arr, 0, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	}
	



