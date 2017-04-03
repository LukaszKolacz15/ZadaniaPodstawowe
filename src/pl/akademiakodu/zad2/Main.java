package pl.akademiakodu.zad2;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-06.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double score = (double)(a+b)/2;
        System.out.println("Srednia liczb to" + score);

    }
}
