// Реализуйте систему управления разными видами баз данных (SQL, NoSQL, графовые) с использованием паттерна "мост"
public class Main {
    public static void main(String[] args){
        Connect connected = new DateBaseConnect(new NoSQL());
        connected.connect();
    }
}