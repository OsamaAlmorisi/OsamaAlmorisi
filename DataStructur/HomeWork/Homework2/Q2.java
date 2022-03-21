package DataStructur.HomeWork.Homework2;

/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class Q2 {
    public static void main(String[] args) {
        int [][] A = {{3,6,3},{5,8,2},{6,9,4}};
        int [][] B = {{4,7,1},{2,5,9},{3,2,7}};
        int [][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
               C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int[] i:C) {
            for (int j:i) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
