package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ1260 {

    final static int max = 1001;
    static boolean[][] graph;
    static boolean[] visited;
    static Deque<Integer> q;
    static int N, M, V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new boolean[max][max];
        visited = new boolean[max];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }
        dfs(V);
        System.out.println();
        bfs();
    }

    private static void dfs(int v) {
        System.out.print(v + " ");
        visited[v] = true;
        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[v][i]) {
                dfs(i);
            }
        }
    }

    private static void bfs() {
        visited = new boolean[max];
        q = new ArrayDeque<>();

        q.offer(V);
        visited[V] = true;

        while (!q.isEmpty()) {
            Integer idx = q.poll();
            System.out.print(idx + " ");
            for (int i = 1; i <= N; i++) {
                if (!visited[i] && graph[idx][i]) {
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}

