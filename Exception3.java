package AOOP;

public class Exception3 {
    public static void main(String[] args) {

        try {
            int[] array = {1, 2, 3, 4, 5};
            // given length was 4 (as array index starts from 0)
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[5]);
            }
        }
        //throws exception because cannot access out of range element
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("index is not present in the array");
        }
    }
}
