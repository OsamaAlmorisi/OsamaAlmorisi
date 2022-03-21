package DataStructur.Lab1;

import java.util.Scanner;

/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student [] team = new Student[3];
        for (int i = 0; i <team.length ; i++) {
            System.out.println("Enter name of student("+(i+1)+"):");
            team[i] = new Student(input.nextLine(),i+1);
        }

        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());
        }
    }
}
