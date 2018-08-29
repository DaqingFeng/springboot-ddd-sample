package aida.aida.test;

import aida.aida.model.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by fengdaqing on 2018/7/25.
 */
public class AppHashMap {

    @Test
    public void HashmapTest() {
        HashMap<Student, Student> maps = new HashMap();
        Student stu1 = new Student("1", 30, "xxx");
        maps.put(stu1, stu1);
        List<Student> studentList = new ArrayList<>();
        studentList.add(stu1);

        Student stu2 = new Student("1", 30, "Hello");
        maps.put(stu2, stu2);
        studentList.add(stu2);

        List<Student> distinct = studentList.stream().distinct().collect(Collectors.toList());

        for (Map.Entry<Student, Student> entry : maps.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue().getJob());
        }
    }
}
