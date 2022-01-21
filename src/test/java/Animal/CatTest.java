package Animal;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    @Test
    void CatConstructorEmpty(){
        Cat c = new Cat();
        assertNull(c.getName());
        assertNull(c.getSex());
        assertEquals(0,c.getAge());
    }
    @Test
    void CatConstructorWithName(){
        Cat c = new Cat("miumiu");
        assertEquals("miumiu",c.getName());
        assertNull(c.getSex());
        assertEquals(0,c.getAge());
    }
    @Test
    void CatConstructorAllInput(){
        Cat c = new Cat("miumiu",Gender.MALE,6);
        assertEquals("miumiu",c.getName());
        assertEquals(Gender.MALE,c.getSex());
        assertEquals(6,c.getAge());
    }
    @Test
    void CatConstructorAgeShouldNotBeLowerThanZero(){
        try {
            Cat c = new Cat("miumiu",Gender.MALE,-1);
            fail("A Cat with age lower than 0 should throw exception");
        } catch (Exception ignored){}
    }
    @Test
    void CatAgeShouldNotBeLowerThanZero(){
        Cat c = new Cat("miu",Gender.MALE);
        try {
            c.setAge(-1);
            fail("Cat age be lower than 0 should throw exception");
        } catch (Exception ignored){}
    }
    @Test
    void CatAgeShouldNotExceed50(){
        Cat c = new Cat("miu",Gender.MALE);
        try {
            c.setAge(51);
            fail("Cat age should not be greater than 50");
        } catch (Exception ignored){}
    }
}