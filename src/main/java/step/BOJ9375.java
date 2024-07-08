package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ9375 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int answer = 1;
            for (Integer value : map.values()) {
                answer *= value + 1;
            }
            sb.append(String.valueOf(answer - 1));
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
