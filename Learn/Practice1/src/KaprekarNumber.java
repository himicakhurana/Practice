import java.util.Scanner;

public class KaprekarNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int count=0;
		for (int p = i; p <= j; p++) {
			if (isKapekar(p)) {
				System.out.print(p+" ");
			count++;
			}

		}
		if(count>0){
		System.out.println("");
		}
		else{
			System.out.println("INVALID RANGE");
			
		}}

	private static boolean isKapekar(int p) {
		long square = (long) Math.pow(p, 2);
		String sq = Long.toString(square);
		int len = sq.length();
		int mid=len/2;
		long ten = (long) Math.pow(10, len -mid);

		long firstHalf = square / ten;
		long secondHalf = square % ten;

		long sum = firstHalf + secondHalf;

			if (sum == p)
				return true;
		// TODO Auto-generated method stub
		return false;
	}

}
