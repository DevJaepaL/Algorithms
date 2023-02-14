package PythonSeries;
/*
 *  백준 문제 10162 : 전자레인지
 *  Site : https://www.acmicpc.net/problem/10162
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution_10162 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int timer = Integer.parseInt(br.readLine());
        int A = 0;
        int B = 0;
        int C = 0;
        if (timer % 10 != 0)
            System.out.print(-1);
        else {
            A = timer / 300;
            timer = timer % 300;
            B = timer / 60;
            timer = timer % 60;
            C = timer / 10;
            System.out.printf("%d %d %d", A,B,C);
        }

        br.close();
    }
}
