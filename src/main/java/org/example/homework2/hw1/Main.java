package org.example.homework2.hw1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(subsequencePrimesSum());
    }

    /**
     *
     * @return Возвращает сумму простых чисел из последовательности
     */
    private static int subsequencePrimesSum()
    {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = 0;
        int result = 0;

        while (currentNumber >= 0)
        {
            try
            {
                currentNumber = scanner.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Вводите только целые числа!");
                scanner.nextLine();
            }

            if(isPrime(currentNumber))
            {
                result += currentNumber;
            }
        }

        scanner.close();
        return result;
    }

    /**
     *
     * @param number проверяемое число
     * @return Возвращает булевое значение проверки на простоту числа
     */
    private static boolean isPrime(int number)
    {
        if (number < 2)
        {
            return  false;
        }

        for (int i = 2; i * i < number; i++)
        {
            if (number % i == 0)
            {
                return  false;
            }
        }

        return  true;
    }
}
