package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		HashMap<Integer, Integer> map = new HashMap<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			int num = Integer.parseInt(st.nextToken());
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < B; i++) {
			int num = Integer.parseInt(st.nextToken());
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		List<Integer> list = map.values().stream()
			.filter(i -> i == 1)
			.collect(Collectors.toList());

		System.out.println(list.size());
	}
}
