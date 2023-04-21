package org.example.homework3.hw3;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Война и мир", "Толстай", 500, 2022, 1300));
        books.add(new Book("1984", "Оруэлла", 500, 2010, 1200));
        books.add(new Book("Улисс", "Джайс", 900, 2010, 1103));
        books.add(new Book("Человек-невидимка", "Эллисан", 600, 2023, 991));
        ArrayList<String> booksNames = new ArrayList<String>();

        for (Book book : books)
        {
            if (book.getAuthorLastName().toUpperCase().contains("А") && isPrime(book.getPageNumber()) && book.getYear() >= 2010)
            {
                booksNames.add(book.getName());
            }
        }

        for (String bookName : booksNames)
        {
            System.out.println(bookName);
        }
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
