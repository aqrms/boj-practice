package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ2178 {
    static int N, M;
    static int[][] graph = new int[102][102];
    static Deque<int[]> q;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 1; j <= M; j++) {
                graph[i][j] = Integer.parseInt(line.substring(j - 1, j));
            }
        }

        bfs(1, 1);
        System.out.println(graph[N][M] - 1);
    }

    private static void bfs(int y, int x) {
        q = new ArrayDeque<>();
        q.offer(new int[] {y, x});
        graph[y][x] = 2;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int cy = current[0];
            int cx = current[1];

            for (int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];

                if (graph[ny][nx] == 1) {
                    graph[ny][nx] = graph[cy][cx] + 1;
                    q.offer(new int[] {ny, nx});
                }
            }
        }
    }
}
