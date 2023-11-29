public class SQL implements DBLibrary {
    @Override
    public void conectedDB() {
        System.out.println("SQL DataBase connect");
    }

    @Override
    public void startDB() {
        System.out.println("SQL DataBase server start");
    }
}