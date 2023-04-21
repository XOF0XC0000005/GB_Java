package org.example.homework3.hw1;

import javax.sound.sampled.Port;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Третий высший продукт ", 300, 1));
        products.add(new Product("Первый высший продукт", 100, 1));
        products.add(new Product("Второй продукт", 200, 2));
        products.add(new Product("Четвертый высший продукт", 400, 2));
        products.add(new Product("Пятый продукт", 500, 1));
        Integer maxFirstGradeCost = -1;
        Integer maxSecondGradeCost = -1;
        Product currentMaxFirstGradeProduct = null;
        Product currentMaxSecondGradeProduct = null;

        for (Product product : products)
        {
            if (product.getName().contains("высший") && product.getGrade() == 1)
            {
                if (maxFirstGradeCost < product.getCost())
                {
                    maxFirstGradeCost = product.getCost();
                    currentMaxFirstGradeProduct = product;
                }
            }
            else if (product.getName().contains("высший") && product.getGrade() == 2)
            {
                if (maxSecondGradeCost < product.getCost())
                {
                    maxSecondGradeCost = product.getCost();
                    currentMaxSecondGradeProduct = product;
                }
            }
        }

        System.out.println(currentMaxFirstGradeProduct.toString());
        System.out.println(currentMaxSecondGradeProduct.toString());

         /*
        maxGradeCost = -1;
        currentMaxGradeProduct = null;

        for (Product product : products)
        {
            if (product.getName().contains("высший"))
            {
                if (maxGradeCost < product.getCost())
                {
                    maxGradeCost = product.getCost();
                    currentMaxGradeProduct = product;
                }
            }
        }

        System.out.println(currentMaxGradeProduct.toString());*/
    }
}
