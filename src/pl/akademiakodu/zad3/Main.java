package pl.akademiakodu.zad3;

import java.util.Scanner;

/**
 * Created by Moody on 2017-03-06.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę miejsc: ");
        int numberOfSeats = scanner.nextInt();
        System.out.println("Podaj liczbę rzędów: ");
        int numberOfRows = scanner.nextInt();

        if (numberOfSeats % numberOfRows == 0){
            System.out.println(numberOfSeats / numberOfRows);
        }
        else{
            int regularRow = numberOfSeats/(numberOfRows - 1 );
            int irregularRow = numberOfSeats - (regularRow) * (numberOfRows - 1 );
            System.out.println(regularRow);
            System.out.println(irregularRow);
        }

//        int score = numberOfSeats / numberOfRows;

//        System.out.println("liczba rzędów to: " + score);

    }
}
