package AOOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


class VowelNotAllowedException extends Exception {
    VowelNotAllowedException() {
        System.out.println("Vowel Found!!");
    }
}

class Question4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File src = new File("C:/Users/Rahul/Desktop/Alphabets.txt");
        File dest = new File("C:/Users/Rahul/Desktop/Consonants.txt");
        FileReader fread = new FileReader(src);
        FileWriter fwrite = new FileWriter(dest);

        BufferedReader buffer = new BufferedReader(fread);
        int temp;
        while ((temp = buffer.read()) != -1) {
            char c = (char) temp;

            if (Question4.isVowel(c) == false) {
                System.out.println(c);
                fwrite.append(c);
            } else {
                try {
                    throw new VowelNotAllowedException();
                } catch (VowelNotAllowedException e) {
                    e.printStackTrace();
                }
            }
        }
        fwrite.close();
        buffer.close();

    }

     static boolean isVowel(char c) {
        if (c == 'a' || c == 'A')
            return true;
        else if (c == 'e' || c == 'E')
            return true;
        else if (c == 'i' || c == 'I')
            return true;
        else if (c == 'o' || c == 'O')
            return true;
        else if (c == 'u' || c == 'U')
            return true;
        else
            return false;
    }
}

