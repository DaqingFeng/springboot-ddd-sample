package aida.aida.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fengdaqing on 2018/7/12.
 */
public class AppArrayList {

    @Test
    public   void Main() {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(16, 17, 18, 19, 20));
        List<Integer> list2 = new ArrayList<Integer>(list.subList(2, 5));
        list.retainAll(list2);

        System.out.println(list);
        list.containsAll(list2);
        System.out.println(list);
    }
}
