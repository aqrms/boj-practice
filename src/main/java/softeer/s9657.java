package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class s9657 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] rowsum = new int[y + 1];
        int[] cnt = new int[y + 1];

        for (int i = 1; i <= y; i++) {
            rowsum[i] = Stream.of(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sum();
        }

        int attack = 2;
        for (int i = 0; i < attack; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            cnt[start]++;
            cnt[end + 1]--;
        }

        for (int i = 1; i <= y; i++) {
            cnt[i] += cnt[i - 1];
        }

        int result = 0;
        for (int i = 1; i <= y; i++) {
            int tmp = rowsum[i] - cnt[i];
            if (tmp > 0)
                result += tmp;
        }
        System.out.println(result);
    }
}
