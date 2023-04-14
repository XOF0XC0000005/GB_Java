package org.example.homework1.hm2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(countPositiveNumbers());
    }

    /**
     *
     * @return количество положительных чисел перед отрицательным
     */
    private static int countPositiveNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        int positiveNumbers = 0;
        int result = 0;
        int currentNumber = -1;

        while (currentNumber != 0)
        {
            try
            {
                currentNumber = scanner.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Вводите только числа!");
                scanner.nextLine();
                continue;
            }

            if (currentNumber >= 0)
            {
                positiveNumbers += currentNumber;
            }
            else
            {
                result += positiveNumbers;
                positiveNumbers = 0;
            }
        }

        scanner.close();
        return result;
    }
}
