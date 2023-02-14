package PythonSeries;
import java.util.*;
public class Solution_4101 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int num0 = sc.nextInt();
            int num1 = sc.nextInt();
            if(num0 == 0 && num1 == 0) break;
            String print = num0 > num1 ?  "Yes" : "No";
            System.out.println(print);
        }
    }
}
