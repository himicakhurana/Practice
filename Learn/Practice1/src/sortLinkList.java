import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Given two sorted LinkedLists, merge them into one sorted LinkedList
/**
 * @author HIMICA
 *
 */
public class sortLinkList {
	public static void main(String[] args) {
		System.out.println("Jai Shree Ganesha");
		System.out.println("Jai Sai Nath");

		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list2.add(2);
		list2.add(4);
		list2.add(6);
		List<Integer> result = new ArrayList<Integer>();
		int n = list1.size();
		int m = list2.size();

		int i = 0, j = 0, elem1 = 0, elem2 = 0;
		while (i < n && j < m) {
			elem1 = list1.get(i);			
			elem2 = list2.get(j);
			
			if (elem1 < elem2) {			
				result.add(elem1);
				i++;				
			} else {
				result.add(elem2);				
				j++;
			}						
		}

		// add remaining of i
		while (i < n) {
			elem1 = list1.get(i);			
			result.add(elem1);
			i++;				
		}
		
		// add remaining of j
		while (j < m) {
			elem2 = list2.get(j);
			result.add(elem2);				
			j++;
		}		

		System.out.println( result);
		
		
		
	}

}
