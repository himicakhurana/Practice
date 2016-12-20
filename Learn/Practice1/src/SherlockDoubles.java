import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherlockDoubles {
	public static void main(String[] args) throws IOException {
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(System.in));
		int t = Integer.parseInt(in2.readLine());
		mloop: for (int a0 = 0; a0 < t; a0++) {
			String s1;
			s1 = in2.readLine();
			String[] s = s1.split(" ");
			long lowLimit = Long.parseLong(s[0]);
			long upLimit = Long.parseLong(s[1]);
			int count = 0;
			/*long number = lowLimit;
			while (number < upLimit + 1)
				;
			{
				long sqrt = (long) Math.sqrt(number);

				if (sqrt * sqrt == number) {

					count++;
					number = 2 * number + 1;

				} else {
					number++;
				}
			}*/
			int smallestNumber = (int)Math.ceil(Math.sqrt(lowLimit));
	        int highestNumber = (int)Math.floor(Math.sqrt(upLimit));
			System.out.println(highestNumber-smallestNumber+1);

		}
	}
}