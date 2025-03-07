package String.Assignment1;

public class PrintFrec {
    public static void main(String[] args) {
        String str="awnaakmmxasddsds";
        boolean[] visited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (visited[i] == true) {
                continue;
            }
            char ch = str.charAt(i);
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(ch + " -> " + count);
        }
    }
}
