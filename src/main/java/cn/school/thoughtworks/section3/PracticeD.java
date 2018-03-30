package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeB;

import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        cn.school.thoughtworks.section2.PracticeB practiceB2 = new PracticeB();
        Map<String, Integer> collection3 = practiceB2.countSameElements(collectionA);
        cn.school.thoughtworks.section3.PracticeB practiceB3 = new cn.school.thoughtworks.section3.PracticeB();
        Map<String,Integer> result = practiceB3.createUpdatedCollection(collection3, object);
        return result;
    }
}
