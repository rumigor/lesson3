package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static Map <String, List<Integer>> records = new HashMap<>();

    public static void main(String[] args) {
//        Первое задание
        String [] words =  {"арбуз", "стол", "стул", "кот", "собака", "кот", "хвост", "собака", "кот", "миска", "корова",
                "арбуз", "лента", "кирпич", "стол", "крыша", "кот"};
        Map<String, Integer> wordsNum = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int num = wordsNum.getOrDefault(words[i], 0);
            wordsNum.put(words[i], num+1);
        }
        wordsNum.forEach((k,v) ->
                System.out.println(k + ": " + v));
//        Второе задание
        add(new Phonebook("Иванов", 2401523));
        add(new Phonebook("Сидоров", 5846574));
        add(new Phonebook("Клоков", 4556788));
        add(new Phonebook("Иванов", 5678990));
        add(new Phonebook("Сидоров", 7658990));
        add(new Phonebook("Румянцев", 9997788));
        add(new Phonebook("Иванов", 6665544));
        get("Иванов");
        get("Сидоров");
        get("Румянцев");
    }
    public static void add(Phonebook record) {
        List<Integer> numbers = new ArrayList<>();
        if (records.containsKey(record.getSurname())) {
            numbers.addAll(records.get(record.getSurname()));}
        numbers.add(record.getNumber());
        records.put(record.getSurname(), numbers);
    }

    public static void get(String surname) {
        System.out.println(surname + ": " + records.get(surname));
    }

}
