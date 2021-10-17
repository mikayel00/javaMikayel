package homework2;

public class java6 {
    public static void main(String[] args) {
        /* ---- 6 ---- */
        int n = 100;
        for (int i = 0;i <= n;i++) {
            if (i == 0) continue;
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }
}
