package com.linear.arrays;

import java.util.Arrays;

import org.junit.Test;

public class ArrayOperationsTest {
	
	@Test
	public void rotateTest() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int n = arr.length;
		int d = 1;
		ArrayOperations.rotate(arr, d, n);
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void leftRotateTest() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7,8,9,10,11,12};
		int n = arr.length;
		int d = 3;
		ArrayOperations.leftRotate(arr, d, n);
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void arrayReverseTest() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7,8,9,10,11,12};
		ArrayOperations.reverseArray(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void leftRotateUsingReversalAlgorithmTest() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7,8,9,10,11,12};
		int n = arr.length;
		int d = 3;
		ArrayOperations.leftRotateUsingReversalAlgorithm(arr, d);
		System.out.println(Arrays.toString(arr));
	}
	
}
