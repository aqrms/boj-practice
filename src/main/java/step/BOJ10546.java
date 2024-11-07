package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ10546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String player = br.readLine();
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (int i = 0; i < N - 1; i++) {
            String player = br.readLine();
            map.put(player, map.get(player) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0)
                answer = key;
        }

        System.out.println(answer);
    }
}
