package homework4;

public class java7a {
    public static void main(String[] args) {
        int count = 0;
        int [][] matrix = {{14,13,5,7,3},
                            {8,7,8,19,4},
                            {7,5,13,17,10},
                            {15,13,2,3,7},
                            {13,9,11,17,1}};
        for (int i = 0;i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
                int temp = matrix[i][j];
                if (temp >= 10 && temp < 100){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
