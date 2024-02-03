package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ18258 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> q = new LinkedList<>();
		StringTokenizer command;

		int N = Integer.parseInt(br.readLine());

		while (N-- > 0) {
			command = new StringTokenizer(br.readLine());

			switch (command.nextToken()) {
				case "push":
					q.offer(Integer.parseInt(command.nextToken()));
					break;

				case "pop":
					Integer num = q.poll();
					if (num == null) {
						sb.append(-1).append('\n');
					} else {
						sb.append(num).append('\n');
					}
					break;
				case "size":
					sb.append(q.size()).append('\n');
					break;
				case "empty":
					if (q.isEmpty()) {
						sb.append(1).append('\n');
					} else {
						sb.append(0).append('\n');
					}
					break;
				case "front":
					Integer front = q.peek();
					if (front == null) {
						sb.append(-1).append('\n');
					} else {
						sb.append(front).append('\n');
					}
					break;
				case "back":
					Integer back = q.peekLast();
					if (back == null) {
						sb.append(-1).append('\n');
					} else {
						sb.append(back).append('\n');
					}
					break;
			}

		}
		System.out.println(sb);
	}
}
