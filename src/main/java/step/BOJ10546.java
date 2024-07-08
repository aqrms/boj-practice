package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] player = new String[N];
        String[] finisher = new String[N - 1];

        for (int i = 0; i < N; i++) {
            player[i] = br.readLine();
        }

        for (int i = 0; i < N - 1; i++) {
            finisher[i] = br.readLine();
        }

        Arrays.sort(player);
        Arrays.sort(finisher);

        int i = 0;
        for (; i < finisher.length; i++) {
            if (!player[i].equals(finisher[i]))
                break;
        }
        System.out.println(player[i]);
    }
}
