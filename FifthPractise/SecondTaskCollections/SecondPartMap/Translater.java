package FifthPractise.SecondTaskCollections.SecondPartMap;

import java.util.*;

public class Translater   {


    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("hello", "привет");
        map.put("dictionary","словарь");
        map.put("word","слово");
    }


    public void addPair(String english, String russian) {
        map.put(english,russian);
    }

    public String translateWord(String english) {
        if (map.get(english) == null)
            return "There is no such word as " + english;

        return map.get(english);

    }

    public String translateSentences(String sentences) {
        String[] array = sentences.split(" ");
        StringBuilder builder = new StringBuilder();

        for (String word: array
             ) {
            if (map.get(word.toLowerCase()) == null)
                builder.append(word);
            else builder.append(map.get(word.toLowerCase())).append(" ");
        }

        return builder.toString().trim();
    }

}
