package PythonSeries1;
/*
 *  백준 문제 5063 : TGN
 *  Site : https://www.acmicpc.net/problem/5063
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Solution_5063 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCase; i++) 
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(r + c < e)
                System.out.println("advertise");
            else if(r + c == e)
                System.out.println("does not matter");
            else
                System.out.println("do not advertise");
        }
    }
}
