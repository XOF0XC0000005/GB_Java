package org.example.homework4.hw1;

import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Integer elementsCount = 5;

        for (int i = 1; i <= elementsCount; i++)
        {
            list.add(i);
        }

        int j = list.size() - 1;

        for (int i = 0; i < list.size() / 2; i++)
        {
            // 1 2 3 4 // 4 2 3 1 // 4 3 2 1
            int temp = list.get(j);
            list.set(j, list.get(i));
            list.set(i, temp);
            j--;
        }

        for (int num : list)
        {
            System.out.print(num + " ");
        }
    }
}
