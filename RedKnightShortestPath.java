import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Cord {
    int x;
    int y;
    String move;

    public Cord(int x, int y, String move) {
        this.x = x;
        this.move = move;
        this.y = y;
    }

}

class Result {

    /*
     * Complete the 'printShortestPath' function below.
     *
     * The function accepts following parameters:
     * 1. INTEGER n
     * 2. INTEGER i_start
     * 3. INTEGER j_start
     * 4. INTEGER i_end
     * 5. INTEGER j_end
     */

    public static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
        if (!BFS(new Cord(i_start, j_start, ""), new Cord(i_end, j_end, ""), n)) {
            System.out.println("Impossible");
        }
    }

    public static boolean BFS(Cord curr, Cord goal, int n) {
        int[][] moves = { { -2, -1 }, { -2, 1 }, { 0, 2 }, { 2, 1 }, { 2, -1 }, { 0, -2 } };
        String[] moveStrings = { "UL", "UR", "R", "LR", "LL", "L" };
        Map<Cord, Cord> parents = new HashMap<>();
        LinkedList<Cord> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        int col = visited.length;
        int row = visited[0].length;

        queue.add(curr);
        while (!queue.isEmpty()) {
            curr = queue.poll();
            visited[curr.x][curr.y] = true;

            // Check matching and then print
            if (curr.x == goal.x && curr.y == goal.y) {
                String print = "";
                int i = -1;
                while (curr != null) {
                    print = curr.move + " " + print;
                    curr = parents.get(curr);
                    i++;
                }
                System.out.println(i);
                System.out.println(print.substring(1));
                return true;
            }

            // Add neighbours to queue
            for (int i = 0; i < moves.length; i++) {
                int x = curr.x + moves[i][0];
                int y = curr.y + moves[i][1];
                if (y < col && x < row && x >= 0 && y >= 0 && !visited[x][y]) {
                    Cord nm = new Cord(x, y, moveStrings[i]);
                    queue.add(nm);
                    parents.put(nm, curr);
                }
            }
        }
        return false;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i_start = Integer.parseInt(firstMultipleInput[0]);

        int j_start = Integer.parseInt(firstMultipleInput[1]);

        int i_end = Integer.parseInt(firstMultipleInput[2]);

        int j_end = Integer.parseInt(firstMultipleInput[3]);

        Result.printShortestPath(n, i_start, j_start, i_end, j_end);

        bufferedReader.close();
    }
}
