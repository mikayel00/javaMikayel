package homework4;

public class java7d {
    public static void main(String[] args) {
        int[][] matrix =    {{9, 13, 5, 7, 3},
                {8, 7, 8, 19, 4},
                {7, 5, 13, 17, 10},
                {15, 13, 2, 3, 7},
                {13, 9, 11, 17, 1}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        for (int i = 0;i < matrix.length; i++){
            for (int j = i;j < matrix[i].length;j++){
                if (matrix[i][j] %2 != 0) sum += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
}
