package Programmers_Lv0;
/*
 *  Programmers Lv.0 : 치킨 쿠폰
 *  문제 :  쿠폰 10장 모으면 치킨 + 1
 *         서비스 치킨에도 쿠폰 적용
 */
public class Lv0_Programmers13 {
    public int solution(int chicken) {
        int chickenCoupons = chicken;
        int newChicken = 0;

        while(chickenCoupons >= 10)
        {
            int remainCoupon = chickenCoupons % 10;
            newChicken += chickenCoupons / 10;
            chickenCoupons = remainCoupon + chickenCoupons / 10; // 계산 후 새로운 쿠폰 생성
        }

        return newChicken;
    }
}
