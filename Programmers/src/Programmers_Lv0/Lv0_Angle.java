package Programmers_Lv0;

public class Lv0_Angle {
    public int solution(int angle) {
        if(angle > 1 && angle <= 89) {
            return 1;
        } else if(angle > 90 && angle < 180) {
            return 3;
        } else {
            return angle == 90 ? 2 : (angle == 180 ? 4 : 0);
        }
    }
}