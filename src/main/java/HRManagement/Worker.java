package HRManagement;

import java.util.Comparator;

public class Worker extends Human {
    private Double weekSalary;
    private int workHoursPerDay;

    public Worker() {
        super();
    }

    public Worker(String firstName, String lastName) {
        this(firstName, lastName, 0.0, 0);
    }

    public Worker(String firstName, String lastName, Double weekSalary, int workHoursPerDay) {
        super(firstName, lastName);
        if (weekSalary < 0 || workHoursPerDay < 0 || workHoursPerDay > 24)
            throw new IllegalArgumentException("Invalid salary or hour");
        else {
            this.weekSalary = weekSalary;
            this.workHoursPerDay = workHoursPerDay;
        }

    }

    public Double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(Double weekSalary) {
        if(weekSalary < 0){
            throw new IllegalArgumentException("Salary should not be lower than 0");
        }
        this.weekSalary = weekSalary;
    }

    public int getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(int workHoursPerDay) {
        if(workHoursPerDay < 0 || workHoursPerDay > 24){
            throw new IllegalArgumentException("Invalid hour");
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    public double moneyPerHour() {
        if (this.weekSalary == 0 || this.workHoursPerDay == 0) {
            return 0.0;
        }
        // 5 x workHoursPerDay = total hours working
        // weekSalary = total hours working x money per hours
        // money per hours = weekSalary / total hours working
        return weekSalary / (5 * workHoursPerDay);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "weekSalary=" + weekSalary +
                ", workHoursPerDay=" + workHoursPerDay +
                ", moneyPerHour=" + moneyPerHour() +
                "} " + super.toString();
    }
}

class SortWorkerByMoneyDesc implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return (int) (o2.moneyPerHour() - o1.moneyPerHour());
    }
}