package SkillCheckTest;

public class CharsCoord {
  public int[] solution(String[] keyinput, int[] board) {
    int xCnt = 0;
    int yCnt = 0;
    final int leftCoord = -board[0] / 2;
    final int rightCoord = board[0] / 2;
    final int downCoord = -board[1] / 2;
    final int upCoord = board[1] / 2;

    for (int i = 0; i < keyinput.length; i++) {
      switch (keyinput[i]) {
        case "down":
          if (yCnt > downCoord) yCnt -= 1;
          break;
        case "up":
          if (yCnt < upCoord) yCnt += 1;
          break;
        case "left":
          if (xCnt > leftCoord) xCnt -= 1;
          break;
        case "right":
          if (xCnt < rightCoord) xCnt += 1;
          break;
      }
    }

    int[] answer = { xCnt, yCnt };
    return answer;
  }
}