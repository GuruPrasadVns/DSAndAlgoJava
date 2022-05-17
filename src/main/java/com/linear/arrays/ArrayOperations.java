package com.linear.arrays;

public class ArrayOperations {
	
	// Time Complexity : O(n^2)
	//Space Complexity : O(1)
	public static void rotate(int[] arr, int d, int n) {
		for(int i = 0; i < d ; i++) {
			int temp = arr[0];
			int j = 1;
			for(; j <= n -1; j++) {
				arr[j -1] = arr[j];
			}
			arr[j - 1] = temp;
		}
	}
	
	//juggling Algorithm
	// Time Complexity : O(n)
	//Space Complexity : O(1)
	public static void leftRotate(int arr[], int d, int n)
    {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

	private static int gcd(int a, int b) {
		if (b == 0)
            return a;
        else
            return gcd(b, a % b);
	}
	
	// Time Complexity : O(n)
	//Space Complexity : O(1)
	public static void reverseArray(int[] arr, int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	// Time Complexity : O(n)
	//Space Complexity : O(1)
	public static void leftRotateUsingReversalAlgorithm(int[] arr, int d) {
		if(d == 0) {
			return;
		}
		int n = arr.length;
		d= d % n;
		reverseArray(arr, 0, d -1);
		reverseArray(arr, d, n -1);
		reverseArray(arr, 0, n -1);
	}
}
