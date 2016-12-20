import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class FlatIron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Jai");
		 */int array[] = { 9, 1, 4, 9, 0, 4, 8, 9, 0, 1 };
		test(array);
	}

	public static void test(int[] T) {
		int t = T.length;
		Map<Integer, Integer> nodeList = new TreeMap<Integer, Integer>();
		Map<Integer, List<Integer>> gMap = new HashMap<Integer, List<Integer>>();
		int capital = -1;
		mloop: for (int a0 = 0; a0 < t; a0++) {
			if (T[a0] == a0) {
				capital = a0;
			} else {
				int start = a0;
				int end = T[a0];
				if (gMap.containsKey(start)) {
					gMap.get(start).add(end);

				} else {
					List<Integer> endList = new ArrayList<Integer>();
					endList.add(end);
					gMap.put(start, endList);
				}

				if (gMap.containsKey(end)) {
					gMap.get(end).add(start);

				} else {
					List<Integer> endList = new ArrayList<Integer>();
					endList.add(start);
					gMap.put(end, endList);

				}
			}
			nodeList.put(a0, -1);
		}
		System.out.println(nodeList);
		System.out.println(gMap);
		for (int node : nodeList.keySet()) {
			if (node != capital && nodeList.get(node) == -1) {
				int level = 1;
				Set<Integer> explored = new HashSet<Integer>();

				Queue<Integer> qu = new LinkedList<Integer>();
				qu.add(capital);
				while (!qu.isEmpty()) {
					int r = qu.remove();
					if (r == node) {
						int cost = level * 1;
						if ((nodeList.get(node) == -1)) {
							nodeList.put(r, cost);
							qu.clear();
							break;
						}
					}
					if (!explored.contains(r)) {
						for (int p : gMap.get(r)) {

							if (p == node) {
								int cost = level * 1;
								if ((nodeList.get(node) == -1)) {
									nodeList.put(p, cost);
									qu.clear();
									break;
								}
							}
						}
						// for (int p : ) {
						qu.addAll(gMap.get(r));
						level++;

						// }
						explored.add(r);

					}

				}
			}
		}
		for (int node : nodeList.keySet()) {
			if (node != capital) {
				System.out.println(node + "-" + nodeList.get(node) + " ");
			}
		}
		System.out.print("\n");

	}
}
