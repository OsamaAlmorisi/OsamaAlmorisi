import java.util.Scanner;

/**
 * Created by osama almorisi on 28/09/21.
 */
public class AtmApp {
    public static void main(String[] args) {



        double Amount,balance = 1000;int chose = 1;
        Scanner a = new Scanner(System.in);

        for (;chose>=1&&chose!=0;chose ++){
            System.out.println("\n للسحب اضغط الرقم 1 ");
            System.out.println(" للايداع اضغط الرقم 2 ");
            System.out.println(" للاستعلام اضغط الرقم 3 ");
            System.out.println(" للخروج اضغط الرقم 0 ");


            chose = a.nextInt();



        switch (chose){
            case 1:
                System.out.println("ادخل المبلغ...");
                Amount=a.nextInt();
                if (Amount<= balance){
                    balance-=Amount;
                    System.out.println(" تم بنجاح .. ");
                    }

                else if (balance==0)
                System.out.println("عذرا .. رصيدك الحالي هو صفر  ");
                else
                    System.out.println("عذرا..لا يوجد لديك رصيد كافي ");
                break;
            case 2:
                System.out.println("ادخل المبلغ ...");
                Amount=a.nextInt();
                balance+=Amount;
                System.out.println("تم بنجاح ..");
                break;
            case 3:
                System.out.println("المبلغ الحالي هو  "+balance);
                break;
            case 0:
                System.out.println("تم الخروج بنجاح ..");
                System.exit(0);
                break;
            default:
                System.out.println("عذرا.. اختار فقط من احدى هذي الارقام (1)(2)(3)(0) ");



        }}
    }
}
