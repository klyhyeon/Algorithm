package inflearn;

public class Recursion_3 {

    static int[] numbers;
    static int begin = 0;
    static int end = 100;
    static int target;
    public static void main(String[] args) {
        numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i;
        }
        target = 51;
        System.out.println(search(numbers, begin, end, target));
    }


    //순차탐색 : middle을 이용한 버전
    //index가 받는 search 재귀도 if (begin > end)와 [middle]과 target 비교를 계속 진행한다.
    // -1이 되면 끝나는 게 아니라 index가 -1이 되고, 31행부터 if문이 진행된다. 그렇게 34행 middle + 1 search 재귀를 반복해서
    //해를 찾는다.
    public static int search(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        }
        else {
            int middle = (begin + end) / 2;
            if (data[middle] == target)
                return middle;
            int index = search(data, begin, middle - 1, target);
            if (index != -1)
                return index;
            else
                return search(data, middle + 1, end, target);
        }
    }

    //이진탐색 : binary search
    public static int binarySearch(String[] items, String target, int begin, int end) {
        if (begin > end)
            return -1;
        else {
            int middle = (begin + end) / 2;
            //두 문자열을 비교하고 int형 값을 반환 (같으면 0, 작으면 -1, 크면 1)
            int compResult = target.compareTo(items[middle]);
            if (compResult == 0)
                return middle;
            else if (compResult < 0)
                //타켓이 비교값보다 작으니까 줄여줌
                return binarySearch(items, target, begin, middle - 1);
            else
                return binarySearch(items, target, begin, middle + 1);
        }
    }
}
