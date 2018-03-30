package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeB {
    public Map<String, Integer> countSameElements(List<String> collection1) {
        List<String> listSingle = new ArrayList<>(), listMultiple = new ArrayList<>();
        for (String s : collection1) {
            if (s.length() == 1) {
                listSingle.add(s);
            } else {
                listMultiple.add(s);
            }
        }

        Map<String, Long> map = listSingle.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String,Integer> result = new HashMap<>();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            Integer value = Math.toIntExact(entry.getValue());
            result.put(entry.getKey(), value);
        }

        for (String s : listMultiple) {
            String[] string = s.split("-");
            boolean isExist = false;
            for (Map.Entry<String, Integer> entry : result.entrySet()) {
                if (string[0].equals(entry.getKey())) {
                    isExist = true;
                    int value = entry.getValue() + Integer.valueOf(string[1]);
                    result.put(entry.getKey(), value);
                }
            }
            if (!isExist) {
                result.put(string[0],Integer.valueOf(string[1]));
            }
        }

        return result;
    }
}
