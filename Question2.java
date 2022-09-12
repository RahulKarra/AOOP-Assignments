package AOOP;

import java.util.Scanner;

class NegativeNumberNotAllowedException extends Exception
{
    public NegativeNumberNotAllowedException(String s)
    {
        super(s);
    }
}
class NumberNotPrimeException extends Exception {
    public NumberNotPrimeException(String s) {
        super(s);
    }
}

public class Question2 {
    public static void main(String[] args) throws NegativeNumberNotAllowedException, NumberNotPrimeException {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number ");
        int number = in.nextInt();

        if (number <0) {
            throw new NegativeNumberNotAllowedException("Negative Number Not Allowed");
        }

        else if (isPrime(number)) {
                System.out.println("The Entered Number is prime");
            }

        else {
            throw new NumberNotPrimeException("Number is not prime");
        }
    }

    public  static boolean isPrime(int num)
    {
        if (num<=1)
        {
            return false;
        }
        for (int i=2; i<Math.sqrt(num); i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}


