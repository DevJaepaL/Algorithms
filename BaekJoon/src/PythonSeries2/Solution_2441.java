package PythonSeries2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Solution_2441 {
    private static void stars(int n) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++)
                bw.write(" ");
            for(int j = n; j > i; j--)
                bw.write("*");

            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stars(N);
        br.close();
    } 
}
