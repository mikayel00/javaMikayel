package homework3;

public class java2_ab {
    public static void main(String[] args) {
        int[] mass = new int[201];
        for (int i = 0, j = -100; i < mass.length; i++, j++) {
            if (j % 3 != 0) {
                mass[i] = j;
                System.out.println(mass[i]);
            }
        }
    }
}
