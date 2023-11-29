public class DateBaseConnect extends Connect{

    public DateBaseConnect(DBLibrary library) {
        super(library);
    }


    public void connect(){
        dataBaseLibrary.conectedDB();
        dataBaseLibrary.startDB();
        System.out.println("Complit");
    }
}
