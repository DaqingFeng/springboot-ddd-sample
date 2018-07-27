package aida.aida.test;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by fengdaqing on 2018/5/18.
 */
public class AppReflection {

    @Test
    public void ReflectionTest() {
        try {
            Message message = new Message("Testing");
            message.MessageInfo="Hello world";
            message.setMessageType(MessageEnumType.Normall);

            Class classInfo = Message.class;

            Field[] fileds = classInfo.getDeclaredFields();
            // Field[] fileds = classInfo.getFields();

            Class assembly = Class.forName(message.getClass().getName());
            Object obj = assembly.newInstance();
            for (Field field : fileds) {
                // make the declared fields can be accessible.
                 field.setAccessible(true);
                Object value = field.get(message);
                field.set(obj, value);
            }
            System.out.print("Hello world");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
