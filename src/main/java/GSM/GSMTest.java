package GSM;

public class GSMTest {
    public static void main(String[] args) {
        GSM oppo = new GSM("OPPO-F3", "oppo");
        GSM samsung = new GSM("SamSungX8", "samsung", 0, null, null, null);
//        System.out.println(samsung);

        GSM[] gsms = new GSM[4];
        gsms[0] = new GSM("IphoneX", "Apple");
        gsms[1] = new GSM("Redmi9A", "Xiaomi");
        gsms[2] = new GSM("GalaxyA32","Samsung");
        gsms[3] = new GSM("OppoA74","Oppo");
        for (GSM gsm : gsms) {
            System.out.println(gsm);
            ;
        }
        System.out.println(GSM.Iphone4S);
    }
}
