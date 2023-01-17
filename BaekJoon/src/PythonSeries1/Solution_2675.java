
/*
 *  백준 문제 2675 : 문자열 반복
 *  Site : https://www.acmicpc.net/problem/2675
 */
import java.util.*;

public class Solution_2675 {
    
    // 문자열 복사해주는 메소드
    static void copyArr(String str) {
        // 파라미터 값 전부 분리해서 새로운 배열에 삽입
        String[] arr = str.split("");
        int copyCharCnt = Integer.parseInt(arr[0]);

        for (int i = 2; i < arr.length; i++) {
            String copyChar = arr[i];

            for (int j = 0; j < copyCharCnt; j++) {
                System.out.print(copyChar);
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tryNum = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < tryNum; i++) {
            String input = sc.nextLine();
            copyArr(input);
        }

        sc.close();
    }
}
