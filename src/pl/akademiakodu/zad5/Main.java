package pl.akademiakodu.zad5;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-06.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 3 == 0) {
            System.out.println("Liczba podzielna przez 3");
        }
        else{
            System.out.println("Liczba niepodzielna przez 3");
        }
    }
}
