package PythonSeries;
/*
 *  백준 문제 10102 : 개표
 *  Site : https://www.acmicpc.net/problem/10102
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Solution_10102 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int picks = Integer.parseInt(br.readLine());
        String vote = br.readLine();
        int aCnt = 0;
        int bCnt = 0;
        for(int i = 0; i < vote.length(); i++) {
            if(vote.charAt(i) == 'A') 
                aCnt += 1;
            else 
                bCnt += 1;
        }

        if(aCnt < bCnt)
            System.out.println("B");
        else if(aCnt == bCnt) 
            System.out.println("Tie");
        else 
            System.out.println("A");
    }
}
