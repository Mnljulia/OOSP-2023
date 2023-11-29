public class User {
    private String name;
    private String surname;
    private int age;
    private String email;

    public static class Human {
        private String name;
        private String surname;
        private int age;
        private String email;

    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User (User build) {
        User user=new User(this);
        return user;
    }

        private User(Human builder) {
            this.name = builder.name;
            this.surname = builder.surname;
            this.age = builder.age;
            this.email = builder.email;
        }
        public String getName(){
        return name;
        }
        public String getSurname(){
        return surname;
        }
        public int getAge(){
        return age;
        }
        public String getEmail(){
        return email;
        }
}









