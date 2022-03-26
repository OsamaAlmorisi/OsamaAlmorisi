/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class AnswerOfQ3L2 {

    int array[]=new int[]{10,20,30,40,50};
    int top =array.length;
    public void pop(){
        for (int i = 0; i <array.length ; i++) {
            System.out.print("["+array[i]+"]");
        }
        System.out.println();
        for (int i = 0; i <array.length ; i++) {
            top--;
            array[top]=0;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print("["+array[i]+"]");
        }
    }


    public static void main(String[] args) {
        AnswerOfQ3L2 e1=new AnswerOfQ3L2();
        e1.pop();
    }
}
