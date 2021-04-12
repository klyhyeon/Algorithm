package baekJoon.week5;
/*
    N이 주어졌을 때, N까지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램을 작성하시오
    - 입력: 첫째 줄에 1<=N<=8이 주어진다
    - 출력: 첫째 줄부터 N!개의 줄에 걸쳐서 모든 순열을 사전순(오름차순)으로 출력한다.
 */
//GG.. 다른 사람들의 코드를 보니 DFS를 쓰더라, 공부 ㄱㄱ

import java.util.Scanner;

public class AllPermutation_10974 {
    static int[] output;

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        //1. 오름 차순 정렬
//        for(int i = 0; i < N; i++) {
//            arr[i] = i+1;
//        }
//
//        for(int i = 0; i < N; i++) {
//            System.out.print(arr[i] + " ");
//            for(int j = 0; j < N; j++) {
//                if(j != i) {
//                    System.out.print(arr[j] + " ");
//                }
//            }
//                System.out.println();
//        }
        //다른 사람 코드 그대로 작성, 분석
        //코드 출처: https://zoonvivor.tistory.com/136
        //코드를 봐도 모르겠다. 조금 더 쉬운 DFS 문제로 풀어보자
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        output = new int[N];
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            visited[i] = true;
            DFS(arr, visited, N, i, 0);
            visited[i] = false;
        }
        sc.close();
    }

    public static void DFS(int[] arr, boolean[] visited, int N, int start, int depth) {
        output[depth] = start + 1;
        if(depth == N -1) {
            for(int i = 0; i < N; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 0; i < N; i++) {
            if(visited[i]) {
                continue;
            }
            visited[i] = true;
            DFS(arr, visited, N, i, depth + 1);
            visited[i] = false;
        }
    }

}