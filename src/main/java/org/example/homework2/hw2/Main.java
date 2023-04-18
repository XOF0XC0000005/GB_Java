package org.example.homework2.hw2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(isIncreasingSequence());
    }

    /**
     *
     * @return Возвращает булево значение возрастающая ли последовательность.
     */
    private static boolean isIncreasingSequence()
    {
        Scanner scanner = new Scanner(System.in);
        int currentNumber;
        int nextNumber = Integer.MIN_VALUE;
        System.out.println("Для выхода из ввода последовательности введите не число");

        while (true)
        {
            try
            {
                currentNumber = scanner.nextInt();

                if (currentNumber < nextNumber)
                {
                    return false;
                }

                nextNumber = currentNumber;
            }
            catch (Exception e)
            {
                break;
            }
        }

        return true;
    }
}
