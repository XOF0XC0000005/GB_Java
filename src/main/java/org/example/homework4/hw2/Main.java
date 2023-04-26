package org.example.homework4.hw2;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        String text = "()";
        System.out.println(isValid(text));
        String text1 = "()[]{}";
        System.out.println(isValid(text1));
        String text2 = "(]";
        System.out.println(isValid(text2));
    }

    private static boolean isValid(String s)
    {
        char[] parenthesisTextCharArray = s.toCharArray();
        boolean isBalanced = true;
        Map<Character,Character> dictionary = new HashMap<Character,Character>();
        dictionary.put('(', ')');
        dictionary.put('{', '}');
        dictionary.put('[',']');

        for (int i = 0; i < parenthesisTextCharArray.length - 1; i += 2)
        {
            if (dictionary.get(parenthesisTextCharArray[i]) != parenthesisTextCharArray[i + 1])
            {
                isBalanced = false;
            }
        }

        return isBalanced;
    }
}