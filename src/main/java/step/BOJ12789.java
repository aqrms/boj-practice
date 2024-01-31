package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ12789 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		Stack<Integer> temp = new Stack<>();
		int count;

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			queue.add(Integer.parseInt(st.nextToken()));
		}

		count = 1;
		while (!queue.isEmpty()) {
			if (queue.peek() == count) {
				queue.poll();
				count++;
			} else if (!temp.isEmpty() && temp.peek() == count) {
				temp.pop();
				count++;
			} else {
				temp.push(queue.poll());
			}
		}
		while (!temp.isEmpty()) {
			if (temp.peek() == count) {
				temp.pop();
				count++;
			} else {
				System.out.println("Sad");
				return;
			}
		}
		System.out.println("Nice");

	}
}
