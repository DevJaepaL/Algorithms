package Programmers_Lv0;

public class Lv0_SlicePizza1 {
    public int solution(int n) {
        /*  파라미터(사람 수)값이 7로 나눠떨어지지 않으면 나눈 값에 + 1 해준다.
         *  나눠 떨어진다면(7의 배수) 7로 나눈 값 그대로 리턴
         */
        return  n % 7 != 0 ? n / 7 + 1 : n / 7;
    }
}
