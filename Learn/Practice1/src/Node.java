import java.util.List;

public class Node {
	public String label = "";
	int id = 0;
	int pid = 0;
	String parentId;
	int depth = 0;
	int cost = 0;
	int parentCost=0;

	public boolean visited = false;

	public Node(String l, String parentId, int depth, int cost, int id,
			int pid) {
		this.label = l;
		this.id = id;
		this.pid = pid;
		this.parentId = parentId;
		this.depth = depth;
		this.cost = cost;
	
	}

	

}
