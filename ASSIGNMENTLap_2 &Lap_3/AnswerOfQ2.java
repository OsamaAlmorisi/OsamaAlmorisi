/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class AnswerOfQ2 {
   int a[]=new int[]{12,13,14,15};
    public void pop(int d){
        for (int i = 0; i <a.length ; i++) {
            System.out.print("["+a[i]+"]");
        }
        System.out.println();
        for (int i = 0; i <a.length ; i++) {
            if (a[i]==d)
                a[i]=0;
            else {
                System.out.println("Not found");
            }
            i=a.length;
        }

        for (int i = 0; i <a.length; i++) {
            System.out.print("["+a[i]+"]");
        }
        System.out.println();

    }

    public static void main(String[] args) {
    AnswerOfQ3 s1=new AnswerOfQ3();
        s1.pop(12);
        s1.pop(100);
    }
}
