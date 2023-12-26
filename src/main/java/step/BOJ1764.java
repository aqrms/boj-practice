package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			map.put(name, 1);
		}

		for (int i = 0; i < M; i++) {
			String name = br.readLine();
			map.put(name, map.getOrDefault(name, 0) + 1);
			if (map.get(name) == 2)
				result.add(name);
		}

		Collections.sort(result);
		StringBuilder sb = new StringBuilder();
		sb.append(result.size()).append('\n');
		for (String name : result) {
			sb.append(name).append('\n');
		}
		System.out.println(sb);
	}

}

