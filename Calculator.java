package ARC.Gitdemo.Java;
import java.util.*;
public class Calculator
{
    public static void main(String[] args) 
    {
        double a=0, b=0, result;
        int ins=0;
        Scanner scn = new Scanner(System.in);
        boolean cont = true;
        while (cont == true)
        {
            System.out.println("Please enter:\n 1-to add \n 2-to subtract \n 3-to multiply \n 4-to divide");
            ins = scn.nextInt();
            System.out.println("Please enter the numbers:");
            a = scn.nextDouble();
            b = scn.nextDouble();
            //if ((ins>=1)&&(ins<=4))
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
        scn.close();
    }
}