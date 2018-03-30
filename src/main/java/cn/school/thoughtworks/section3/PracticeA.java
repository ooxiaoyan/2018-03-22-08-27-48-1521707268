package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> list2 = object.get("value");
        for (String s : list2) {
            for (Map.Entry<String, Integer> entry : collectionA.entrySet()) {
                if (entry.getKey().equals(s)) {
                    collectionA.put(entry.getKey(), entry.getValue() - 1);
                }
            }
        }
        return collectionA;
    }
}
