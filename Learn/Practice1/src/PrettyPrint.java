import java.util.ArrayList;

public class PrettyPrint {
	public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {

		int[][] arr = new int[2 * a - 1][2 * a - 1];
		
		ArrayList<ArrayList<Integer>> finalList = null;
		return finalList;
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> finalList = prettyPrint(3);
		System.out.println(finalList);
	}

}
