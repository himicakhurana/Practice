import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n, p, q;
		String[] strr = null;
		if ((s = in.readLine()) != null) {
			strr = s.split(" ");
		}
		n = Integer.parseInt(strr[0]);
		p = Integer.parseInt(strr[1]);
		q = Integer.parseInt(strr[2]);
		for (int i = 1; i <= n; i++) {
			String s1 = Integer.toString(i);
			String s2 = "";
			if ((i % p == 0) || (i % q == 0)) {
				s2 = "OUT";
			}
			if (s1.indexOf(Integer.toString(p)) > -1
					|| s1.indexOf(Integer.toString(q)) > -1) {
				s2=s2+("THINK");
			}
			if (s2.isEmpty()) {
				s2 = s1;
			}
			if (i != n)
				System.out.print(s2 + ",");
			else
				System.out.print(s2);

		}

	}
}
