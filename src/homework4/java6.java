package homework4;

public class java6 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0;i < matrix.length; i++){
            for (int j = 0;j < matrix[i].length; j++) {
                matrix[i][j] = i-j;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
