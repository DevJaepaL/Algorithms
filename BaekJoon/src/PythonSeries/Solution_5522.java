package PythonSeries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution_5522 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            int JOI = Integer.parseInt(br.readLine());
            sum += JOI;
        }
        br.close();
        bw.write(String.valueOf(sum));
        bw.close();
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}