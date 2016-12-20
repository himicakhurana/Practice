import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CopyOfSherlockAnagram {
	public static void main(String[] args) throws IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		int t = Integer.parseInt(in2.readLine());
		mloop: for (int a0 = 0; a0 < t; a0++) {
			String s1, s2;
			s1 = in2.readLine();
			int pair = 0;
			Set<String> c1 = new HashSet<String>();
			c1 = getStringSet(s1);
			for (String s : c1) {
				for (String ss : c1) {

					if (!s.equals(ss)) {
						if (iAnagram(s, ss)) {
							pair++;
						}
					}
				}
			}
			System.out.println(pair);
		}
	}

	public static boolean iAnagram(String word, String anagram) {
		char[] charFromWord = word.toCharArray();
		char[] charFromAnagram = anagram.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);
	}

	private static Set<String> getStringSet(String s1) {
		Set<String> c1 = new HashSet<String>();
		for (int i = 0; i < s1.length(); ++i) {
			for (int j = 0; j < (s1.length() - i); ++j) {
				c1.add(s1.substring(j, i + j + 1));
			}
		}

		return c1;
	}
}
