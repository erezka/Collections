package TaskCollections.Services;

import java.util.Comparator;
import java.util.Map;


public class WordLengthComparator implements Comparator<Map.Entry<String,Integer>> {


    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        int result = 0;
        int wordLengthcompare = o1.getKey().length()- o2.getKey().length();
        if (wordLengthcompare > 0){
            result = 1;
        }else if (wordLengthcompare < 0){
            result = -1;
        }return  result;
    }
}
