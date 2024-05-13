//Question: A super digit of an integer x is defined using the following rules: if x only has one digit, then its super digit is x, otherwise the super digit is equal to the super digit of the sum of the digits of x. Consider k, which represents the number of times x is to be concatenated to itself. In superDigit(), return the this new number with x and k as variables.
//Abstract: First, check to see if the value is only one digit. If so, return that value. Else, repeat the number k times and combine as a string the value together to generate pre-superdigit. Then, use recursion to split it all apart and add it together. Repeat this step until the value only has one digit.
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
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
    // Write your code here
        if (n.length() == 1 && k == 1) {
            return Integer.valueOf(n);
        } else {
            String[] digits = n.split("");
            long sum = 0;
            for (String digit : digits) {
                sum+= Integer.valueOf(digit);
            }
            sum = sum * k;
            return superDigit(String.valueOf(sum), 1);
        }
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
