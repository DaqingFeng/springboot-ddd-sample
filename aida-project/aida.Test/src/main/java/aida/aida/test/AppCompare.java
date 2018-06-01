package aida.aida.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by fengdaqing on 2018/5/31.
 */
public class AppCompare {

    @Test
    public void TestCompare() {
        List<Message> messageList = new ArrayList<>();
        Message b = new Message("A");
        messageList.add(b);

        Message a = new Message("B");
        messageList.add(a);

        System.out.println(a.compareTo(b) == 0);

        Comparator<Message> comparatorObj =  Comparator.comparing(emp -> emp.getTitle());
        messageList.forEach((item) -> {
            System.out.println(item.getTitle());
        });
    }
}
