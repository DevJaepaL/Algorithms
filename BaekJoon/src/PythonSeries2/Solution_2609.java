package PythonSeries2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_2609 {
    static long GCD(long A, long B) {
        long gcd = 0;
        long max = Math.max(A, B);
        for (int i = 1; i <= max; i++) {
            if (A % i == 0 && B % i == 0)
                gcd = i;
        }
        return gcd;
    }

    static void LCM(long A, long B) {
        System.out.println(GCD(A, B));
        System.out.print(A * B / GCD(A, B));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        LCM(a, b);
        br.close();
    }
}
