//find the length of both the linked lists say : a_len and b_len
//find the lenDiff = (a_len ~ b_len)
//traverse the longer linked list by lenDiff
//Now traverse both the lists at the same time
//check whether nodes are same, if yes then we have found the intersection point
//if we reach the end of the link lists then there is no intersection point.
public class Intersec {

	public LinkedListIntersection a;
	public LinkedListIntersection b;

	public void createLists() {
		a = new LinkedListIntersection();
		a.addAtEnd(1);
		a.addAtEnd(1);
		a.addAtEnd(1);
		a.addAtEnd(1);
		a.addAtEnd(1);

		a.addAtEnd(1);
		Node tmp = a.addAtEnd(30);

		a.addAtEnd(10);
		a.addAtEnd(20);
		a.addAtEnd(40);
		a.addAtEnd(50);
		a.addAtEnd(60);
		System.out.print("List A : ");
		a.display();
		b = new LinkedListIntersection();
		b.addAtEnd(15);

		b.addAtEnd(5);
		b.createIntersection(a, tmp);
		System.out.print("List B : ");
		b.display();
	}

	Node InsertNth(Node head, int data, int position) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		if (head == null) {
			return head;
		}
		Node newNode = new Node(data);
		newNode.data = data;
		Node h = head;
		if (position == 0) {
			newNode.next = head;
			return newNode;
		}
		int pos = 0;
		while (head.next != null && pos != position) {
			pos++;
			head = head.next;
		}
		if (pos == position) {
			newNode.next = head.next;
			head.next = newNode;
		} else {
			head.next = newNode;
		}

		return h;

	}

	Node Delete(Node head, int position) {
		if (head == null) {
			return null;
		}

		int pos = 0;
		Node h = head, prev = null;
		while (head != null && pos != position) {
			pos++;
			prev = head;
			head = head.next;
		}
		if (prev.next != null) {
			prev.next = head.next;
		}
		return h;
		// Complete this method

	}

	void ReversePrint(Node head) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		if (head == null) {
			return;
		}
		Node prev = head, newR = head.next;
		while (head != null) {
			prev = head;
			newR.next = prev;
			head = head.next;
		}
		while (newR != null) {
			System.out.println(newR.data);
			newR = newR.next;
		}

	}

	Node MergeLists(Node headA, Node headB) {
		if (headA == null || headB == null) {
			return headA == null ? headA : headB;
		}
		Node newList = null;
		if (headA.data > headB.data) {
			newList = headA;
			headA = headA.next;
		} else {
			newList = headB;
			headB = headB.next;

		}
		while (headA != null && headB != null) {
			if (headA.data > headB.data) {
				newList.next = headA;
				Node p = headA;
				newList = p;
				headA = headA.next;
			} else {
				newList.next = headB;
				Node p = headB;
				newList = p;
				headB = headB.next;
			}

		}
		if (headA != null || headB != null) {
			newList.next = headA != null ? headA : headB;
		}
		return newList;
		// This is a "method-only" submission.
		// You only need to complete this method

	}

	public void findIntersectionByLength() {
		int a_len = 0;
		int b_len = 0;
		int lenDiff = 0;
		boolean intsctFound = false;
		Node an = a.head;
		Node bn = b.head;
		while (an != null) {
			an = an.next;
			a_len++;
		}
		while (bn != null) {
			bn = bn.next;
			b_len++;
		}

		an = a.head;
		bn = b.head;
		if (a_len > b_len) {
			lenDiff = a_len - b_len;
			// System.out.print("length diff " +lenDiff );
			while (lenDiff != 0) {
				an = an.next;
				lenDiff--;
			}
		} else {
			lenDiff = b_len - a_len;
			while (lenDiff != 0) {
				bn = bn.next;
				lenDiff--;
			}
		}
		while (an != null && bn != null) {
			// System.out.print(an.data + " " + bn.data);
			if (an == bn) {
				System.out.print("Intersection found at " + an.data);
				intsctFound = true;
				break;
			} else {
				an = an.next;
				bn = bn.next;
			}
		}
		if (intsctFound != true) {
			System.out.print("Intersection Not Found");
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		Intersec i = new Intersec();
		i.createLists();
		i.findIntersectionByLength();
	}
}

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedListIntersection {
	public Node head;

	public LinkedListIntersection() {
		head = null;
	}

	public Node addAtEnd(int data) {
		Node n = new Node(data);

		if (head == null) {
			n.next = head;
			head = n;
		} else {
			Node currNode = head;
			while (currNode.next != null) {
				// System.out.print("---->" + currNode.data);
				currNode = currNode.next;
			}
			currNode.next = n;
		}
		return n;
	}

	public void createIntersection(LinkedListIntersection a, Node nd) {
		Node hd = a.head; // this is the list to whcih another list will
							// intersect, in our example its list a
		while (hd != nd) {
			hd = hd.next;
		}
		Node currNode = head;// this is for the list which will connect, in our
								// example its list b
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = hd;
		;
	}

	public void display() {
		System.out.println("");
		Node currNode = head;
		while (currNode != null) {
			System.out.print("->" + currNode.data);
			currNode = currNode.next;
		}
		System.out.println("");
	}
}