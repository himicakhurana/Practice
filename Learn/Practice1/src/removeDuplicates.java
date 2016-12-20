import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class removeDuplicates {

	public static void main(String[] args) throws IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		int t = Integer.parseInt(in2.readLine());
		mloop: for (int a0 = 0; a0 < t; a0++) {
			String str;
			str = in2.readLine();
			if (str.length() < 2) {
				System.out.println(str);
			} else {
				int i = 0;
				while (i < str.length()) {
					StringBuilder d = new StringBuilder(str);

				}

			}
		}

	}
}
