import java.util.LinkedList;
import java.util.Queue;

public class Trees {
	class Node {
		int data;
		Node left;
		Node right;
	}

	public static void main(String args[]) {

	}

	void LevelOrder(Node root) {
		Queue<Trees.Node> n = new LinkedList<Trees.Node>();
		if (root == null) {
			return;
		}
		n.add(root);
		while (!n.isEmpty()) {
			Node r = n.poll();
			System.out.println(r.data + " ");
			n.add(r.left);
			n.add(r.right);

		}
	}

}
