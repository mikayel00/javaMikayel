package homework3;

public class java1 {
    public static void main(String[] args) {

        int[] mass = {22, 20, 100, 110, 16, 18};
        int min = mass[0];
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (max < mass[i]) {
                max = mass[i];
            }
            if (min > mass[i]) {
                min = mass[i];
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
        System.out.println("Multiply: " + min * max);
    }
}
