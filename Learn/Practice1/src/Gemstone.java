import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Gemstone {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		int t = Integer.parseInt(in2.readLine());
		List<String> s = new ArrayList<String>();

		mloop: for (int a0 = 0; a0 < t; a0++) {
			s.add(in2.readLine());
		}
		int gemstone = 0;
		Map<Character, Integer> ch1 = new HashMap<Character, Integer>();
		char[] chArr2 = s.get(0).toCharArray();
		for (int i = 0; i < chArr2.length; i++) {
			if (ch1.containsKey(chArr2[i])) {

				ch1.put(chArr2[i], ch1.get(chArr2[i]) + 1);
			} else {
				ch1.put(chArr2[i], 1);

			}
		}
		Set<Character> c1 = new HashSet<Character>();
		c1.addAll(ch1.keySet());
		// List<Map<Character, Integer>> mapList = new ArrayList<Map<Character,
		// Integer>>();
		for (String s1 : s) {
			Map<Character, Integer> ch2 = new HashMap<Character, Integer>();

			char[] chArr1 = s1.toCharArray();
			for (int i = 0; i < chArr1.length; i++) {
				if (ch2.containsKey(chArr1[i])) {

					ch2.put(chArr1[i], ch2.get(chArr1[i]) + 1);
				} else {
					ch2.put(chArr1[i], 1);

				}
			}
			c1.retainAll(ch2.keySet());
			gemstone = c1.size();
			if (gemstone == 0) {
				break;
			}

		}
		System.out.println(gemstone);
	}
}
