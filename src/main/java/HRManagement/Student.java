package HRManagement;

import java.util.Comparator;

public class Student extends Human {
    private int grade;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    public Student(String firstname, String lastName, int grade) {
        super(firstname, lastName);
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("grade must not be lower than 0 or greater than 100");
        } else {
            this.grade = grade;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("grade must not be lower than 0 or greater than 100");
        }
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                "} " + super.toString();
    }
}

class SortStudentsByGradeAsc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getGrade() - b.getGrade();
    }
}
