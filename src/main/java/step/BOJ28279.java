package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ28279 {
	private static Deque<String> deque = new LinkedList();
	private static StringTokenizer st;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			operate(command);
		}
		System.out.println(sb);

	}

	private static void operate(String command) {
		String result = "";
		switch (command) {
			case "1":
				deque.offerFirst(st.nextToken());
				return;
			case "2":
				deque.offerLast(st.nextToken());
				return;
			case "3":
				result = deque.isEmpty() ? "-1" : deque.poll();
				break;
			case "4":
				result = deque.isEmpty() ? "-1" : deque.pollLast();
				break;
			case "5":
				result = String.valueOf(deque.size());
				break;
			case "6":
				result = deque.isEmpty() ? "1" : "0";
				break;
			case "7":
				result = deque.isEmpty() ? "-1" : deque.peek();
				break;
			case "8":
				result = deque.isEmpty() ? "-1" : deque.peekLast();
				break;
		}
		sb.append(result).append('\n');
	}
}
