package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Long> map = collection1.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<String,Integer> result = new HashMap<>();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            Integer value = Math.toIntExact(entry.getValue());
            result.put(entry.getKey(), value);
        }
        return result;
    }
}
