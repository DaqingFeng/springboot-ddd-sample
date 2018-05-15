package aida.aida.test;

/**
 * Created by fengdaqing on 2018/2/11.
 */
public class AppCallback {
    private static String Add(Integer i) {
        System.out.println(i);
        return i.toString();
    }

    public  static void main(String[] args) {
        CallBackInvoke invoke = new CallBackInvoke();
        invoke.InvokeMethod(100, AppCallback::Add);
    }
}
