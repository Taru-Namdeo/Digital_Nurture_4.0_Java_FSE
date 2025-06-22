package signleton.sample;

public class Flight implements SkywayInterface{

    public Flight() {
        //System.out.println("Flight");
        Logger.getInstance().display("Flight created");
    }
    @Override
    public void fly() {
        System.out.println("Fly");
    }

}
