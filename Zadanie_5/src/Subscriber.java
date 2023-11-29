import java.util.List;
public class Subscriber implements Observer{
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handlerEvent(Message message) {
        System.out.println(name+" you have new message "+message.getContent());
    }
}