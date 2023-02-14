package PythonSeries1;
/*
 *  백준 문제 11557 : Yangjojang of The Year
 *  Site : https://www.acmicpc.net/problem/11557
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11557 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) 
        {
            int S = Integer.parseInt(br.readLine());
            String[] schoolName = new String[S];
            int[] drinkCnt = new int[S];
            int max = 0;
            String bestDrinkSchool = "";
            
            for(int j = 0; j < S; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                schoolName[j] = st.nextToken();
                drinkCnt[j] = Integer.parseInt(st.nextToken());
                max = drinkCnt[0];
                bestDrinkSchool = schoolName[0];
            }

            for(int k = 0; k < S; k++) {
                if(max < drinkCnt[k]) {
                    max = drinkCnt[k];
                    bestDrinkSchool = schoolName[k];
                }
            }

            System.out.println(bestDrinkSchool);
        }
    }
}
