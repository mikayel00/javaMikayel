package homework4;

public class java5 {
    public static void main(String[] args) {
        int n = 10, sum = 0;
        int[] array = new int[n];
        if (n % 2 != 0) {
            int j = n / 2 * (-1);
            for (int i = 0; i < n; i++, j++) {
                array[i] = j;
                System.out.println(array[i]);
                sum += j;
            }
        }
        if (n % 2 == 0) {
            int j = n / 2 * (-1);
            for (int i = 0; i < n; i++, j++) {
                if (j == 0 )j++;
                array[i] = j;
                System.out.println(array[i]);
                sum += j;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
