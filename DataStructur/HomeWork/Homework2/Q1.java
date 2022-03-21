package DataStructur.HomeWork.Homework2;

/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class Q1 {
    public static void main(String[] args) {
        int [][] A = {{3,6,3},{5,8,2},{6,9,4}};
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = A[i][j]*3;
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(" "+A[i][j]);
            }
            System.out.println();
        }
    }
}
