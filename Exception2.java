package AOOP;

import java.lang.NullPointerException;

public class Exception2 {
    public static void main(String[] args) {

        try {
            String input=null;
            System.out.println(input.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("String Input Cannot be Null");
        }
    }
}
