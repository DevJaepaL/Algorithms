package PythonSeries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_9325 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int CAR = Integer.parseInt(br.readLine());
            int optionCnt = Integer.parseInt(br.readLine());

            for(int j = 0; j < optionCnt; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int option = Integer.parseInt(st.nextToken());
                int price = Integer.parseInt(st.nextToken());
                int OPTIONS = option * price;
                CAR += OPTIONS;
            }

            bw.write(CAR + "\n");
            bw.flush();
        }

        br.close();
        bw.close();
    }
    public static void main(String[] args) throws IOException {
        solution();
    }
}
