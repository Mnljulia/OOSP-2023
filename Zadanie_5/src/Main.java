public class Main {
    public static void main(String[] args) {
        ChatApplication chatApplication=new ChatApplication();
        Subscriber subscriber=new Subscriber("stas");
        Subscriber subscriber1=new Subscriber("vas");
        chatApplication.registerObserver(subscriber);
        chatApplication.registerObserver(subscriber1);
        chatApplication.addMessage(new Message("wats up men "));
        chatApplication.addMessage(new Message("wasaaap"));
        chatApplication.removeObserver(subscriber);
        chatApplication.addMessage(new Message("poka "));
    }
}