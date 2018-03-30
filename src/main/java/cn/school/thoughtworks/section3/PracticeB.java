package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> list2 = object.get("value");
        for (String s : list2) {
            for (Map.Entry<String, Integer> entry : collectionA.entrySet()) {
                if (entry.getKey().equals(s)) {
                    int number = entry.getValue() / 3;
                    collectionA.put(entry.getKey(), entry.getValue()-number);
                }
            }
        }
        return collectionA;
    }
}
