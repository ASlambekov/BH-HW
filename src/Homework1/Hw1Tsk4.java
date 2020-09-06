package Homework1;

import java.util.Scanner;
public class Hw1Tsk4 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print ("Salary1: ");
        int Salary1 = in.nextInt();
        System.out.print ("Salary2: ");
        int Salary2 = in.nextInt();
        System.out.print ("Salary3: ");
        int Salary3 = in.nextInt();
        int max = 0;
        int min = 0;
        if (Salary1 >= Salary2 && Salary1 >= Salary3){
            max = Salary1;
        }
        if (Salary2 >= Salary1 && Salary2 >= Salary3){
            max = Salary2;
        }
        if (Salary3 >= Salary1 && Salary3 >= Salary2){
            max = Salary3;
        }
        if (Salary1 <= Salary2 && Salary1 <= Salary3){
            min = Salary1;
        }
        if (Salary2 <= Salary1 && Salary2 <= Salary3){
            min = Salary2;
        }
        if (Salary3 <= Salary1 && Salary3 <= Salary2){
            min = Salary3;
        }
        int d = max - min;
        System.out.println ("Difference between max and min salary is "+d);
    }
}
// Даны зарплаты трех людей salary1, salary2 и salary3. Найти разницу между максимальной и минимальной зарплатой.