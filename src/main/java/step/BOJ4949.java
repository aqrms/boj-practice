package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String s = br.readLine();

			if (s.equals(".")) {
				break;
			}

			System.out.println(solve(s));

		}

	}

	private static String solve(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			} else if (c == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}

		if (stack.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
