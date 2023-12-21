package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ7785 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}

		List<String> keys = map.entrySet().stream()
			.filter(entry -> Objects.equals(entry.getValue(), "enter"))
			.map(Map.Entry::getKey)
			.collect(Collectors.toList());

		Collections.sort(keys, (a, b) -> b.compareTo(a));

		StringBuilder sb = new StringBuilder();
		for (String key : keys) {
			sb.append(key + '\n');
		}
		System.out.print(sb);
	}

}



