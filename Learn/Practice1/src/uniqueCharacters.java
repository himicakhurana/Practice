public class uniqueCharacters {
	public static void main(String[] args) {
		String s = "absdr";
		String s1 = "snss";
		boolean z;
		z = checkUnique(s);
		System.out.println(z);
		z = checkUnique(s1);
		System.out.println(z);

	}

	private static boolean checkUnique(String s) {
		// TODO Auto-generated method stub

		boolean[] char_set = new boolean[256];
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			if (char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;

	}
}
