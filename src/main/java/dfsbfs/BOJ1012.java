package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1012 {

    static int T, M, N, K;
    static int max = 50 + 2;
    static boolean[][] graph;
    static StringTokenizer st;
    static int[] dirR = new int[] {1, -1, 0, 0};
    static int[] dirC = new int[] {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine().trim());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            graph = new boolean[max][max];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine().trim());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                graph[y + 1][x + 1] = true;
            }

            int answer = 0;
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= M; k++) {
                    if (graph[j][k]) {
                        dfs(j, k);
                        answer += 1;
                    }
                }
            }
            System.out.println(answer);
        }

    }

    private static void dfs(int y, int x) {
        graph[y][x] = false;
        for (int i = 0; i < 4; i++) {
            int newY = y + dirR[i];
            int newX = x + dirC[i];
            if (graph[newY][newX])
                dfs(newY, newX);
        }
    }
}
