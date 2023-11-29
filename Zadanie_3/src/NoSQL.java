public class NoSQL implements DBLibrary {
    @Override
    public void conectedDB() {
        System.out.println("NoSQL DataBase connecte");
    }

    @Override
    public void startDB() {
        System.out.println("NoSQL DataBase server start");
    }
}
