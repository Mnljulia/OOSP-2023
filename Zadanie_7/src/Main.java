public class Main {
    private static Object builder;

    public static void main(String[] args) {
        User user = new User(User builder).Human()
                .setName("Julia")
                .setSurname("Menualova")
                .setAge("19")
                .setEmail("juliMnl@mail.ru")
                .build();
        System.out.println("Имя:" + user.getName());
        System.out.println("Фамилия:" + user.getSurname());
        System.out.println("Возраст:" + user.getAge());
        System.out.println("Почта:" + user.getEmail());
    }
}