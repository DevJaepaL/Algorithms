package PythonSeries2;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_10984 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int A = Integer.parseInt(br.readLine());
            int totalGrade = 0;
            float gpaAvg = 0;

            for(int j = 0; j < A; j++) {
                int[] CLASS = new int[A];
                float[] GPA = new float[A];
                StringTokenizer st = new StringTokenizer(br.readLine());
                CLASS[j] = Integer.parseInt(st.nextToken());
                GPA[j] = Float.parseFloat(st.nextToken());
                totalGrade += CLASS[j];
                gpaAvg += CLASS[j] * GPA[j];
            }

            System.out.printf("%d %.1f\n", totalGrade, gpaAvg / totalGrade);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
