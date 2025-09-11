package ARC.Gitdemo.Java;

import java.util.Scanner;

public class PercentageCalc {
    public static void main(String[] args) {
        float a,b,c,d,e,result;
        Scanner scn = new Scanner (System.in);
        System.out.println("Please enter the marks of the five subjects whose percentage you want to calculate:");
        a = scn.nextFloat();
        b = scn.nextFloat();
        c = scn.nextFloat();
        d = scn.nextFloat();
        e = scn.nextFloat();
        result = (a+b+c+d+e)/5;
        scn.close();
        System.out.println("Your net percentage is: " + result);
    }    
}
