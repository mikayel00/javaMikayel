package homework3;

public class java2_e {
    public static void main(String[] args) {
        int[] mass = new int[201];
        int sum = 0;
        for (int i = 0, j = -100; i < mass.length; i++, j++) {
            if (j % 3 != 0 && i % 2 != 0) {
                mass[i] = j;
                sum += mass[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
