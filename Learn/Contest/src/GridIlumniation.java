import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class GridIlumniation {
	static HashMap<Integer, List<Integer>> map = new HashMap<>();

	public static void main(String[] args) {
		int n = 10000;
		int[][] x = new int[n][n];
		System.out.println(print(x, n, 999, 150));

	}

	static boolean print(int x[][], int n, int p, int q) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 999 && j == 3) {
					x[i][j] = 1;
					if (!map.containsKey(i)) {
						map.put(i, new ArrayList<Integer>(Arrays.asList(j)));
					} else {
						map.get(i).add(j);
					}
				}
				if (i == 999 && j == 160) {
					x[i][j] = 1;
					if (!map.containsKey(i)) {
						map.put(i, new ArrayList<Integer>(Arrays.asList(j)));
					} else {
						map.get(i).add(j);
					}
				}
			}
		}
		// check if x;
		// check if can

		// check if y
		if (map.containsKey(p)) {
			List<Integer> rrr = map.get(p);
			System.out.println("here1");

			rrr.removeAll(Arrays.asList(q, q + 1, q - 1));
			if (!rrr.isEmpty()) {
				return true;
			}
		}
		for (Entry<Integer, List<Integer>> mEntry : map.entrySet()) {
			if (mEntry.getValue().contains(q)) {
				if (mEntry.getKey() != p && mEntry.getKey() != (p - 1)
						&& mEntry.getKey() != (p + 1)) {
					return true;
				}
			}
			int r = p - mEntry.getKey();
			r = Math.abs(r);
			int s = Math.abs(r + q);
			int s2 = Math.abs(r - q);

			if ((mEntry.getValue().contains(s) || mEntry.getValue()
					.contains(s2)
					&& (mEntry.getKey() != p && mEntry.getKey() != p - 1 && mEntry
							.getKey() != p + 1))) {
				return true;

			}

		}
		return false;
	}

	/*
	 * Complete the function below.
	 */

	/*
	 * Complete the function below.
	 */

	static String[] checkIllumination(int N, int[][] lamps, int[][] queries) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		List<String> ss = new ArrayList<String>();

		int s = lamps.length;
		for (int i = 0; i < s; i++) {
			int lampx = lamps[i][0];
			int lampy = lamps[i][1];

			if (!map.containsKey(lampx)) {
				map.put(lampx, new ArrayList<Integer>(Arrays.asList(lampy)));
			} else {
				map.get(lampx).add(lampy);
			}
		}
		int q = queries.length;

		for (int i = 0; i < q; i++) {
			int queryx = queries[i][0];
			int queryy = queries[i][1];
			HashMap<Integer, List<Integer>> map2 = new HashMap<>();
			if (map.containsKey(queryx)) {
				List<Integer> rrr2 = map.get(queryx);
				rrr2.removeAll(Arrays.asList(queryy, queryy + 1, queryy - 1));
				map2.put(queryx, rrr2);
			}
			if (map.containsKey(queryx + 1)) {
				List<Integer> rrr2 = map.get(queryx + 1);
				rrr2.removeAll(Arrays.asList(queryy, queryy + 1, queryy - 1));
				map2.put(queryx + 1, rrr2);
			}
			if (map.containsKey(queryx - 1)) {
				List<Integer> rrr2 = map.get(queryx - 1);
				rrr2.removeAll(Arrays.asList(queryy, queryy + 1, queryy - 1));
				map2.put(queryx - 1, rrr2);
			}
			if (map2.containsKey(queryx)) {
				List<Integer> rrr = map.get(queryx);

				rrr.removeAll(Arrays.asList(queryy, queryy + 1, queryy - 1));
				if (!rrr.isEmpty()) {
					ss.add("LIGHT");
					continue;
				}
			}
			boolean set = false;
			for (java.util.Map.Entry<Integer, List<Integer>> mEntry : map2
					.entrySet()) {
				if (mEntry.getValue().contains(queryy)) {
					if (mEntry.getKey() != queryx
							&& mEntry.getKey() != (queryx - 1)
							&& mEntry.getKey() != (queryx + 1)) {
						ss.add("LIGHT");
						set = true;
						break;
					}
				}
				int r = queryx - mEntry.getKey();
				int d1 = queryy - r;
				int d2 = r + queryy;

				if ((mEntry.getValue().contains(d1) || mEntry.getValue()
						.contains(d2)
						&& (mEntry.getKey() != queryx
								&& mEntry.getKey() != queryx - 1 && mEntry
								.getKey() != queryx + 1))) {
					ss.add("LIGHT");
					set = true;

					break;

				}

			}
			if (!set) {

				ss.add("DARK");
				continue;
			}
		}
		return ss.toArray(new String[0]);
	}

}
