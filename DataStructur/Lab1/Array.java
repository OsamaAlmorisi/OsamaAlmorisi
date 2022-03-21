 package DataStructur.Lab1;

/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.print("{");
        for (int i:array) {
            System.out.print(" "+i);
        }
        System.out.print(" }");
    }
}
