package homework3;

public class java2_c {
    public static void main(String[] args) {
        int index = 0;
        for (int i = -100; i <= 100; i++) {
            if (i % 3 != 0) {
                index++;
            }
        }
        int[] array = new int[index];
        for (int i = 0, j = -100; j <= 100; j++) {
            if (j % 3 != 0) {
                array[i] = j;
                i++;
            }
        }
        int sum = 0;
        for (int i = 0;i < index; i++) {
            if (array[i] < 0) sum++;
        }
        System.out.println(sum);
    }
}
