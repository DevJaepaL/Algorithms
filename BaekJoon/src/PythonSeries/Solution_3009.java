package PythonSeries;
/*
 *  백준 문제 3009 : 네 번째 점
 *  Site : https://www.acmicpc.net/problem/3009
 */
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Solution_3009 {
    public static void main(String args[]) throws IOException {
        int x,y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int[] point_0 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] point_1 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] point_2 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        if(point_0[0] == point_1[0])        x = point_2[0];
        else if(point_0[0] == point_2[0])   x = point_1[0];
        else                                x = point_0[0];
        if(point_0[1] == point_1[1])        y = point_2[1];
        else if(point_0[1] == point_2[1])   y = point_1[1];
        else                                y = point_0[1];
        System.out.print(x + " " + y);
    }
}
