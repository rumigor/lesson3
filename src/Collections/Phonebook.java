package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    Map<String, List<Integer>> records = new HashMap<>();

    public void add (String surname, int number) {
        List<Integer> numbers = new ArrayList<>();
        if (records.containsKey(surname)) {
            numbers.addAll(records.get(surname));
        }
        numbers.add(number);
        records.put(surname, numbers);
    }

    public void get (String surname) {
        System.out.println(surname + ": " + records.get(surname));
    }
}
