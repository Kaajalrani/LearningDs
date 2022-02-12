package JavaProgramsPractice;

import java.util.HashMap;
import java.util.Map;

public class StringWordCount {
    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<String,Integer>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three",3);
        System.out.println(numbers);
        System.out.println(numbers.get("three"));
    }
}
