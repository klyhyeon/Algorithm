package programmers.dfsbfs;

public class TargetNumber {

  /*
  타겟 넘버가 주어질 때, 배열의 수를 주어진 순서대로 +,- 해서 타겟 넘버를 만들 수 있는 경우의 수
  DFS - 바이너리, +,-로 이진트리를 그려 그 다음 숫자들을 연산했을 때 결과가 타겟 넘버거나, 배열의 마지막이면 리턴
  1. 연산자를 배열로 넣는다.
   */

  private String[] operation = {"+", "-"};

  private int[] numbers;

  private int target;

  public int solution() {
    int answer = 0;
    dfs(operation[0]);
    return answer;
  }

  public int dfs(String operation, int index) {

    if (result == target) {
      answer++;
      return 0;
    }
    if (numbers.length() == max) {
      return 0;
    }
    return dfs();
  }
}
