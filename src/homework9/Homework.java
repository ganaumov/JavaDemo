package homework9;

import java.util.HashMap;
import java.util.Map;

public class Homework {
    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String word : words) {
            if (countMap.containsKey(word)) {
                countMap.put(word, countMap.get(word) + 1);
            } else {
                countMap.put(word, 1);
            }
        }

        Map<String, Boolean> result = new HashMap<>();

        for (String word : countMap.keySet()) {
            result.put(word, countMap.get(word) >= 2);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}

