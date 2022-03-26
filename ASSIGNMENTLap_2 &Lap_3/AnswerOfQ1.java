import java.util.Scanner;

/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class AnswerOfQ1 {
    // transfer from frist stack s to second stack t
    int top;
    public Object fristStack[];
    int size;

    public AnswerOfQ1() {
        top=-1;
        size=0;
        fristStack=new Object[4];
    }
    Object size(){
        return size;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void  push(String element){
        if (size==fristStack.length){
            System.out.println("stack is full");
        }
        fristStack[++top]=element;

    }
    public Object  pop(){
        if (isEmpty())
            System.out.println("stack is empty");
        else
            top--;
        return null;
    }



        }




