package Programmers_Lv0;

class Lv0_FindInteger {
    public static int solution(int num, int k) {
        int answer = 0;
        String numStr = Integer.toString(num);
        for(int i = 0; i < numStr.length(); i++) {
            char findK = Character.forDigit(k , 10);
            if(numStr.charAt(i) == findK) {
                answer = 1 + i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123456,7));
    }
}
