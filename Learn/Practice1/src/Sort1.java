import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		int x = Integer.parseInt(in2.readLine());

		int y = Integer.parseInt(in2.readLine());
		String s = in2.readLine();
		String[] nos = s.trim().split(" ");
		//int [] arr;
		mloop: for (int i = 0; i < y; i++) {
			// TODO Auto-generated method stub
		if(x==Integer.parseInt(nos[i].trim())){
			System.out.println(i);
			break;
		}
		}
	}

}
