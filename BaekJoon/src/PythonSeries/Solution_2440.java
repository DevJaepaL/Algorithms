package PythonSeries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_2440 {
    static void star(int N) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = 0;
        while (i < N) {
            for(int j = 0; j < N - i; j++) {
                bw.write("*");
            }
            bw.write("\n");
            i--;
        }

        bw.flush();
        bw.close();
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stars = Integer.parseInt(br.readLine());
        star(stars);
        br.close();
    }
}
