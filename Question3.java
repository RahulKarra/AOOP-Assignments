package AOOP;

import java.util.Scanner;

class SubStringNotFoundException extends Exception
{
    public SubStringNotFoundException(String s)
    {
        super(s);
    }
}

public class Question3 {
    public static void main(String[] args) throws SubStringNotFoundException {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Line of Text");
        String input=in.nextLine();
        System.out.println(input);
        System.out.println("Enter the substring u want to search for: ");
        String subString=in.nextLine();

       boolean result =input.toLowerCase().contains(subString.toLowerCase());
       if (result)
       {
           System.out.println("Success!!");
       }
       else {
           throw new SubStringNotFoundException("No! SubString is present in the given String");
       }
    }
}
