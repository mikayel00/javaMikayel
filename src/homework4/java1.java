package homework4;

public class java1 {
    public static void main(String[] args) {
        int n = 4;
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = "*";
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i]);
            }
            System.out.println();
        }
    }
}
