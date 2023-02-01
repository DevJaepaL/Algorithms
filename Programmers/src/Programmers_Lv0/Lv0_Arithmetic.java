package Programmers_Lv0;

class Lv0_Arithmetic {
    public static int solution(int[] common) {
        int answer = 0;
        if (common[1] - common[0] == common[2] - common[1]) {
           answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
    }

    public static  void main(String[] args) {
        int[] answer = {2,4,8,16};
        solution(answer);
    }
}
