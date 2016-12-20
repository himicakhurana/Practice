import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int width[] = new int[n];
		for (int width_i = 0; width_i < n; width_i++) {
			width[width_i] = in.nextInt();
		}
		int sol[] = new int[t];
		for (int a0 = 0; a0 < t; a0++) {
			int i = in.nextInt();
			int j = in.nextInt();
			int min = Integer.MAX_VALUE;
			for (int p = i; p <= j; p++) {
				if (width[p] < min) {
					min = width[p];
				}
			}
			sol[a0] = min;

		}
		for (int a0 = 0; a0 < t; a0++) {
			System.out.println(sol[a0]);
		}
	}
}
