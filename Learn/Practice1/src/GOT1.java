import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GOT1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));

		String s1, s2;
		s1 = in2.readLine();
		boolean pal = false;
		// s2 = in2.readLine();
		// char[] chArr = s.toCharArray();

		char[] chArr1 = s1.toCharArray();

		Map<Character, Integer> ch1 = new HashMap<Character, Integer>();
		// Map<Character, Integer> ch2 = new HashMap<Character, Integer>();
		int nn = s1.length();
		for (int i = 0; i < chArr1.length; i++) {
			if (ch1.containsKey(chArr1[i])) {

				ch1.put(chArr1[i], ch1.get(chArr1[i]) + 1);
			} else {
				ch1.put(chArr1[i], 1);

			}
		}
		int rem = nn % 2;
		if (rem == 0) {
			for (Entry<Character, Integer> a : ch1.entrySet()) {

				int x = (int) a.getValue();
				if (x % 2 == 0) {
					pal = true;
				} else {
					pal = false;
					break;
				}
			}
		} else {
			int x = 0;
			for (Entry<Character, Integer> a : ch1.entrySet()) {

				int p = (int) a.getValue();
				if (p % 2 != 0) {
					x++;
					pal = true;

					if (x > 1) {
						pal = false;
						break;
					}
				}
			}
		}
		if (pal) {
			System.out.println("YES");
		} else {
			System.out.println("NO");

		}
	}

}
