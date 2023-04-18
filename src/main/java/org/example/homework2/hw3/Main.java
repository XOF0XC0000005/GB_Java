package org.example.homework2.hw3;

public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = new int[] {10, 4, -299, 19, 10, -2, 4, 300, -40, 50};
        replaceNegativeElements(numbers);
        printArray(numbers);
    }

    /**
     * Заменяем все негативные элементы входящего массива
     * @param elements входящий массив данных
     */
    private static void replaceNegativeElements(int[] elements)
    {
        int twoDigitIndicesSum = 0;

        for (int i = 0; i < elements.length; i++)
        {
            if (Math.abs(elements[i]) >= 10 && Math.abs(elements[i]) < 100)
            {
                twoDigitIndicesSum += i;
            }
        }

        for (int i = 0; i < elements.length; i++)
        {
            if (elements[i] < 0)
            {
                elements[i] = twoDigitIndicesSum;
            }
        }
    }

    /**
     * Печатаем массив
     * @param numbers входящий массив данных
     */
    private static void printArray(int[] numbers)
    {
        for (int number : numbers)
        {
            System.out.print(number + " ");
        }
    }
}
