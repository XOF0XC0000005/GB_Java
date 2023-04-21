package org.example.homework3.hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Double result = 0.0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(320);
        numbers.add(9999);
        numbers.add(56);
        numbers.add(20);
        numbers.add(1);

        for (Integer number : numbers)
        {
            result += number;
        }

        System.out.println("Максимальное значение: " + Collections.max(numbers));
        System.out.println("Минимальное значение: " + Collections.min(numbers));
        System.out.println("Среднее значение: " + result / numbers.size());
    }
}
