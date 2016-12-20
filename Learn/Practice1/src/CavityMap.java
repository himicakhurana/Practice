import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String grid[] = new String[n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			grid[grid_i] = in.next();
		}
		for (int grid_i = 0; grid_i < n; grid_i++) {
			char[] c = grid[grid_i].toCharArray();
			int i = 0;
			if (grid_i != 0 && grid_i != n - 1) {
				for (i = 1; i < c.length - 1; i++) {
					if (grid[grid_i - 1].charAt(i) < c[i]
							&& grid[grid_i + 1].charAt(i) < c[i])
						if (c[i + 1] < c[i] && c[i] > c[i - 1]) {
							c[i] = 'X';
						}
				}

				grid[grid_i] = String.valueOf(c);
			}
		}
		for (int grid_i = 0; grid_i < n; grid_i++) {
			System.out.println(grid[grid_i]);
		}
	}

}
