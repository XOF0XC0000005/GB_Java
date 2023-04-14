package org.example.homework1.hm1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String s = "a good   example";
        String[] splittedString = s.split(" ");
        String reversedText = " ";

        for (int i = splittedString.length - 1; i >= 0; i--)
        {
            if (splittedString[i].equals(""))
            {
                continue;
            }

            reversedText += splittedString[i] + " ";
        }

        System.out.println(reversedText.trim());
    }
}


