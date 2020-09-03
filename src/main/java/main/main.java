package main;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
        getByte = 0;
        putByte = 0;
        short a = 0;
        int b = 0;
        long c = 0;
        float d = 31.31f;
        double e = 3.12;
        char f = 'f';
        string h = "asd";
        check();
    }
    public static int check(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(a *(b+(c/d)));
        return 0;
    }

    public static boolean check1(int a, int b){
        if(a + b > 10 && a + b <= 20){return true;}
        else return false;
    }

    public static boolean check2(int a){
        if(a < 0){return true;}
        else return false;
    }
}
