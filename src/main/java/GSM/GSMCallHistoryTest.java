package GSM;

import java.util.ArrayList;

public class GSMCallHistoryTest {
    public static void main(String[] args) {
        GSM oppo = new GSM("OPPO-F3", "oppo");

        oppo.call("0382403161");
        oppo.call("0375656123");
        oppo.call("0362541654");
        oppo.call("6541236547");
//        double total = oppo.calculatePrice(0.37);
//        System.out.println(oppo.calculatePrice(0.37));

        System.out.println("calls");
        oppo.showCallsInfo();
        System.out.println("Price " + oppo.calculatePrice(0.37));
        oppo.removeLongestCall();

        System.out.println("calls after remove");
        oppo.showCallsInfo();
        System.out.println("Price " + oppo.calculatePrice(0.37));

        oppo.clearCallHistory();
        oppo.showCallsInfo();
    }
}
