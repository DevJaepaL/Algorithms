package PythonSeries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Solution_1977 {
    static void findSquare(int A, int B) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int minNum = 10000; // 10,000 is 100 square;
        int sumSqr = 0;
        int[] sqr = new int[101];

        for(int i = 1; i < sqr.length; i++) {
            sqr[i] = i * i;
            if(sqr[i] >= A && sqr[i] <= B) {
                sumSqr += sqr[i];
                if(sqr[i] < minNum)
                    minNum = sqr[i];
            }    
        }    

        if(sumSqr == 0)
            bw.write("-1");
        else {
            bw.write(String.valueOf(sumSqr) + "\n" + minNum);
        }
        bw.close();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        br.close();
        findSquare(N, M);
    }
}
