package HRManagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    @Test
    void WorkerConstructorTestDefaultValue(){
        Worker t = new Worker("Tran Tien", "Dat");
        assertEquals(0.0,t.getWeekSalary());
        assertEquals(0,t.getWorkHoursPerDay());
    }
    @Test
    void WorkerConstructorTestAllInput() {
        Worker t = new Worker("Tran Tien", "Dat",100.0,5);
        assertEquals(100.0,t.getWeekSalary());
        assertEquals(5,t.getWorkHoursPerDay());
        assertEquals("Tran Tien",t.getFirstName());
        assertEquals("Dat",t.getLastName());
    }

    @Test
    void MoneyPerHourWithZeroWorkHour() {
        Worker t = new Worker("Tran Tien", "Dat",100.0,0);
        assertEquals(0,t.moneyPerHour());
    }
    @Test
    void MoneyPerHourWithZeroSalary(){
        Worker t = new Worker("Tran Tien", "Dat",0.0,5);
        assertEquals(0,t.moneyPerHour());
    }
    @Test
    void SalaryBelowInConstructorShouldThrowException(){
        try {
            Worker t = new Worker("Tran Tien", "Dat",-333.0,5);
            fail("Constructor with invalid salary should throw exception");
        } catch (IllegalArgumentException ignored){}

    }
    @Test
    void HourBelowZeroInConstructorShouldThrowException(){
        try{
            Worker t = new Worker("Tran Tien", "Dat",333.0,-1);
            fail("Constructor with invalid salary should throw exception");
        } catch (IllegalArgumentException ignored){}
    }
    @Test
    void HourAbove24InConstructorShouldThrowException(){
        try{
            Worker t = new Worker("Tran Tien", "Dat",333.0,25);
            fail("Constructor with invalid salary should throw exception");
        } catch (IllegalArgumentException ignored){}
    }
    @Test
    void SetSalaryBelowZeroShouldThrowException(){
        Worker t = new Worker();
        try {
            t.setWeekSalary(-1099.0);
            fail("Set salary below zero should throw exception");
        } catch (IllegalArgumentException ignored){}
    }
    @Test
    void SetHourBelowZeroShouldThrowException(){
        Worker t = new Worker();
        try {
            t.setWorkHoursPerDay(-1);
            fail("Set hour below zero should throw exception");
        } catch (IllegalArgumentException ignored){}
    }
    @Test
    void SetHourAbove24ShouldThrowException(){
        Worker t = new Worker();
        try {
            t.setWorkHoursPerDay(25);
            fail("Set hour above 24 should throw exception");
        } catch (IllegalArgumentException ignored){}
    }

}