public class Solution {
	public static void main(String[] args) {
		System.out.println(removeDuplicateLetters("bcabc"));
	}
	
	public static String removeDuplicateLetters(String s) {

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			s=s.replaceFirst(String.valueOf(ch), "|");
			s=s.replaceAll(String.valueOf(ch), "");
			s=s.replaceFirst("|", String.valueOf(ch));

		}
		return s;

	}
}