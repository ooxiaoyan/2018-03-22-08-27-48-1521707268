package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> distinct = collection1.stream()
                .filter(item -> !collection2.contains(item)).collect(Collectors.toList());

        List<String> result = collection1.stream()
                .filter(item -> !distinct.contains(item)).collect(Collectors.toList());

        return result;

        /*
        没有使用Java8
         */
//        List<String> distinct = new ArrayList<String>(collection1);
//        List<String> repeat = new ArrayList<String>(collection1);
//        distinct.removeAll(collection2);
//        repeat.removeAll(distinct);
//        return repeat;

        /*
        说明：以下方法为java8 Stream 实现
        由于测试用例给出的测试结果为：String[] expectedResult = new String[]{"a", "e", "f", "d"};
        但使用Stream得出的结果为：{"a", "d", "e", "f"}
        其实结果的内容一样，但是元素的顺序不一样，会导致测试用例无法通过，故选择了上文方法通过测试用例
         */
//        List<String> list = new ArrayList<>();
//        list.addAll(collection2);
//        list.addAll(collection1);
//        List<String> result = list.stream()
//                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum)) // 获得元素出现频率的 Map，键为元素，值为元素出现的次数
//                .entrySet().stream()                   // 所有 entry 对应的 Stream
//                .filter(entry -> entry.getValue() > 1) // 过滤出元素出现次数大于 1 的 entry
//                .map(entry -> entry.getKey())          // 获得 entry 的键（重复元素）对应的 Stream
//                .collect(Collectors.toList());         // 转化为 List
//        return result;
    }
}
