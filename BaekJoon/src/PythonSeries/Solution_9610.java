package PythonSeries;
/*
 *  백준 문제 9610 : 사분면
 *  Site : https://www.acmicpc.net/problem/9610
 */
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
public class Solution_9610 {
    static void quadrant() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dotCnt = Integer.parseInt(br.readLine());
        int[] x = new int[dotCnt];
        int[] y = new int[dotCnt];
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int axis = 0;        
        
        for(int i = 0; i < dotCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < x.length; i++) {
            if(x[i] >= 1 && y[i] >= 1)
                    q1 += 1;
            else if(x[i] <= -1 && y[i] >= 1)
                    q2 += 1;
            else if(x[i] <= -1 && y[i] <= -1)
                    q3 += 1;
            else if(x[i] >= 1 && y[i] <= -1)
                    q4 += 1;
            else
                axis += 1;
        }
    
        System.out.println("Q1: " + q1);
        System.out.println("Q2: " + q2);
        System.out.println("Q3: " + q3);
        System.out.println("Q4: " + q4);
        System.out.println("AXIS: " + axis);
        br.close();
    }
    public static void main(String args[]) throws Exception {
        quadrant();
    }
}
