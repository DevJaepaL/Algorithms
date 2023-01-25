package PythonSeries1;
/*
 *  백준 문제 10214 : 최소공배수
 *  Site : https://www.acmicpc.net/problem/10214
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Solution_10214 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) 
        {
            int Y = 0;
            int K = 0;

            for(int j = 0; j < 9; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int yScore = Integer.parseInt(st.nextToken());
                int kScore = Integer.parseInt(st.nextToken());
                Y += yScore;
                K += kScore;
            }

            if(Y < K) {
                bw.write("Korea");
                bw.write("\n");
            }
            else if (Y == K) {
                bw.write("Draw");
                bw.write("\n");
            }
            else {
                bw.write("Yonsei");
                bw.write("\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
