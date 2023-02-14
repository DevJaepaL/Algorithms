package PythonSeries;
/*
 *  백준 문제 100886 : 0 = not cute / 1 = cute
 *  Site : https://www.acmicpc.net/problem/10886
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Solution_10886 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int cute = 0;
        int notCute = 0;

        for(int i = 0; i < cnt; i++) {
            int cuteVote = Integer.parseInt(br.readLine());
            if(cuteVote == 1) 
                cute += 1;
            else 
                notCute += 1;
        }

        if(cute < notCute)
            System.out.println("Junhee is not cute!");
        else
            System.out.println("Junhee is cute!");
    }
}
