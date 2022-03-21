package DataStructur.HomeWork.Homework2;

/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class Q3 {
    public static void main(String[] args) {
        int[][] A = {{1, 0, 2}, {-1, 3, 1}};
        int[][] B = {{3, 1}, {2, 1}, {1, 0}};
        int row=0,col=0;
        int[][] C = new int[A.length][B[0].length];
        System.out.println(A.length);
        System.out.println(B.length);

//        for (int i = 0; i < B.length; i++) {
//            for (int j = 0; j < A.length; j++) {
//                System.out.print(" " + B[i][j]);
//            }
//            System.out.println();
//        }
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int k = 0; k < A.length; k++) {
                for (int j = 0; j < B.length; j++) {

                    sum += A[i][j] * B[j][k];
    //                if (j<B.length-1&&row<A.length-1){row++;j=0;}
                }
                C[k][col] = sum;

            }
            C[i][col] = sum;
            col++;
        }

        System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssss");
        for (int i = 0; i < B[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(" " + C[j][i]);
            }
            System.out.println();
        }
    }
}
