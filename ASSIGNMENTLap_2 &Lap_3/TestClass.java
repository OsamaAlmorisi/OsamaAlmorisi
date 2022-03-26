import java.util.Scanner;

/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class TestClass {
    public static void main(String[] args) {
        Object secondStack[]=new Object[4];
        Scanner input =new Scanner(System.in);
        AnswerOfQ1 object = new AnswerOfQ1();
        System.out.println("Enter "+secondStack.length+" Elements that can be intger or string or charcher or double");
        for (int i = 0; i <4 ; i++) {
            object.push(input.next());
        }
        System.out.println("Elements after transfer to second Stack");
        for (int i = 3; i >=0 ; i--) {
          secondStack[i] = object.fristStack[i];
            System.out.print(secondStack[i]+" ");
        }
    }
}
