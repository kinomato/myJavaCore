import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.util.Date;

public class App {

    public static void setTimeoutSync(Runnable runnable, int delay) {
        try {
            Thread.sleep(delay);
            runnable.run();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
//        Date a = new Date();
//        System.out.println(a);
        //6p34s 360+34s
//        Duration b = Duration.ofSeconds(394);
//        System.out.println(b.toSecondsPart());


//        System.out.println(LocalDateTime.now());
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        Call call = new Call("0382403161");
//        call.start();
//        setTimeoutSync(() ->call.end(),3000);
//        System.out.println(call);

        Double a = Math.random()*100;
        System.out.println(a.intValue());
    }
}
