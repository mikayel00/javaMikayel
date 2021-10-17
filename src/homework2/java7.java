package homework2;

public class java7 {
    public static void main(String[] args) {
        /* ---- 7 ---- */
        int num = 1011;
        int sum = 0;
        for (int i = 1;i < 5;i++) {
            int j = num % 10;
            num = (num - j) / 10;
            sum += j;
            System.out.println(j);
        }
        if (sum % 2 == 0)
            System.out.println("Evenish");
        else {
            System.out.println("Oddish");
        }
    }
}
