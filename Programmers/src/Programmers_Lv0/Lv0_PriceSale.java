package Programmers_Lv0;

class Lv0_PriceSale {
    public int solution(int price) {
        int answer = price;
        if(100000 <= answer && answer <= 299999) {
            answer -= price * 0.05;
        } else if(300000 <= answer && answer <= 499999) {
            answer -= price * 0.1;
        } else if(500000 <= answer) {
            answer -= price * 0.2;
        } else {
            return answer;
        }
        return answer;
    }
}