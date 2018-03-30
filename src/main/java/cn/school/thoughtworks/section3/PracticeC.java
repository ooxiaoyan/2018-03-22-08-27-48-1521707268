package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Long> map = collectionA.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String,Integer> collection3 = new HashMap<>();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            Integer value = Math.toIntExact(entry.getValue());
            collection3.put(entry.getKey(), value);
        }

        PracticeB practiceB = new PracticeB();
        Map<String,Integer> result = practiceB.createUpdatedCollection(collection3, object);

        return result;
    }
}
