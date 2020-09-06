package Homework1;

public class Hw1Tsk2 {
    public static void main (String [] args){
        int r = 4;
        double s;
        double c;
        if (r<=0) {
            System.out.println ("r<=0");
        }
        s = 3.14*(r*r);
        c = 2*3.14*r;
        if (r>0) {
            System.out.println ("s = "+s);
            System.out.println ("c = "+c);
        }
    }
}
