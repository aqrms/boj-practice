import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class s6268 {

    static Map<String, int[]> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        map.put(" ", new int[] {0, 0, 0, 0, 0, 0, 0});
        map.put("0", new int[] {1, 1, 1, 1, 1, 0, 1});
        map.put("1", new int[] {0, 1, 1, 0, 0, 0, 0});
        map.put("2", new int[] {1, 1, 0, 1, 1, 1, 0});
        map.put("3", new int[] {1, 1, 1, 1, 0, 1, 0});
        map.put("4", new int[] {0, 1, 1, 0, 0, 1, 1});
        map.put("5", new int[] {1, 0, 1, 1, 0, 1, 1});
        map.put("6", new int[] {1, 0, 1, 1, 1, 1, 1});
        map.put("7", new int[] {1, 1, 1, 0, 0, 0, 1});
        map.put("8", new int[] {1, 1, 1, 1, 1, 1, 1});
        map.put("9", new int[] {1, 1, 1, 1, 0, 1, 1});

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            String is = st.nextToken();
            String to = st.nextToken();

            sb.append(calMin(is, to)).append('\n');
        }

        System.out.println(sb);

    }

    private static int calMin(String is, String to) {
        int cnt = 0;
        while (is.length() < to.length())
            is = " " + is;
        while (to.length() < is.length())
            to = " " + to;

        for (int i = 0; i < is.length(); i++) {
            int[] a = map.get(String.valueOf(is.charAt(i)));
            int[] b = map.get(String.valueOf(to.charAt(i)));

            for (int j = 0; j < 7; j++) {
                if (a[j] != b[j])
                    cnt++;
            }
        }
        return cnt;
    }

}
