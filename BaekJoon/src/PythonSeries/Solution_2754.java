package PythonSeries;
/*
 *  백준 문제 2754 : 학점계산
 *  Site : https://www.acmicpc.net/problem/2754
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Solution_2754 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String c = br.readLine();
        double score = 0;
        switch(c){
            case "A+":
                score = 4.3;
                break;
            case "A0":
                score = 4.0;
                break;
                case "A-":
                score = 3.7;
                break;
            case "B+":
                score = 3.3;
                break;
            case "B0":
                score = 3.0;
                break;
            case "B-":
                score = 2.7;
                break;
            case "C+":
                score = 2.3;
                break;
            case "C0":
                score = 2.0;
                break;
            case "C-":
                score = 1.7;
                break;
            case "D+":
                score = 1.3;
                break;
            case "D0":
                score = 1.0;
                break;
            case "D-":
                score = 0.7;
                break;
            case "F":
                score = 0.0;
                break;
        }

        System.out.print(score);
    }
}
