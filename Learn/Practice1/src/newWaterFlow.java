import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class newWaterFlow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BufferedReader br = null;
		if (args.length > 1) {
			try {
				br = new BufferedReader(new FileReader("C:\\ALL_WORK_SPACE\\AI\\Search\\Search_BFS\\src\\xyz.txt"));

				PrintWriter writer;
				writer = new PrintWriter("output.txt", "UTF-8");

				String line = br.readLine();
				int cases = 0, startTime = 0;
				String method = null;
				Node source = null;
				GraphAdjacencyList adjList = null;
				List<String> nodeList = null;
				List<String> endList = null;
				int nodeId = 0, pipes = 0;
				while (line != null) {
					if (line.trim().matches("[0-9]+")) {

						cases = Integer.parseInt(line);
					}
					if (cases > 0) {
						for (int ij = 0; ij < cases; ij++) {
							adjList = null;
							nodeList = null;
							nodeList = new ArrayList<String>();
							line = br.readLine();
							method = line;
							line = br.readLine();
							source = new Node(line.trim(), null, 0, 0, nodeId,
									0, null);
							nodeId++;
							nodeList.add(line);
							line = br.readLine();
							endList = new ArrayList<String>();
							String[] tokens = line.trim().split(" ");

							endList.addAll(Arrays.asList(tokens));
							nodeList.addAll(Arrays.asList(tokens));
							line = br.readLine();
							String[] nodetokens = line.split(" ");
							nodeList.addAll(Arrays.asList(nodetokens));
							adjList = new GraphAdjacencyList(nodeList);
							adjList.searchMethod = method;
							adjList.startNode = source;
							adjList.endNodes = endList;
							line = br.readLine();
							pipes = Integer.parseInt(line.trim());
							for (int i = 0; i < pipes; i++) {
								line = br.readLine();

								List<Intervals> allintervals = new ArrayList<Intervals>();

								String[] stokens = line.trim().split(" ");
								if (null != stokens && stokens.length > 3) {
									String vertex1 = stokens[0];
									String vertex2 = stokens[1];
									int cost = 1;
									if (adjList.searchMethod
											.equalsIgnoreCase("UCS")) {
										cost = Integer.parseInt(stokens[2]);

									}
									int offPeriods = Integer
											.parseInt(stokens[3]);
									if (offPeriods > 0) {
										for (int j = 4; j < stokens.length; j++) {

											String[] intervaltokens = stokens[j]
													.split("-");
											if (intervaltokens.length == 2) {
												// List<Node> vList =
												// adjList.getEdge(vertex1);

												Intervals offInternal = new Intervals(
														Integer.parseInt(intervaltokens[0]),
														Integer.parseInt(intervaltokens[1]));
												allintervals.add(offInternal);

											}

										}
									}

									List<Intervals> offintervals = Solution
											.merge(allintervals);
									Node fromVertex = new Node(vertex1, null,
											0, 0, nodeId, 0, null);
									nodeId++;
									Node toVertex = new Node(vertex2, vertex1,
											0, cost, nodeId, nodeId - 1,
											offintervals);

									adjList.setEdge(fromVertex, toVertex);
								}

							}
							line = br.readLine();

							startTime = Integer.parseInt(line.trim());
							adjList.startTime = startTime;
							nodeId = 0;
							pipes = 0;
							if (adjList.searchMethod.equalsIgnoreCase("DFS")) {
								FinalSol s = Traversals.dfs(adjList);
								if (null != s) {
									writer.println(s.label + " " + s.time);

								} else
									writer.println("None");

							} else if (adjList.searchMethod
									.equalsIgnoreCase("BFS")) {
								FinalSol s = Traversals.bfs(adjList);
								if (null != s) {
									writer.println(s.label + " " + s.time);

								} else
									writer.println("None");

							} else {
								FinalSol s = Traversals.ucs(adjList);
								if (null != s) {
									writer.println(s.label + " " + s.time);

								} else
									writer.println("None");

							}

							line = br.readLine();

						}

					}

				}
				// String everything = sb.toString();
				System.out.println("Total Cases" + cases);
				writer.close();

				// System.out.println(everything);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.err.println(e);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(e);
			} finally {
				try {
					br.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.println(e);
				}
			}

		}
	}
}
