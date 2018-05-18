package aida.aida.test;

/**
 * Created by fengdaqing on 2018/2/1.
 */
public class Message {

    private String Content;

    private MessageEnumType MessageType;

    public Message() {

    }

    public Message(String content) {
        Content = content;
    }

    public MessageEnumType getMessageType() {
        return MessageType;
    }

    public void setMessageType(MessageEnumType messageType) {
        MessageType = messageType;
    }


    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
