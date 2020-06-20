package Collections;

import java.util.HashMap;
import java.util.Map;

public class Main {

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
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", 2401523);
        phonebook.add("Сидоров", 5846574);
        phonebook.add("Клоков", 4556788);
        phonebook.add("Иванов", 5678990);
        phonebook.add("Сидоров", 7658990);
        phonebook.add("Румянцев", 9997788);
        phonebook.add("Иванов", 6665544);
        phonebook.get("Иванов");
        phonebook.get("Сидоров");
        phonebook.get("Румянцев");
    }

}
