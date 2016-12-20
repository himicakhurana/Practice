import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> nVal = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			String key = in.next();
			if (nVal.containsKey(key)) {
				nVal.put(key, nVal.get(key) + 1);
			} else {
				nVal.put(key, 1);

			}
		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			String key = in.next();
			if (nVal.containsKey(key)) {
				System.out.println(nVal.get(key));
			} else {
				System.out.println("0");

			}
		}
	}

}
