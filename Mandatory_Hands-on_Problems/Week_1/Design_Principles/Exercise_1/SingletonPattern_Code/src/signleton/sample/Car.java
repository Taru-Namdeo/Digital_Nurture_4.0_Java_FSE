package signleton.sample;

public class Car implements Transport {

    public Car() {
        
        Logger.getInstance().display("This is a car");
    }

    @Override
    public void move(){
        Logger.getInstance().display("in car");
    }

}
