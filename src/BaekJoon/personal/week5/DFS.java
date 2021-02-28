package baekJoon.personal.week5;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private int V;
    private LinkedList<Integer> adj[];

    DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        //인접 리스트 초기화
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }
    void addEdge(int v, int w) { adj[v].add(w);}

    //DFS에 의해 사용되는 함수
    void DFSUtil(int v, boolean visited[]) {
        //현재 노드를 방문한 것으로 표시하고 값을 출력
        visited[v] = true;
        System.out.println(v + " ");

        //방문한 노드와 인접한 모든 노드를 가져온다.
        Iterator<Integer> it = adj[v].listIterator();
        while(it.hasNext()) {
            int n = it.next();
            //방문하지 않은 노드면 해당 노드를 시작 노드로 다시 DFSUtil 호출
            if(!visited[n])
                DFSUtil(n, visited);
        }
    }
    //DFS
    void DFS(int v) {
        boolean visited[] = new boolean[V];

        // v를 시작 노드로 DFSUtil 재귀 호출
        DFSUtil(v, visited);
    }
}
