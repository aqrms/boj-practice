package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ2346 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Balloon> q = new ArrayDeque<>();

		int N = Integer.parseInt(br.readLine());

		int[] moves = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			moves[i] = Integer.parseInt(st.nextToken());
		}

		sb.append("1 ");
		int move = moves[0];

		for (int i = 1; i < N; i++) {
			q.add(new Balloon(i + 1, moves[i]));
		}

		while (!q.isEmpty()) {
			if (move > 0) {
				for (int i = 1; i < move; i++) {
					q.add(q.poll());
				}

				Balloon next = q.poll();
				move = next.value;
				sb.append(next.index).append(" ");
			} else {
				for (int i = 1; i < -move; i++) {
					q.addFirst(q.pollLast());
				}

				Balloon next = q.pollLast();
				move = next.value;
				sb.append(next.index).append(" ");
			}
		}
		System.out.println(sb);

	}
}

class Balloon {
	int index;
	int value;

	public Balloon(int index, int value) {
		this.index = index;
		this.value = value;
	}
}
