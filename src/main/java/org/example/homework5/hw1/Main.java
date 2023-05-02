package org.example.homework5.hw1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> dictionary = new HashMap<>();
        System.out.print("Введите текст: ");
        String text = scanner.nextLine().toLowerCase();
        System.out.print("Введите слово для поиска: ");
        String find = scanner.nextLine().toLowerCase();
        String[] splitedText = text.split(" ");

        for (String str : splitedText) {
            if (str.equals(find)) {
                if (!dictionary.containsKey(find)) {
                    dictionary.put(find, 1);
                }
                else {
                    dictionary.replace(find, dictionary.get(find) + 1);
                }
            }
        }

        System.out.println("Ответ: " + find + " - " + dictionary.get(find));
    }
}
