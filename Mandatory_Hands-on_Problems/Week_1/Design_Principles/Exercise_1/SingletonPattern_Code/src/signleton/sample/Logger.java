package signleton.sample;

public class Logger {
    private static Logger Logger;


    private Logger() {

    }

    public static Logger getInstance() {
        if(Logger==null) {
            Logger=new Logger();
        }
        return Logger;
    }
    public void display(String str) {
        System.out.println(str);
    }

}
