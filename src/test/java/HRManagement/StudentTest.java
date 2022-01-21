package HRManagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void StudentConstructorTestDefaultGrade() {
        Student t = new Student("Tran Tien", "Dat");
        assertEquals(0, t.getGrade());
    }

    @Test
    void StudentConstructorTestAllInput() {
        Student t = new Student("Tran Tien", "Dat", 40);
        assertEquals("Tran Tien", t.getFirstName());
        assertEquals("Dat", t.getLastName());
        assertEquals(40, t.getGrade());
    }

    @Test
    void GradeBelowZeroInConstructorShouldThrowException() {
        try {
            Student t = new Student("Tran Tien", "Dat", -1);
            fail("Constructor with invalid grade should throw exception");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    void SetGradeBelowZeroShouldThrowException() {
        Student t = new Student();
        try {
            t.setGrade(-1);
            fail("Set grade below zero should throw exception");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    void SetGradeAbove100ShouldThrowException() {
        Student t = new Student();
        try {
            t.setGrade(101);
            fail("Set grade above 100 should throw exception");
        } catch (IllegalArgumentException ignored) {
        }
    }
}