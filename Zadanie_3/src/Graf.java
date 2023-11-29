public class Graf implements DBLibrary {
    @Override
    public void conectedDB() {
        System.out.println("Graf DataBase connect");
    }

    @Override
    public void startDB() {
        System.out.println("Graf DataBase server start");
    }
}