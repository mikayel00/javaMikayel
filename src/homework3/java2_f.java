package homework3;

public class java2_f {
    public static void main(String[] args) {
        System.out.println(1002014464 * 107);
        int[] mass = new int[201];
        int multi = 1;
        for (int i = 0, j = -100; i < mass.length; i++, j++) {
            if (j % 3 != 0 && j % 7 == 0) {
                mass[i] = j;
                multi *= i;
                System.out.println(i);
                System.out.println("Multi : " + multi);
            }
        }
    }
}
