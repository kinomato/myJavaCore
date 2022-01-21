package Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KittenTest {
    @Test
    void KittenConstructorEmpty(){
        Kitten c = new Kitten();
        assertNull(c.getName());
        assertNull(c.getSex());
        assertEquals(0,c.getAge());
    }
    @Test
    void KittenConstructorWithName(){
        Kitten c = new Kitten("kit");
        assertEquals("kit",c.getName());
        assertEquals(Gender.FEMALE,c.getSex());
        assertEquals(0,c.getAge());
    }
    @Test
    void KittenConstructorAllInput(){
        Kitten c = new Kitten("kit",1);
        assertEquals("kit",c.getName());
        assertEquals(Gender.FEMALE,c.getSex());
        assertEquals(1,c.getAge());
    }
    @Test
    void SetSexMaleShouldThrowException(){
        Kitten c = new Kitten();
        try{
            c.setSex(Gender.MALE);
            fail("set sex kitten to male should throw exception");
        } catch (Exception ignored){}
    }
    @Test
    void SetSexFemaleShouldWork(){
        Kitten c = new Kitten();
        try{
            c.setSex(Gender.FEMALE);
            assertEquals(Gender.FEMALE,c.getSex());
        } catch (Exception ignored){
            fail("set sex kitten to female should work");
        }
    }
    @Test
    void SetAgeExceedOneShouldThrowException(){
        Kitten c = new Kitten();
        try {
            c.setAge(2);
            fail("set age kitten exceed one should throw exception");
        } catch (Exception ignored){}
    }
    @Test
    void SetAgeOneShouldWork(){
        Kitten c = new Kitten();
        try {
            c.setAge(1);
            assertEquals(1,c.getAge());
        } catch (Exception e){
            fail("set age kitten to one should work");
        }
    }
}