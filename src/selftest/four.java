package selftest;

public class four {
    public static void main(String[] args) {
        int[][] res = korraTabel(9);
    }

    public static int[][] korraTabel(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = i * j;
            }

        }
        return res;
    }
}

