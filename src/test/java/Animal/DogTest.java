package Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    void DogConstructorEmpty(){
        Dog c = new Dog();
        assertNull(c.getName());
        assertNull(c.getSex());
        assertEquals(0,c.getAge());
    }
    @Test
    void DogConstructorWithName(){
        Dog c = new Dog("kiki");
        assertEquals("kiki",c.getName());
        assertNull(c.getSex());
        assertEquals(0,c.getAge());
    }
    @Test
    void DogConstructorAllInput(){
        Dog c = new Dog("kiki",Gender.MALE,10);
        assertEquals("kiki",c.getName());
        assertEquals(Gender.MALE,c.getSex());
        assertEquals(10,c.getAge());
    }
    @Test
    void DogConstructorAgeShouldNotBeLowerThanZero(){
        try {
            Dog c = new Dog("kiki",Gender.MALE,-1);
            fail("A Dog with age lower than 0 should throw exception");
        } catch (Exception ignored){}
    }
    @Test
    void DogAgeShouldNotBeLowerThanZero(){
        Dog c = new Dog("miu",Gender.MALE);
        try {
            c.setAge(-1);
            fail("Dog age be lower than 0 should throw exception");
        } catch (Exception ignored){}
    }
    @Test
    void DogAgeShouldNotExceed50(){
        Dog c = new Dog("kiki",Gender.MALE);
        try {
            c.setAge(51);
            fail("Dog age should not be greater than 50");
        } catch (Exception ignored){}
    }

}