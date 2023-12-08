package Abstract;

public class KiaEngine implements Engine {
    @Override
    public Wheels createWheels() {

        return new KiaWheels();
    }

    @Override
    public Body createBody() {
        return new KiaBody();
    }
}
