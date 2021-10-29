package com.ektha.bcj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;



/*
 * Given two integer arrays arr1 and arr2, return and array of their intersection.
 * Each element in the result array must appear as many times as it shows in both arrays and you may return the result in any order.
 * 
 * Meaning of array of their intersection: return an array that shows the exact number of values common to both arrays
 * 
 * Example 1: 
 * 	Input arr1 = [1,2,2,2,1], arr2 = [2,2,2,1,1,1]
 * 	output: [2,2]
 * 
 * Example 2:
 * 	Input arry1 = [4,9,5], arr2 = [9,4,9,8,4]
 * 	output: [4,9]
 * 
 * Explanation: elements in result array can be in any order, example2, [9,4] is also accepted.
 */

public class InsertionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 2, 2, 1 };
		int[] arr2 = { 2, 2, 2, 1, 1, 1 };

		int[] resultArray = findIntersect(arr1, arr2);

		String result = Arrays.toString(resultArray);
		System.out.println("Common Element " + result);

	}

	public static int[] findIntersect(int[] arr1, int[] arr2) {

		ArrayList<Integer> set1 = new ArrayList<>();
		ArrayList<Integer> set2 = new ArrayList<>();

		for (int i : arr1) {
			set1.add(i);
		}

		for (int i : arr2) {
			set2.add(i);
		}

		set2.retainAll(set1);

		return set2.stream().mapToInt(Integer::intValue).toArray();

	}

}
