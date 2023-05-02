package org.example.homework5.hw2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> namesCount = new HashMap<>();
        LinkedList<String> users = new LinkedList<>();
        users.push("Иван Иванов");
        users.push("Светлана Петрова");
        users.push("Кристина Белова");
        users.push("Анна Мусина");
        users.push("Анна Крутова");
        users.push("Иван Юрин");
        users.push("Петр Лыков");
        users.push("Павел Чернов");
        users.push("Петр Чернышов");
        users.push("Мария Федорова");
        users.push("Марина Светлова");
        users.push("Мария Савина");
        users.push("Мария Рыкова");
        users.push("Марина Лугова");
        users.push("Анна Владимирова");
        users.push("Иван Мечников");
        users.push("Петр Петин");
        users.push("Иван Ежов");

        for (String user : users) {
            String[] splittedUser = user.split(" ");

            if (!namesCount.containsKey(splittedUser[0])) {
                namesCount.put(splittedUser[0], 1);
            } else {
                namesCount.replace(splittedUser[0], namesCount.get(splittedUser[0]) + 1);
            }
        }

        namesCount.entrySet().stream().sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
