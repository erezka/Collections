package TaskCollections.Services;

import java.util.*;

public class WorkingWithText {
    private Map<String, Integer> textToMap = new HashMap<>();

    public Map<String, Integer> stringToMapAndCountWordRepeats(String text) {
        for (String word : text.split("[^a-zA-zа-яёА-ЯЁ]+")) {
            Integer numberOfRepeats = 1;
            if (textToMap.containsKey(word.toLowerCase())) {
                numberOfRepeats = textToMap.get(word.toLowerCase()) + 1;
                textToMap.put(word.toLowerCase(), numberOfRepeats);
            } else textToMap.put(word.toLowerCase(), numberOfRepeats);

        }
        return textToMap;
    }

    public Set<String> uniqueWords(Map<String, Integer> map) {
        Set<String> uniqueWords = new HashSet<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWords.add(entry.getKey());
            }
        }
        return uniqueWords;
    }

    public Map<String, Integer> SortingByWordLength(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new WordLengthComparator());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public Map<String, Integer> SortingByAlghabet(Map<String, Integer> map){
        Map<String, Integer> treeMap = new TreeMap<>(map);
        return treeMap;
    }


    public Map<String, Integer> getTextToMap() {
        return textToMap;
    }
}
