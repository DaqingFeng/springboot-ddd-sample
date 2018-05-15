package aida.aida.test;

import java.util.function.Function;

/**
 * Created by fengdaqing on 2018/2/11.
 */
public class CallBackInvoke {

    public String InvokeMethod(Integer value, Function<Integer, String> function) {
        Integer max = value * 100;
        return function.apply(max);
    }
}
