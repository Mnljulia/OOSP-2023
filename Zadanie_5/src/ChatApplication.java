import java.util.ArrayList;
import java.util.List;
public class ChatApplication implements Observable {
    List<Observer> subscriberList = new ArrayList<>();
    List<Message> chats = new ArrayList<>();

    public void addMessage(Message message) {
        chats.add(message);
        notifyObservers(message);

    }

    @Override
    public void registerObserver(Observer o) {
        subscriberList.add(o);


    }

    @Override
    public void removeObserver(Observer o) {
        subscriberList.remove(o);

    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : subscriberList) {
            observer.handlerEvent(message);
        }
    }
}