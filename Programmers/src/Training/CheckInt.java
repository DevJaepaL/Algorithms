/**
 *  https://school.programmers.co.kr/learn/courses/30/lessons/181938
*/
package Training;

public class CheckInt {
    public int solution(int a, int b) {
        String firstNum = Integer.toString(a) + Integer.toString(b);
        int change = Integer.parseInt(firstNum);
        int answer = 2 * (a + b);
        return answer = answer > change ? answer : change;
    }
}
