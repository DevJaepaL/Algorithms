package PythonSeries2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Solution_2748 {
    public static long[] DP = new long[91];
    public static long fibonacci(int A) {
        if(A == 1 || A == 2)
            return 1;
        if(DP[A] != 0)
            return DP[A];
        DP[A] = fibonacci(A - 1)  + fibonacci(A - 2);
        return DP[A];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(fibonacci(N)));
        br.close();
        bw.close();
    }
}
