package Programmers_Lv0;

public class Lv0_Kcnt {
    public int solution(int i, int j, int k) {
        int answer = 0;
        while(i <= j) 
        {
            String conversionNum = Integer.toString(i);
            String[] charArr = conversionNum.split("");
            for(int index = 0; index < charArr.length; index++) {
                if(charArr[index].contains(Integer.toString(k))) {
                    answer++;
                }
            }
            i++;
        }
        return answer;
    }
}
