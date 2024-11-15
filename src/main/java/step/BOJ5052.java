package step;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ5052 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            String[] arr = new String[N];

            for (int j = 0; j < N; j++) {
                arr[j] = br.readLine();
            }
            Arrays.sort(arr);
            sb.append(isConsistent(arr)).append('\n');
        }

        System.out.println(sb);
    }

    public static String isConsistent(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1].startsWith(arr[i])) {
                return "NO";
            }
        }
        return "YES";
    }
}
