package DataStructur.HomeWork.Homework2;

import java.util.Arrays;

/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class Q3_1 {
    public static void main(String[] args) {
        int [][] A = {{3,6,3},{5,8,2},{6,9,4}};
        int [][] B = {{4,7,1},{2,5,9},{3,2,7}};
        int [][] C = A;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] * B[i][j];
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(" "+C[i][j]);
            }
            System.out.println();
        }
    }
}
