import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main3 {
	public void remove (T value)
	{
		Node<T> prev = null;
		Node<T> cur = head;
		while(cur != null) {
			if(cur.item.equals(value)) {
				// Found something to remove
				count--;
				if(prev == null) {
					head = cur.next;
				} else {
					prev.next = cur.next;
				}
			}
			// Maintain loop invariant: prev is the node before cur.
			if(cur.next != head) {
				prev = cur;
			}
			cur = cur.next;
		}
	}
	
	
	static LinkedListNode removeNodes(LinkedListNode head, int x) {
		if(head == null) return null;
		 
		LinkedListNode prev = null;
		LinkedListNode cur = head;
		while(cur != null) {
			if(cur.val>x) {
				// Found something to remove
				if(prev == null) {
					head = cur.next;
				} else {
					prev.next = cur.next;
				}
			}
			// Maintain loop invariant: prev is the node before cur.
			if(cur.next != head) {
				prev = cur;
			}
			cur = cur.next;
		}
		return head;
    }
	
	public static Node deleteNode(Node list, String str) {
		LinkedListNode temp = list;
		LinkedListNode prev = list;

		  do {
		    if (temp.val>x) {
		      if (prev.next == null) {
		        prev.next=null;
		      } else {
		        prev.next=prev.next.next;
		      }
		    }
		    prev = temp;
		    temp = temp.next;
		  } while (temp != null);

		  return list;
		}
	static void arrangeCoins(long[] coins) {
for(int i=0;i<coins.length;i++)
{
	if(coins[i]%2==0){
		System.out.println(coins[i]/2);
	}else{
		System.out.println((coins[i]/2)+1);
	}
	
	}
    }
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		Map<String, String> relMap = new HashMap<>();
		Map<String, Integer> level = new HashMap<>();
		int l = 1000;
		String rel[] = null;
		if ((s = in.readLine()) != null) {
			rel = s.split(",");
		}
		String lkey = null;
		List<String> persons = new ArrayList<>();
		for (String r : rel) {

			String res[] = r.split("->");
			if (res.length == 2) {
				/*
				 * List<String> p = new ArrayList<>(); p.add(res[1]); if
				 * (relMap.containsKey(res[0])) {
				 * relMap.get(res[0]).add(res[1]); } else { relMap.put(res[0],
				 * p); }
				 */
				relMap.put(res[1], res[0]);
				if (!level.containsKey(res[0])) {
					level.put(res[0], l);
				} else {

				}
				if (!level.containsKey(res[1])) {
					level.put(res[1], l - 1);
				} else {

				}
				lkey = res[0];
			} else {
				persons.add(res[0]);
			}

		}
		String m1 = relMap.get(persons.get(0)), m2 = relMap.get(persons.get(1));
		boolean x = true;
		while (m1 != m2 && x == false) {
			m2 = relMap.get(m2);
			if (m2 == null) {
				x = false;
			}
		}
		if (x) {
			System.out.println(m1);
		} else {
			m1 = relMap.get(persons.get(0));
			m2 = relMap.get(persons.get(1));

			x = true;
			while (m1 != m2 && x == false) {
				m1 = relMap.get(m1);
				if (m1 == null) {
					x = false;
				}
			}
		}
		System.out.println(m1);

	}
}
