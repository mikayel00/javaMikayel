package homework4;

public class java3 {
    public static void main(String[] args) {
        int[] mass = {10, 15, -48, -55, -2, 8, 0, 5};
        int negativeCount = 0, positiveCount = 0,a = 0,b = 0;
        for (int i = 0; i < mass.length; i++) {
            int temp = mass[i];
            if (temp < 0) negativeCount++;
            if (temp > 0) positiveCount++;
        }
        int[] pos = new int[positiveCount]; // 4
        int[] neg = new int[negativeCount]; // 3
        for (int i = 0; i < mass.length; i++) {
            int temp = mass[i];
            if (temp < 0) {
                neg[a] = temp;
                a++;
            }
            if (temp > 0) {
                pos[b] = temp;
                b++;
            }
        }
        System.out.println("Positive values");
        for (int i = 0;i < pos.length;i++){ //Positive numbers
            System.out.print(pos[i] + " ");
        }
        System.out.println();
        System.out.println("Negative values");
        for (int i = 0;i < neg.length;i++){ //Negative numbers
            System.out.print(neg[i] + " ");
        }
    }
}
