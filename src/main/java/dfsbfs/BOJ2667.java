package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2667 {
    final static int MAX = 25 + 2;
    static boolean[][] graph;
    static int complexCnt;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        graph = new boolean[MAX][MAX];

        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            for (int j = 1; j <= N; j++) {
                graph[i][j] = line.charAt(j - 1) == '1';
            }
        }

        ArrayList<Integer> cntList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (graph[i][j]) {
                    complexCnt = 0;
                    dfs(i, j);
                    cntList.add(complexCnt);
                }
            }
        }

        System.out.println(cntList.size());
        Collections.sort(cntList);
        for (int i = 0; i < cntList.size(); i++) {
            System.out.println(cntList.get(i));
        }
        br.close();
    }

    private static void dfs(int i, int j) {
        graph[i][j] = false;
        complexCnt++;

        for (int k = 0; k < 4; k++) {
            int ny = i + dy[k];
            int nx = j + dx[k];
            if (graph[ny][nx]) {
                dfs(ny, nx);
            }
        }
    }
}
