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


        Message a = new Message("B");
        messageList.add(a);

        Message b = new Message("A");
        messageList.add(b);

        Message c = new Message("A");
        messageList.add(c);
        Integer i=null;
        System.out.println(i!=null);

        System.out.print(b.compareTo(c));
        System.out.print(a.compareTo(c));

        System.out.println(b.equals(c));

        Comparator<Message> comparatorObj = Comparator.comparing(emp -> emp.getTitle());
        messageList.forEach((item) -> {
            System.out.println(item.getTitle());
        });
    }
}
