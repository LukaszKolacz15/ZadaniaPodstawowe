package pl.akademiakodu.zad4;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-06.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
//      int min = a<b ? a : b; (skrocony sposob)
        int min;

        if (a>b){
            min=a;
        }
        else{
            min=b;
        }
        if (c<min){
            System.out.println(c);
        }
        else {
            System.out.println(min);
        }

    }
}
