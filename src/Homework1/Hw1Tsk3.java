package Homework1;

import java.util.Scanner;
public class Hw1Tsk3 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t<10) {
            System.out.println ("Take on jacket");
        } if (t>10 && t<=15){
            System.out.println ("Take on windbreaker");
        } if (t>15 && t<=20) {
            System.out.println ("Take on sweater");
        } if (t>20 && t <=30) {
            System.out.println ("Take on T-Shirt");
        } if (t>30) {
            System.out.println ("Take on nothing");
        }
    }
}

/*Дана температура в градусах. Вывести на экран ,
что лучше надеть: куртку, свитер, майку или ничего.
Например,при температуре менее 10 – куртку,
 от 10 до 15 – ветровку, от 16 до 20 свитер,от 21 до 30 майку, выше 30 – ничего.*/