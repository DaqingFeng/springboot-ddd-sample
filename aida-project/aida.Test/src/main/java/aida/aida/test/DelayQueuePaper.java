package aida.aida.test;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by fengdaqing on 2018/6/5.
 */
public class DelayQueuePaper implements Delayed {

    private final long delayTime; //延迟时间

    private final long expire;  //到期时间

    private final String messageBody;//消息体

    public String GetMessageBody() {
        return messageBody;
    }

    public DelayQueuePaper(long delay, String _message) {
        delayTime = delay;
        expire = System.currentTimeMillis() + delayTime;
        messageBody = _message;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(this.expire - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
    }
}
