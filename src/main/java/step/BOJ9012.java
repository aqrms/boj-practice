package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			System.out.println(solve(br.readLine()));
		}
	}

	private static String solve(String s) {
		Stack<Character> stack = new Stack<>();

		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if (c == '(') {
				stack.push(c);
			} else if (stack.isEmpty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}
		if (stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
