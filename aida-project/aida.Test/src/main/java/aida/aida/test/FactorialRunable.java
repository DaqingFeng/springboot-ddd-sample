package aida.aida.test;

import java.util.List;

/**
 * Created by fengdaqing on 2018/1/25.
 */
public class FactorialRunable implements Runnable {
    private List<Integer> excuteList = null;

    public FactorialRunable(List<Integer> _excutelist) {
        excuteList = _excutelist;
    }

    @Override
    public void run() {
        for (int i : excuteList) {
            System.out.println(i);
        }
    }
}
