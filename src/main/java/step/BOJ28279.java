package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ28279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<String> deque = new LinkedList();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			switch (command) {
				case "1":
					deque.offerFirst(st.nextToken());
					break;
				case "2":
					deque.offerLast(st.nextToken());
					break;
				case "3":
					String poll1 = deque.poll();
					if (poll1 != null) {
						sb.append(poll1).append('\n');
					} else {
						sb.append("-1").append('\n');
					}
					break;
				case "4":
					String pollLast = deque.pollLast();
					if (pollLast != null) {
						sb.append(pollLast).append('\n');
					} else {
						sb.append("-1").append('\n');
					}
					break;
				case "5":
					sb.append(deque.size()).append('\n');
					break;
				case "6":
					if (deque.isEmpty()) {
						sb.append("1").append('\n');
					} else {
						sb.append("0").append('\n');
					}
					break;
				case "7":
					String peekFirst = deque.peekFirst();
					if (peekFirst != null) {
						sb.append(peekFirst).append('\n');
					} else {
						sb.append("-1").append('\n');
					}
					break;
				case "8":
					String peekLast = deque.peekLast();
					if (peekLast != null) {
						sb.append(peekLast).append('\n');
					} else {
						sb.append("-1").append('\n');
					}
					break;
			}
		}
		System.out.println(sb);

	}
}
