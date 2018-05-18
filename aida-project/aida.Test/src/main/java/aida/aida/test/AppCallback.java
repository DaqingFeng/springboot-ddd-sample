package aida.aida.test;

import org.junit.Test;

/**
 * Created by fengdaqing on 2018/2/11.
 */
public class AppCallback {

    @Test
    public void callback() {
        CallBackInvoke invoke = new CallBackInvoke();
        invoke.InvokeMethod(100, AppCallback::Add);
    }

    public static String Add(Integer i) {
        System.out.println(i);
        return i.toString();
    }


}
