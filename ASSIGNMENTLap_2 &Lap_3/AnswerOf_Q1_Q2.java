import java.util.Scanner;

/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class AnswerOf_Q1_Q2 {
    // q1 java method that Revers an array using another array
    static  void reverse(int fristArray[]){
        int secondArray[] =new int[fristArray.length];
        int k=fristArray.length;
        for (int i = 0; i <fristArray.length ; i++) {
            secondArray[k-1]=fristArray[i];
            k--;
        }
        //To print the array after revers

        System.out.println("Array after revers ");
        for (int i = 0; i <secondArray.length ; i++) {
            System.out.print(secondArray[i]+" ");
        }
        System.out.println("");
    }
    // q2 java method that Clone an array to a backup  array

    static void backupArrayMethod(int array[]){
       int backupArray[]=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            backupArray[i]=array[i];
        }

        System.out.println("Backup Array");
        for (int i = 0; i <backupArray.length ; i++)
        System.out.print(backupArray[i]+" ");
    }





        //main method

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the length of array that you want");
        int n= input.nextInt();
        int array[]=new int[n];
        System.out.println("Enter "+n+" Elements");
        for (int i = 0; i <array.length ; i++) {
            array[i]=input.nextInt();
        }
        reverse(array);
        backupArrayMethod(array);    }


}
