package PythonSeries1;
/*
 *  백준 문제 10817 : 세 수
 *  Site : https://www.acmicpc.net/problem/10817
 */
import java.util.*;
public class Solution_10817 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        ArrayList<Integer> numArr = new ArrayList<Integer>();

        int midNum = arr.length / 2;
        for(int i = 0; i < arr.length; i++) {
            numArr.add(Integer.parseInt(arr[i]));
        }

        Collections.sort(numArr);
        System.out.print(numArr.get(midNum));

        sc.close();
    }
}

