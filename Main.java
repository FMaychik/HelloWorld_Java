import java.util.concurrent.TimeUnit;

/*
*Programm by @foximay
* Discord: @foximay
*/


public class Main {
    //const
    public static final int LOOPS = 1;
    public static final int SEC = 2;

    public static void main(String[] args) throws InterruptedException {
        while (LOOPS == 1)
        {
            System.out.println("Hello, World!");
            TimeUnit.SECONDS.sleep(2);
        }
    }
}