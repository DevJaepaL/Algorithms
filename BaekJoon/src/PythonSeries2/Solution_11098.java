package PythonSeries2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Solution_11098 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            int[] prices = new int[C];
            String[] playersName = new String[C];
            int bestPrice = 0;
            String bestPlayer = "";
            
            for(int j = 0; j < C; j++)  {
                StringTokenizer st = new StringTokenizer(br.readLine());
                prices[j] = Integer.parseInt(st.nextToken());
                playersName[j] = st.nextToken();
            }  

            bestPrice = prices[0];
            bestPlayer = playersName[0];

            for(int k = 1; k < C; k++) {
                if(bestPrice < prices[k]) {
                    bestPrice = prices[k];
                    bestPlayer = playersName[k];
                }
                else continue;
            }

            bw.write(bestPlayer + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
}
    public static void main(String args[]) throws IOException {
        solution();
    }
}
