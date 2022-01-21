package Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogTest {
    @Test
    void FrogConstructorEmpty(){
        Frog c = new Frog();
        assertNull(c.getName());
        assertNull(c.getSex());
        assertEquals(0,c.getAge());
    }
    @Test
    void FrogConstructorWithName(){
        Frog c = new Frog("frog");
        assertEquals("frog",c.getName());
        assertNull(c.getSex());
        assertEquals(0,c.getAge());
    }
    @Test
    void FrogConstructorAllInput(){
        Frog c = new Frog("frog",Gender.MALE,10);
        assertEquals("frog",c.getName());
        assertEquals(Gender.MALE,c.getSex());
        assertEquals(10,c.getAge());
    }
    @Test
    void FrogConstructorAgeShouldNotBeLowerThanZero(){
        try {
            Frog c = new Frog("frog",Gender.MALE,-1);
            fail("A Frog with age lower than 0 should throw exception");
        } catch (Exception ignored){}
    }
    @Test
    void FrogAgeShouldNotBeLowerThanZero(){
        Frog c = new Frog("frog",Gender.MALE);
        try {
            c.setAge(-1);
            fail("Frog age be lower than 0 should throw exception");
        } catch (Exception ignored){}
    }

}