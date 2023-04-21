package org.example.homework3.hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Integer currentMinCost = Integer.MAX_VALUE;
        String currentMinProductName = "";
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Третий высший продукт", "Америка", 10, 300, 1));
        products.add(new Product("Первый высший продукт", "Россия", 20, 100, 1));
        products.add(new Product("Второй продукт", "Америка", 15, 200, 2));
        products.add(new Product("Четвертый высший продукт",  "Россия",15, 400, 2));
        products.add(new Product("Пятый продукт",  "Америка", 10,500, 1));
        System.out.print("Введите сорт продукта: ");
        Integer userInput = scanner.nextInt();

        for (Product product : products)
        {
            if (product.getGrade() == userInput && currentMinCost > product.getCost())
            {
                currentMinCost = product.getCost();
                currentMinProductName = product.getName();
            }
        }

        scanner.close();
        System.out.println(currentMinProductName);
    }
}
