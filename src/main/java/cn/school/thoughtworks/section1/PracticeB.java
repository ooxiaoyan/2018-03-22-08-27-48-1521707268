package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> distinct = collection1;
        for (List<String> list : collection2) {
            distinct = distinct.stream()
                .filter(item -> !list.contains(item)).collect(Collectors.toList());
        }
        List<String> finalDistinct = distinct;
        List<String> result = collection1.stream()
                .filter(item -> !finalDistinct.contains(item)).collect(Collectors.toList());
        return result;
    }
}
