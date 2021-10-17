package homework2;

public class java4 {
    public static void main(String[] args) {
        /* ---- 4 ---- */
        int a = 20;
        int b = 10;
        int result = 1;

        result = (a > b) ? (result*=(a-b)):(result*=(a+b));
        System.out.println(result);

        /*
        if (a > b) {
            result *=(a-b);
            System.out.println(result);
        }
        else {
            if (a < b) {
                result *= (a + b);
                System.out.println(result);
            } else {
                System.out.println("Enter not equals values!");
            }
        }
        */
    }
}
