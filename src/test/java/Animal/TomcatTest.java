package Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TomcatTest {
    @Test
    void TomcatConstructorEmpty(){
        Tomcat c = new Tomcat();
        assertNull(c.getName());
        assertNull(c.getSex());
        assertEquals(0,c.getAge());
    }
    @Test
    void TomcatConstructorWithName(){
        Tomcat c = new Tomcat("Tom");
        assertEquals("Tom",c.getName());
        assertEquals(Gender.MALE,c.getSex());
        assertEquals(0,c.getAge());
    }
    @Test
    void TomcatConstructorAllInput(){
        Tomcat c = new Tomcat("Tom",13);
        assertEquals("Tom",c.getName());
        assertEquals(Gender.MALE,c.getSex());
        assertEquals(13,c.getAge());
    }
    @Test
    void TomcatConstructorAgeShouldNotBeLowerThanZero(){
        try {
            Tomcat c = new Tomcat("Tom",-1);
            fail("A Tomcat with age lower than 0 should throw exception");
        } catch (Exception ignored){}
    }
    @Test
    void TomcatAgeShouldNotBeLowerThanZero(){
        Tomcat c = new Tomcat();
        try {
            c.setAge(-1);
            fail("Tomcat age be lower than 0 should throw exception");
        } catch (Exception ignored){}
    }
    @Test
    void TomcatAgeShouldNotExceed50(){
        Tomcat c = new Tomcat();
        try {
            c.setAge(51);
            fail("Tomcat age should not be greater than 50");
        } catch (Exception ignored){}
    }
    @Test
    void SetAgeWithValidArgShouldWork(){
        Tomcat c = new Tomcat();
        try {
            c.setAge(50);
            assertEquals(50,c.getAge());
        } catch (Exception ignored){
            fail("Set age with valid arg should work");
        }
    }
    @Test
    void TomcatMustHasMaleGenderOnly(){
        Tomcat k = new Tomcat("Tom",5);
        assertEquals(Gender.MALE,k.getSex());
    }
}