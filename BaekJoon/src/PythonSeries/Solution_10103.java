package PythonSeries1;
/*
 *  백준 문제 10103 : 주사위 게임
 *  Site : https://www.acmicpc.net/problem/10103
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class Solution_10103 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int diceCnt = Integer.parseInt(br.readLine());
        int A = 100;
        int B = 100;
        for(int i = 0; i < diceCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstDice = Integer.parseInt(st.nextToken());
            int secDice = Integer.parseInt(st.nextToken());
            if(firstDice < secDice) 
                A -= secDice;
            else if(firstDice == secDice) 
                continue;
            else
                B -= firstDice;
        }

        bw.write(String.valueOf(A));
        bw.write("\n");
        bw.write(String.valueOf(B));

        br.close();
        bw.flush();
        bw.close();
    }
}
