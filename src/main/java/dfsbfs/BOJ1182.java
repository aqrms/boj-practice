package dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1182 {
    static int[] nums;
    static int cnt, N, S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        nums = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        System.out.println(S == 0 ? cnt - 1 : cnt);
    }

    public static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S)
                cnt++;
            return;
        }

        dfs(depth + 1, sum + nums[depth]);
        dfs(depth + 1, sum);

    }
}
