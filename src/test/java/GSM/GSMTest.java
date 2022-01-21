package GSM;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.time.LocalDateTime;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
//import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(GSM.class)
class GSMTest {
//    @Test
//    void GSMConstructorTestWithoutInput()  {
//        try {
//            GSM obj = new GSM();
//
//            fail("An exception should be thrown!");
//
//        } catch (Exception ignored) {
//        }
//
//    }

    @Test
    void GSMConstructorTestMandatoryInput() {
        GSM g = new GSM("oppof3","oppo");
        assertEquals("oppof3",g.getModel());
        assertEquals("oppo",g.getManufacturer());
        assertEquals(0,g.getPrice());
        assertNull(g.getOwner());
        assertNull(g.getBattery());
        assertNull(g.getDisplay());
    }
    @Test
    void GSMConstructorTestAllInput() {
        GSM g = new GSM("oppof3","oppo",20.5,"dat",new Battery(),new Display());
        assertEquals("oppof3",g.getModel());
        assertEquals("oppo",g.getManufacturer());
        assertEquals(20.5,g.getPrice());
        assertEquals("dat",g.getOwner());
        assertNotNull(g.getBattery());
        assertNotNull(g.getDisplay());

    }

    @org.junit.jupiter.api.Test
    void AddCallToCallHistory() {
        String[] numbers = {"12334656","345345456","345345456","45657658"};
        GSM mockGSM = new GSM("oppof3","oppo");
        for(String num:numbers){
            mockGSM.call(num);
        }
        assertEquals(4,mockGSM.getCallHistory().size());

    }
    @Test
    void calculatePriceWithNoCall(){
        GSM mockGSM = new GSM("oppof3","oppo");
        assertEquals(0,mockGSM.calculatePrice(0.37));
    }
    @org.junit.jupiter.api.Test
    void calculatePriceMultipleCall() {
        GSM mockGSM = new GSM("oppof3","oppo");
        Call call = new Call("123456678", LocalDateTime.now(),60);
        Call call1 = new Call("123456678", LocalDateTime.now(),120);
        Call call2 = new Call("123456678", LocalDateTime.now(),240);
        Call call3 = new Call("123456678", LocalDateTime.now(),360);
        mockGSM.addCall(call);
        mockGSM.addCall(call1);
        mockGSM.addCall(call2);
        mockGSM.addCall(call3);
        assertEquals(4.81,mockGSM.calculatePrice(0.37)); // 0.37 0.74 1.48 2.22
    }

    @org.junit.jupiter.api.Test
    void clearCallHistory() {
        String[] numbers = {"12334656","345345456","345345456","45657658"};
        GSM mockGSM = new GSM("oppof3","oppo");
        for(String num:numbers){
            mockGSM.call(num);
        }
        mockGSM.clearCallHistory();
        assertEquals(0,mockGSM.getCallHistory().size());
    }

    @org.junit.jupiter.api.Test
    void removeLongestCall() {
        GSM mockGSM = new GSM("oppof3","oppo");
        Call call = new Call("123456678", LocalDateTime.now(),60);
        Call call1 = new Call("123456678", LocalDateTime.now(),120);
        Call call2 = new Call("123456678", LocalDateTime.now(),240);
        Call call3 = new Call("123456678", LocalDateTime.now(),360);
        mockGSM.addCall(call);
        mockGSM.addCall(call1);
        mockGSM.addCall(call2);
        mockGSM.addCall(call3);
        Call temp = mockGSM.removeLongestCall();
        assertEquals(temp.getDuration().getSeconds(),call3.getDuration().getSeconds()); // 0.37 0.74 1.48 2.22
    }
}