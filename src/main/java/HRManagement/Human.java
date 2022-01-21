package HRManagement;

import java.util.Comparator;

public abstract class Human {
    private String firstName;
    private String lastName;


    public Human(){}

    public Human(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
class SortHumanByName implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        String s1 = o1.getFirstName();
        String s2 = o2.getFirstName();
        int sComp = s1.compareTo(s2);
        if(sComp != 0){
            return sComp;
        }
        String x1 = o1.getLastName();
        String x2 = o2.getLastName();
        return x1.compareTo(x2);
    }
}
