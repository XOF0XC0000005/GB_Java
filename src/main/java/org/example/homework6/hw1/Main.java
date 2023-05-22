package org.example.homework6.hw1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Laptop> laptops = new HashSet<>();
        Laptop laptop1 = new Laptop("Test Name", "CZ123123",  32, "black", "Windows");
        Laptop laptop2 = new Laptop("Irbis NB77", "CZ235534", 16, "black", "Windows");
        Laptop laptop3 = new Laptop("DEXP Aquilon", "KN341231", 32, "red", "Linux");
        Laptop laptop4 = new Laptop("ASUS Laptop 15", "CZ123123", 8, "white", "Linux");
        Laptop laptop5 = new Laptop("Acer Aspire 3", "MN1234552", 16, "white", "Windows");

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        filterLaptops(laptops);

    }

    private static void filterLaptops(HashSet<Laptop> laptops)
    {
        Scanner scanner = new Scanner(System.in);
        String exitCommand = "6";
        String userInput = "";

        while(!userInput.equals(exitCommand))
        {
            System.out.println("Введите цифру,соответсвующую необходимому критерию: ");
            System.out.println("1 - Name");
            System.out.println("2 - Serial number");
            System.out.println("3 - RAM");
            System.out.println("4 - Color");
            System.out.println("5 - Operational System");
            System.out.println(exitCommand + " - Exit");
            System.out.print("Ввод: ");
            userInput = scanner.nextLine();

            if (!isNumeric(userInput))
            {
                System.out.println("Введите число!");
            }
            else
            {
                switch (userInput)
                {
                    case ("1"):
                        filteredByName(laptops);
                        break;
                    case ("2"):
                        filteredBySerialNumber(laptops);
                        break;
                    case ("3"):
                        filteredByRam(laptops);
                        break;
                    case ("4"):
                        filteredByColor(laptops);
                        break;
                    case ("5"):
                        filteredByOperationalSystem(laptops);
                        break;
                }
            }

        }
        scanner.close();
    }

    private static void filteredByName(HashSet<Laptop> laptops)
    {
        String searchingName = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        searchingName = scanner.nextLine();

        for (Laptop laptop : laptops)
        {
            if (laptop._name.toLowerCase().equals(searchingName.toLowerCase()))
            {
                laptop.showInfo();
            }
        }
    }

    private static void filteredBySerialNumber(HashSet<Laptop> laptops)
    {
        String searchingSerialNumber = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите серийный номер: ");
        searchingSerialNumber = scanner.nextLine();

        for (Laptop laptop : laptops)
        {
            if (laptop._serialNumber.toLowerCase().equals(searchingSerialNumber.toLowerCase()))
            {
                laptop.showInfo();
            }
        }
    }

    private static void filteredByRam(HashSet<Laptop> laptops)
    {
        int searchingRam;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество ОЗУ: ");
        searchingRam = scanner.nextInt();

        for (Laptop laptop : laptops)
        {
            if (laptop._ram == searchingRam)
            {
                laptop.showInfo();
            }
        }
    }

    private static void filteredByColor(HashSet<Laptop> laptops)
    {
        String searchingColor = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цвет: ");
        searchingColor = scanner.nextLine();

        for (Laptop laptop : laptops)
        {
            if (laptop._color.toLowerCase().equals(searchingColor.toLowerCase()))
            {
                laptop.showInfo();
            }
        }
    }

    private static void filteredByOperationalSystem(HashSet<Laptop> laptops)
    {
        String searchingOperationalSystem = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операционную систему: ");
        searchingOperationalSystem = scanner.nextLine();

        for (Laptop laptop : laptops)
        {
            if (laptop._operationalSystem.toLowerCase().equals(searchingOperationalSystem.toLowerCase()))
            {
                laptop.showInfo();
            }
        }
    }

    private static boolean isNumeric(String str)
    {
        if (str == null)
        {
            return false;
        }
        try
        {
            int number = Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            return false;
        }

        return true;
    }
}
