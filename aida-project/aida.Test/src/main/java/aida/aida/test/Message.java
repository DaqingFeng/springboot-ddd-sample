package aida.aida.test;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by fengdaqing on 2018/2/1.
 */
public class Message implements Comparable<Message> {

    public  String MessageInfo;

    private String Content;

    private MessageEnumType MessageType;

    private String Title;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Message() {

    }

    public Message(String title) {
        this.Title = title;
    }

    public Message(String content, String title) {
        this.Content = content;
        this.Title = title;
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

    @Override
    public int compareTo(Message o) {
        Comparator<Message> naturalOrderComparator = Comparator.comparing(Message::getTitle);
        return naturalOrderComparator.compare(this, o);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Message)) {
            return false;
        }
        Message empObj = (Message) obj;
        return this.Title == empObj.getTitle();
    }

    @Override
    public int hashCode() {
       return Objects.hash(Title);
    }
}

