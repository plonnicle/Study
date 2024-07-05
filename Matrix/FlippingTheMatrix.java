//Question: Given an initial 2n * 2n matrix where each cell contains an integer, reverse its columns and / or rows to find the maximum sum of elements in the n * n submatrix in its upper left quadrant. The first line of input contains integer q which is the number of queries. The next q sets of lines are in the following format: the first line contains an integer n while the next 2n lines contain 2n space seperarated integers matrix[i][j] in row i of the matrix.
//Abstract: Judge the size using matrix.size(). Then keep a running sum starting at 0, and run through a nested for loop: outer loop goes through i (rows) < size , inner loop goes by j (columns) < size. Add to the sum by finding the max of that particular quadrant.
//Solution: 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
    // Write your code here
        int sum = 0;
        int size = matrix.size();
        for(int i=0;i<size/2;i++){
            for(int j=0;j<size/2;j++){
                sum+=Math.max(matrix.get(i).get(j),
                    Math.max(matrix.get(i).get(size-1-j),
                    Math.max(matrix.get(size-1-i).get(j),
                    matrix.get(size-1-i).get(size-1-j))));
            }
        }
        return sum;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Result.flippingMatrix(matrix);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
