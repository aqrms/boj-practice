package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> q = new LinkedList<>();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		for (int i = 1; i <= N; i++) {
			q.offer(i);
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<");

		while (q.size() > 1) {
			for (int i = 0; i < K - 1; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()).append(", ");
		}
		sb.append(q.poll()).append(">");
		System.out.println(sb);
	}

}
