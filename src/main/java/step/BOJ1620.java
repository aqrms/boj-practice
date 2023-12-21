package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> keymap = new HashMap<>();
		HashMap<Integer, String> valuemap = new HashMap<>();

		for (int i = 1; i <= N; i++) {
			String name = br.readLine();
			keymap.put(name, i);
			valuemap.put(i, name);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			if (isDigit(input)) {
				sb.append(valuemap.get(Integer.parseInt(input))).append('\n');
			} else {
				sb.append(keymap.get(input)).append('\n');
			}
		}
		System.out.println(sb);
	}

	public static boolean isDigit(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
}
