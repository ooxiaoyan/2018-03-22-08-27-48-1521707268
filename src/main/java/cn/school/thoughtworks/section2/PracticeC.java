package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
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
            char[] c = s.toCharArray();
            int number = 0, count = 0;
            for (char c1 : c) {
                if (Character.isDigit(c1)) {
                    if (count == 0) {
                        number = c1 - '0';
                    } else {
                        number = number * 10 + (c1 - '0');
                    }
                    count++;
                }
            }

            boolean isExist = false;
            for (Map.Entry<String, Integer> entry : result.entrySet()) {
                if (entry.getKey().equals(String.valueOf(c[0]))) {
                    isExist = true;
                    int value = entry.getValue() + number;
                    result.put(entry.getKey(), value);
                }
            }
            if (!isExist) {
                result.put(String.valueOf(c[0]), number);
            }
        }

        return result;
    }
}
