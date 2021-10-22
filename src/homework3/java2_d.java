package homework3;

public class java2_d {
    public static void main(String[] args) {
        int[] mass = new int[201];
        int sum = 0;
        int num = 0;
        for (int i = 0, j = -100; i < mass.length; i++, j++) {
            if (j > 0 && j % 3 != 0) {
                num++;
                mass[i] = j;
                sum += mass[i];

            }
        }
        System.out.println(sum / num);
    }
}
