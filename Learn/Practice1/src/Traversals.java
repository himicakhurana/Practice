import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * @author HIMICA
 *
 */
public class Traversals {

	public static int bfs(GraphAdjacencyList graph) {
		int solution = -1;
		Queue<Node> frontier = new LinkedList<Node>();
		Hashtable<String, Node> exploredTable = new Hashtable<String, Node>();
		frontier.add(graph.startNode);
		boolean goalFound = false;

		while (!frontier.isEmpty() && !goalFound) {
			Node frontNode = (Node) frontier.remove();
			for (String goalTest : graph.endNodes) {
				if (frontNode.label.equalsIgnoreCase(goalTest)) {
					goalFound = true;
					int cost = graph.startTime
							+ calculateCost(exploredTable, frontNode);
					solution =cost;
					break;

				}
			}
			List<Node> children = null;
			children = getChildren(frontNode, graph);

			if (null != children) {

				for (Node child : children) {

					if (null == existsExpored(child, exploredTable)
							&& null == existsFrontier(child, frontier)) {
						// check if goal

						frontier.add(child);

					}
				}
			}
			exploredTable.put(frontNode.label, frontNode);

		}
		// Clear visited property of nodes
		return solution;
	}

	public static FinalSol ucs(GraphAdjacencyList graph) {
		FinalSol solution = null;

		// BFS uses Queue data structure
		Comparator<Node> costComparator = new Comparator<Node>() {
			public int compare(Node o1, Node o2) {
				Node i1 = o1;
				Node i2 = o2;
				if ((i1.cost - i2.cost) == 0)
					return i1.label.compareTo(i2.label);

				else
					return i1.cost - i2.cost;
			}
		};

		Queue<Node> frontier = new PriorityQueue<Node>(graph.nodeList.size(),
				costComparator);
		Hashtable<String, Node> exploredTable = new Hashtable<String, Node>();
		graph.startNode.cost = graph.startNode.cost + graph.startTime;

		frontier.add(graph.startNode);
		int totalCost = 0;
		boolean goalFound = false;
		String finalGoal = null;
		while (!frontier.isEmpty() && !goalFound) {

			Node n = (Node) frontier.peek();
			int time = n.parentCost;
			if (n.isActive(time)) {
				// active = true;
				n = (Node) frontier.remove();
				for (String goalTest : graph.endNodes) {
					if (n.label.equalsIgnoreCase(goalTest)) {
						if (!goalFound) {
							goalFound = true;
							totalCost = n.cost;
							finalGoal = goalTest;
						} else if (n.cost < totalCost) {
							goalFound = true;
							totalCost = n.cost;
							finalGoal = goalTest;
						}

					}
				}
			} else {
				// frontier.remove();
				// frontier.add(n);
				continue;
			}

			List<Node> children = null;

			children = getChildren(n, graph);
			if (null != children) {
				for (Node child : children) {
					child.parentCost = n.cost;

					if (null == existsExpored(child, exploredTable)
							&& null == existsFrontier(child, frontier)) {
						child.cost = child.cost + n.cost;
						time = child.parentCost;
						if (child.isActive(time)) {
							frontier.add(child);
						}

					} else if (null != existsFrontier(child, frontier)) {
						Node node = existsFrontier(child, frontier);
						child.cost = child.cost + n.cost;
						time = child.parentCost;
						if (child.cost < node.cost && child.isActive(time)) {
							frontier.remove(node);

							frontier.add(child);

						}
						/*
						 * else if(!n.isActive(n.parentCost)){
						 * frontier.remove(node); child.cost = child.cost +
						 * node.cost; time=child.cost;
						 * if(child.isActive(child.parentCost)){
						 * 
						 * frontier.add(child); }
						 * 
						 * 
						 * }
						 */
					}

					else if (null != existsExpored(child, exploredTable)) {
						Node node = existsExpored(child, exploredTable);
						child.cost = child.cost + n.cost;
						time = child.cost;

						if ((child.cost < node.cost) && child.isActive(time)) {
							exploredTable.remove(node.label);

							frontier.add(child);

						}
						/*
						 * else if(!n.isActive(n.parentCost)){
						 * exploredTable.remove(node.label); child.cost =
						 * child.cost + node.cost; time=child.parentCost;
						 * if(child.isActive(time)){
						 * 
						 * frontier.add(child);
						 * 
						 * }
						 * 
						 * }
						 */
					}

				}
			}
			exploredTable.put(n.label, n);

		}
		if (!goalFound) {
		} else {
			solution = new FinalSol(totalCost % 24, finalGoal);

		}
		return solution;

	}

	private static Node existsFrontier(Node child, Queue<Node> frontier) {
		// TODO Auto-generated method stub
		Iterator<Node> fNodes = frontier.iterator();

		while (fNodes.hasNext()) {
			Node n = fNodes.next();
			if (n.label.equalsIgnoreCase(child.label)) {
				return n;
			}

		}

		return null;
	}

	private static List<Node> getChildren(Node n, GraphAdjacencyList graph) {
		if (graph != null && graph.Adjacency_List != null) {
			List<Node> nodes = graph.Adjacency_List.get(n.label);
			Comparator<Node> comparator = new Comparator<Node>() {
				public int compare(Node o1, Node o2) {
					Node i1 = o1;
					Node i2 = o2;
					return i1.label.compareTo(i2.label);
				}
			};
			Comparator<Node> costComparator = new Comparator<Node>() {
				public int compare(Node o1, Node o2) {
					Node i1 = o1;
					Node i2 = o2;
					return i1.cost - i2.cost;
				}
			};
			if (null != nodes) {
				if (graph.searchMethod.equalsIgnoreCase("BFS")) {
					Collections.sort(nodes, comparator);
				} else if (graph.searchMethod.equalsIgnoreCase("DFS")) {

					Collections.sort(nodes,
							Collections.reverseOrder(comparator));

				} else if (graph.searchMethod.equalsIgnoreCase("UCS")) {
					Collections.sort(nodes, costComparator);
				}

				return nodes;
			}
		}
		return null;
		// TODO Auto-generated method stub
	}

	class NodeCostComparator implements Comparator<Node> {
		@Override
		public int compare(Node o1, Node o2) {
			Node i1 = (Node) o1;
			Node i2 = (Node) o2;
			return i1.cost - i2.cost;
		}
	}

	// DFS traversal of a tree is performed by the dfs() function
	public static FinalSol dfs(GraphAdjacencyList graph) {
		FinalSol solution = null;

		// DFS uses Stack data structure
		Stack<Node> s = new Stack<Node>();
		Hashtable<String, Node> exploredTable = new Hashtable<String, Node>();

		boolean goalFound = false;
		s.push(graph.startNode);
		while (!s.isEmpty()) {
			Node n = (Node) s.peek();
			List<Node> children = null;
			children = getChildren(n, graph);
			// explored.add(n.label);
			exploredTable.put(n.label, n);
			Node checkNode = (Node) s.pop();
			if (null != children) {
				for (Node child : children) {
					if (null == existsExpored(child, exploredTable)) {
						s.push(child);
					}
				}
			}
			for (String goalTest : graph.endNodes) {
				if (checkNode.label.equalsIgnoreCase(goalTest)) {
					goalFound = true;
					int cost = graph.startTime
							+ calculateCost(exploredTable, checkNode);
					solution = new FinalSol(cost % 24, goalTest);
					break;
				}

			}
			if (goalFound) {
				break;
			}
		}
		return solution;

	}

	private static int calculateCost(Hashtable<String, Node> exploredTable,
			Node checkNode) {
		// TODO Auto-generated method stub

		Node parent = exploredTable.get(checkNode.parentId);
		int cost = checkNode.cost;
		while (null != parent) {
			cost = cost + parent.cost;
			if (parent.parentId == null) {
				parent = null;
			} else {
				parent = exploredTable.get(parent.parentId);
			}
		}
		return cost;
	}

	private static Node existsExpored(Node child,
			Hashtable<String, Node> exploredTable) {
		if (exploredTable.containsKey(child.label)) {
			return exploredTable.get(child.label);
		}

		return null;
	}
}
