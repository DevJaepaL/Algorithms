package PythonSeries;
/*
 *  백준 문제 5355 : 화성 수학
 *  Site : https://www.acmicpc.net/problem/5355
 */
import java.util.*;
public class Solution_5355 {
    static void marsCalc(String str) {
        String[] arr = str.split(" ");
            float calcNum = Float.parseFloat(arr[0]); 

            for(int j = 1; j < arr.length; j++) 
            {
                switch(arr[j])
                {
                    case "@": calcNum *= 3;
                        break;
                    case "%": calcNum += 5;
                        break;
                    case "#": calcNum -= 7;
                        break;
                    default:
                        continue;
                }
            }
            System.out.println(String.format("%.2f", calcNum));
    }

   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++)
        {
            String input = sc.nextLine();
            marsCalc(input);
        }

        sc.close();
   }
}
