package homework2;

public class java7 {
    public static void main(String[] args) {
        /* ---- 7 ---- */
        int num = 100234;
        int sum = 0;
        while(num != 0){
            int j = num % 10;
            num = (num - j) / 10;
            System.out.println(j);
            sum += j;
        }
        if (sum % 2 == 0)
            System.out.println("Evenish");
        else {
            System.out.println("Oddish");
        }


    }
}
