package PythonSeries;
/*
 *  백준 문제 2476 : 주사위 게임
 *  Site : https://www.acmicpc.net/problem/2476
 */
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Solution_2476 {
   public static void main(String args[]) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tryNum = Integer.parseInt(br.readLine());
        int[] price = new int[tryNum];
        int maxPrice = 0;
        
        for(int i = 0; i < tryNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int dice0 = Integer.parseInt(st.nextToken());
            int dice1 = Integer.parseInt(st.nextToken());
            int dice2 = Integer.parseInt(st.nextToken());

            if(dice0 == dice1 && dice1 == dice2)
                price[i] = 10000 + dice0 * 1000;
            else if(dice0 == dice1 || dice0 == dice2)
                price[i] = 1000 + dice0 * 100;
            else if(dice1 == dice2)
                price[i] = 1000 + dice1 * 100;
            else
                price[i] = Math.max(dice0, Math.max(dice1, dice2)) * 100;
        
            maxPrice = price[0];
        }

        for(int j = 0; j < price.length; j++) {
            maxPrice = Math.max(maxPrice, price[j]);
        }

        System.out.print(maxPrice);
    }   
}
