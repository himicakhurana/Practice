import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int t = in.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			arr[i] = x;

		}
		System.out.println(maximumSum(arr,t));
	}

	public static int maxSubArray(List<Integer> arrList) {
		int newsum = arrList.get(0);
		int max = arrList.get(0);
		for (int i = 1; i < arrList.size(); i++) {
			newsum = Math.max(newsum + arrList.get(i), arrList.get(i));
			max = Math.max(max, newsum);
		}
		return max;
	}

	public static int maximumSum(int[] array, int t) {
		int maxSum = 0;
		int newsum = 0;
		int i = 0;
		int end = 0;
		while (i < array.length) {
			if (newsum <= t && end < array.length) {
				newsum =newsum+ array[end];
				end++;

			} else {
				newsum =newsum- array[i];
				i++;
			}
			if (newsum > maxSum && newsum <= t) {
				maxSum = newsum;
			}
			
		}
		return maxSum;
	}
}