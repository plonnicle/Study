import java.io.*;
import java.util.*;

//Question: Given a graph, determine the distance from the start node to each of its descendants and return the list in node number order, ascending. If a node is disconnected, its distance should be -1. Each edge has a weight of 6 in this example. Format for input is first line q (number of queries). q contains two space separated integers, n (number of nodes) and m (number of edges). m contains two space-separated integers which represent nodes (u, v). The last line contains a single integer, s, the index of the starting node
//Abstract: Two methods, static void BFS and public static void main. BFS: arguments for adjacent nodes list, visited ints array, int s for position.
//Solution:

public class Solution {

    static void BFS(ArrayList<Integer>[] adj, int[] visited, int s) {
        Queue<Integer> queue = new LinkedList<>(); //Use Queue interface for linked list instance
        queue.add(s); //Add root node
        visited[s] = 0; //Set visited position of root node to 0

        while (!queue.isEmpty()) {
            int node = queue.poll(); //.poll() returns and removes the element at the front of the container (linked list)

            for (int i = 0; i < adj[node].size(); ++i) { //
                int neighbor = adj[node].get(i); //Get the next node in line

                if (visited[neighbor] == -1) {
                    visited[neighbor] = visited[node] + 6; //Add the weight of the edge between the current node and its nearest neighbor
                    queue.add(neighbor); //Add neighbor node to the queue to be explored next
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine()); //Read each line in the reader queue

        for (int i = 0; i < q; ++i) { //For each instance in the queue
            String[] nm = br.readLine().split(" "); //Split the data into number of nodes and number of edges
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);

            ArrayList<Integer>[] adj = new ArrayList[n + 1];
            for (int j = 1; j <= n; ++j) {
                adj[j] = new ArrayList<>();
            }

            for (int j = 1; j <= m; ++j) {
                String[] uv = br.readLine().split(" ");
                int u = Integer.parseInt(uv[0]);
                int v = Integer.parseInt(uv[1]);
                adj[u].add(v);
                adj[v].add(u);
            }

            int s = Integer.parseInt(br.readLine());

            int[] visited = new int[n + 1];
            Arrays.fill(visited, -1);

            BFS(adj, visited, s);

            for (int j = 1; j <= n; ++j) {
                if (visited[j] != 0) {
                    System.out.print(visited[j] + " ");
                }
            }

            System.out.println();
        }
    }
}
