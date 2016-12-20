import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		String str[] = null;
		if ((s = in.readLine()) != null) {
			str = s.split("\\|");
		}
		System.out.println(str.length);
		Map<String, String> map = new HashMap<>();

		for (String p : str) {
			String x = p;
			p = p.toLowerCase();
			p = p.trim();
			p = p.replaceAll("\\s+", " ");
			p = p.replaceAll("[^a-z0-9\\s]", "");
			if (!map.containsKey(p))
				map.put(p, x);
		}
		Set<String> rem = new HashSet<String>();
		for (String ss : map.keySet()) {
			if (mapContainment2(map, ss) != null) {
				rem.add(mapContainment2(map, ss));
			}
			/*
			 * if (mapContainment(map, ss) == null) { rem.add(ss); }
			 */
		}
		map.keySet().removeAll(rem);
		int i = 0;
		for (String w : map.keySet()) {
			i++;
			if (i != map.keySet().size() - 1)
				System.out.print(map.get(w) + "|");
			else
				System.out.print(map.get(w));

		}

		/*
		 * }
		 */

		// System.out.println(map);
	}

	private static String mapContainment(Map<String, String> map, String p) {
		for (String s : map.keySet()) {

			if (s.contains(p) && s.compareTo(p) != 0) {
				return null;
			}

		}
		return p;
	}

	private static String mapContainment2(Map<String, String> map, String p) {
		for (String s : map.keySet()) {
			if (p.contains(s) && s.compareTo(p) != 0) {
				return s;
			}

		}
		return null;
	}
}
