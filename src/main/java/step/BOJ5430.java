package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ5430 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String command = br.readLine();
            int N = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(), "[],");
            ArrayDeque<Integer> deque = new ArrayDeque<>();

            for (int i = 0; i < N; i++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            AC(command, deque);
        }

        System.out.println(sb);
    }

    private static void AC(String command, ArrayDeque<Integer> deque) {
        boolean isForward = true;

        for (char cmd : command.toCharArray()) {
            if (cmd == 'R') {
                isForward = !isForward;
                continue;
            }

            if (isForward) {
                if (deque.pollFirst() == null) {
                    sb.append("error\n");
                    return;
                }
            } else {
                if (deque.pollLast() == null) {
                    sb.append("error\n");
                    return;
                }
            }
        }
        makeString(deque, isForward);
    }

    private static void makeString(ArrayDeque<Integer> deque, boolean isForward) {
        sb.append('[');

        if (deque.size() > 0) {
            if (isForward) {
                sb.append(deque.pollFirst());
                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollFirst());
                }
            } else {
                sb.append(deque.pollLast());
                while (!deque.isEmpty()) {
                    sb.append(',').append(deque.pollLast());
                }
            }
        }
        sb.append(']').append('\n');
    }
}
