import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		int lastans = 0;
		List<Integer>[] seq = (List<Integer>[]) new ArrayList[n];
		int queries[][] = new int[q][3];
		for (int arr_i = 0; arr_i < q; arr_i++) {
			for (int arr_j = 0; arr_j < 3; arr_j++) {
				queries[arr_i][arr_j] = in.nextInt();
				if (arr_j == 2) {
					int y = queries[arr_i][arr_j];
					int x = queries[arr_i][arr_j - 1];
					int qu = queries[arr_i][arr_j - 2];
					int index = (x ^ lastans) % n;

					if (qu == 1) {
						if (index < n) {
							List<Integer> iseq = null;
							if (seq[index] != null) {
								iseq = seq[index];

							} else {
								iseq = new ArrayList<Integer>();
							}
							iseq.add(y);
							seq[index] = iseq;

						}
					} else {
						if (index < n) {
							List<Integer> iseq = null;
							if (seq[index] != null) {

								iseq = seq[index];

								int size = iseq.size();
								int p = y % size;
								System.out.println(iseq.get(p));
								lastans=iseq.get(p);
							}

						}
					}

				}
			}
		}
	}
}
