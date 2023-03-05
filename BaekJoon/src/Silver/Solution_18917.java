package Silver;

import java.util.ArrayList;
import java.util.Scanner;


public class Solution_18917 {
    public static void solution() {
        int sumVal = 0;
        int xorVal = 0;
        Scanner sc = new Scanner(System.in);
        int QUERY = sc.nextInt();
        ArrayList<Integer> queryArr = new ArrayList<>(QUERY);
        queryArr.add(0, 0);
        for(int i = 1; i < QUERY; i++) 
        {
            int querySelect = sc.nextInt();
            int xValue = querySelect <= 2 ? sc.nextInt() : 0;
            
            switch(querySelect)
            {
                case 1:
                    queryArr.add(xValue);
                    break;

                case 2:
                    for(int findNum : queryArr) {
                        if(queryArr.contains(findNum)) {
                            queryArr.remove(findNum);
                            break;
                        }
                    }
                    break;

                case 3:
                    for(int index = 0; i < queryArr.size(); index++) {
                        index = queryArr.get(index);
                        sumVal += index;
                    }
                    System.out.println(sumVal);
                    break;
                    
                case 4:
                    for(int index = 1; i < queryArr.size(); index++) {
                        xorVal += queryArr.get(0) ^ queryArr.get(index);
                    }
                    System.out.println(xorVal);
                    break;
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        solution();
    }
}
