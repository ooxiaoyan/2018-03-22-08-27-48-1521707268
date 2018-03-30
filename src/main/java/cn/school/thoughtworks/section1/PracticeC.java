package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //选出1集合中跟2对象中value属性中的元素相同的元素
        List<String> list2 = collection2.get("value");
        List<String> distinct = collection1.stream()
                .filter(item -> !list2.contains(item)).collect(Collectors.toList());
        List<String> result = collection1.stream()
                .filter(item -> !distinct.contains(item)).collect(Collectors.toList());
        return result;
    }
}
