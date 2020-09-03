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
}
