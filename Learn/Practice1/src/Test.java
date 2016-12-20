import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		// TODO Auto-generated method stub
		System.out.println(t.isAngram("abc", "bcd"));
		StringBuilder input1 = new StringBuilder();
		input1.append("himica");
		input1 = input1.reverse();
		System.out.println(input1.toString());
		System.out.println("c".compareTo("x"));
		int h, k;
		h = 11;
		k = 12;
		int r = h ^ k;
		System.out.println(r + "xor");
		int number = 6;
		int sqrt = (int) Math.sqrt(number);

		if (sqrt * sqrt == number) {

			System.out.println("sq");
		} else {
			System.out.println("nsq");
		}

		String sq = "16";

		// System.out.println(Long.parseLong(sq.substring(0, 1)));
		// System.out.println( Long.parseLong(sq.substring(1, 2 )));
		System.out.println(isKapekar(10));
		System.out.println(isIsomorphic("foo", "bar"));
		System.out.println(getBit(10,1));
	}

	private boolean isAngram(String s1, String s2) {

		// char[] chArr = s.toCharArray();
		if (s1.length() == s2.length()) {
			char[] chArr1 = s1.toCharArray();
			char[] chArr2 = s2.toCharArray();
			Map<Character, Integer> ch1 = new HashMap<Character, Integer>();
			Map<Character, Integer> ch2 = new HashMap<Character, Integer>();

			int del = 0;
			for (int i = 0; i < chArr1.length; i++) {
				if (ch1.containsKey(chArr1[i])) {

					ch1.put(chArr1[i], ch1.get(chArr1[i]) + 1);
				} else {
					ch1.put(chArr1[i], 1);

				}
			}
			for (int i = 0; i < chArr2.length; i++) {
				if (ch2.containsKey(chArr2[i])) {

					ch2.put(chArr2[i], ch2.get(chArr2[i]) + 1);
				} else {
					ch2.put(chArr2[i], 1);

				}
			}
			// System.out.println(ch1);
			// System.out.println(ch2);

			Set<Character> c1 = new HashSet<Character>();
			c1.addAll(ch1.keySet());
			Set<Character> c2 = new HashSet<Character>();
			c2.addAll(ch2.keySet());
			c1.removeAll(c2);

			// System.out.println(c1);
			if (null != c1)
				for (Character s : c1) {
					del = del + ch1.get(s);

				}
			c1.clear();
			c2.clear();

			c1.addAll(ch1.keySet());
			c2.addAll(ch2.keySet());
			c2.removeAll(c1);
			// int x = c1.size();
			// System.out.println(c2);
			//
			if (null != c2)
				for (Character s : c2) {
					del = del + ch2.get(s);

				}
			c1.clear();
			c2.clear();

			c1.addAll(ch1.keySet());
			c2.addAll(ch2.keySet());
			c1.retainAll(c2);
			// System.out.println(c1);
			if (!c1.isEmpty()) {
				for (Character s : c1) {
					del = del + Math.abs(ch1.get(s) - ch2.get(s));

				}
				if (del == 0) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isKapekar(int p) {
		long square = (long) Math.pow(p, 2);
		String sq = Long.toString(square);
		int len = sq.length();
		int mid = len / 2;
		long ten = (long) Math.pow(10, len - mid);

		long firstHalf = square / ten;
		long secondHalf = square % ten;

		long sum = firstHalf + secondHalf;

		if (sum == p)
			return true;
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean isIsomorphic(String s, String t) {
		if (s == null || t == null)
			return false;

		if (s.length() != t.length())
			return false;

		if (s.length() == 0 && t.length() == 0)
			return true;

		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			Character c = getKey(map, c2);
			if (c != null && c != c1) {
				return false;
			} else if (map.containsKey(c1)) {
				if (c2 != map.get(c1))
					return false;
			} else {
				map.put(c1, c2);
			}
		}

		return true;
	}

	// a method for getting key of a target value
	public static Character getKey(HashMap<Character, Character> map,
			Character target) {
		for (Map.Entry<Character, Character> entry : map.entrySet()) {
			if (entry.getValue().equals(target)) {
				return entry.getKey();
			}
		}

		return null;

	}
	public static boolean getBit(int num, int i){
		int result = num & (1<<i);
	 
		if(result == 0){
			return false;
		}else{
			return true;
		}
	}
}
