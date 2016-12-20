import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PallindromeIndex {

	public static void main(String[] args) throws IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		int t = Integer.parseInt(in2.readLine());
		mloop: for (int a0 = 0; a0 < t; a0++) {
			String str;
			str = in2.readLine();
			StringBuilder sb = new StringBuilder(str);
			int output = -1;
			boolean res = str.equals(sb.reverse().toString());
			if (res == true) {
				output = -1;
			} else {
				// while (output < 0) {
				for (int i = 0; i < str.length(); i++) {

					sb = new StringBuilder(str);

					String sss = sb.deleteCharAt(i).toString();
					sb = new StringBuilder(sss);

					boolean res2 = sss.equals(sb.reverse().toString());
					if (res2 == true) {
						output = i;
						break;
					}
				}
			}
			// }
			System.out.println(output);
		}
	}

}
