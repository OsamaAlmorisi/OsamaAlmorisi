package DataStructur.HomeWork.HomeWork1;

/**
 * Created by Osama Almorisi on 1/20/2022.
 */
public class Q1 {
    public static void main(String[] args) {
        String [] StdName = {"Ahmed","Osama","Saleh","Ali","Mohammed","Omar","Ammar","Abdullah","Basem","Moadh"};
        int [] mark = {78,43,26,74,39,98,83,54,46,69};
        System.out.println("No\tName\t\tMark");
        for (int i = 0; i < mark.length; i++) {
            System.out.println((i+1)+"\t"+StdName[i]+"\t\t"+mark[i]);
        }
    }
}
