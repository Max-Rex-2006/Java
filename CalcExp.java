package ARC.Gitdemo.Java;

import java.util.Scanner;

public class CalcExp
{
    public static void main(String[] args) 
    {
        double a=0, b=0, result; //The numbers that are to be used
        int ins=0; //Users instruction whether to add, sub, mult or div
        Scanner scn = new Scanner(System.in); //user input
        boolean cont = true; //Whether to continue using of stop
        
        while (cont == true)
        {
            System.out.println("Please enter:\n 1-to add \n 2-to subtract \n 3-to multiply \n 4-to divide");
            ins = scn.nextInt();
            if ((ins>=1)&&(ins<=4))
            {
                System.out.println("Please enter the numbers:");
                a = scn.nextDouble();
                b = scn.nextDouble();
                switch (ins)
                {
                    case 1:
                    result = a + b;
                    System.out.println("The sum is:" + result);
                    break;
                    case 2:
                    result = a - b;
                    System.out.println("The difference is:" + result);
                    break;
                    case 3:
                    result = a * b;
                    System.out.println("The product is:" + result);
                    break;
                    case 4:
                    result = a / b;
                    System.out.println("The quotient is:" + result);
                    break;
                };
                System.out.println("Do you want to continue? Please answer true to continue or false to exit");
                cont = scn.nextBoolean();
            }
            else
            {
                System.out.println("Please enter an option between 1 and 4.");
            };
        }
        scn.close();
    }
}
