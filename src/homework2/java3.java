package homework2;

public class java3 {
    public static void main(String[] args) {
        /* ---- 3 ---- */
        int num1 = 5;
        int num2 = 4;
        int num3 = 6;

        if (num1 < num2 && num1 < num3) {
            System.out.println("Smallest: " + num1);
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.println("Smallest: " + num2);
        }
        else if (num1 == num2 || num1 == num3 || num2 == num2) {
            System.out.println("Enter not equal values!");
        }
        else {
            System.out.println("Smallest: " + num3);
        }
    }
}
