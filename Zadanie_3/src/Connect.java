public abstract class Connect {
    protected DBLibrary dataBaseLibrary;
    public Connect(DBLibrary library){
        this.dataBaseLibrary = library;
    }
    public abstract void connect();
}