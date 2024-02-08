package lesson8;

import java.util.ArrayList;
import java.util.HashSet;

public class Task8 {
    public static void main(String[] args) {
        String[] words = {"один", "два", "три", "четыре", "три", "пять", "два", "шесть", "семь", "восемь",
                "девять", "десять"};

        HashSet<String> unique = new HashSet<>();
        for (String word : words) {
            unique.add(word);
        }

        for (String word : unique) {
            System.out.println(word);
        }


        Phonebook phonebook = new Phonebook();
        phonebook.add("Карева", "9003153662");
        phonebook.add("Карева", "9061577245");
        phonebook.add("Морозов", "9028997654");
        phonebook.add("Юдин", "9278457342");
        phonebook.add("Крылова", "9003278667");

        ArrayList<String> karevaNumbers = phonebook.get("Карева");
        for (String number : karevaNumbers) {
            System.out.println(number);
        }
    }
}
