package homework4;

public class java7b {
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
        int[] minArray = new int[5];
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int[] temp = matrix[i];
            for (int k = 0; k < temp.length; k++) {
                if (min > temp[k]) {
                    min = temp[k];
                }
            }
            System.out.println("Minimum value of " + i + " lines: " + min);
            minArray[i] = min;
            for (int j = 0; j < matrix[i].length; j++) {
            }
        }
        System.out.println();
        int max = minArray[0];
        for (int i = 0;i < minArray.length;i++){
            if (max < minArray[i]){
                max = minArray[i];
            }
        }
        System.out.println("Maximum value of minimums: " + max);
    }
}
