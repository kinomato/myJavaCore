package HRManagement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    private static void test() {
        Student defaultStudent = new Student();
        System.out.println(defaultStudent);
        Worker defaultWorker = new Worker();
        System.out.println(defaultWorker);

        Student student = new Student("Tran", "Tien Dat");
        Student student1 = new Student("Thai", "Kim Tin", 50);

        System.out.println(student);
        System.out.println(student1);

        Worker worker = new Worker("Nguyen", "Boi ky");
        Worker worker1 = new Worker("Dang", "Hoang Khang", 126.0, 7);

        System.out.println(worker);
        System.out.println(worker1);
        System.out.printf("money per hours: %.2f$\n", worker.moneyPerHour());
        System.out.printf("money per hours: %.2f$\n", worker1.moneyPerHour());
    }

    public static void main(String[] args) {
        /*
            initialize 10 Students
         */
        Student[] students = new Student[10];
        ArrayList<Student> lstStudent = new ArrayList<>();
        int grade;
        for (int i = 0; i < students.length; i++) {
            grade = (int) (Math.random() * 100);
            students[i] = new Student("student", "" + i, grade);
            lstStudent.add(students[i]);
        }
        /*
         * sort Student by grade ascending
         */
//        lstStudent.sort(new SortStudentsByGradeAsc());
        lstStudent.sort((o1, o2) -> o1.getGrade() - o2.getGrade());
        for (Student student : lstStudent) {
            System.out.println(student);
        }

        /*
            initialize 10 worker
         */
        Worker[] workers = new Worker[10];
        ArrayList<Worker> lstWorker = new ArrayList<>();
        double weekSalary;
        int hourPerDay;
        for (int i = 0; i < students.length; i++) {
            weekSalary = Math.random() * 1000;
            hourPerDay = ThreadLocalRandom.current().nextInt(1, 15 + 1);
            workers[i] = new Worker("worker", "" + i, weekSalary, hourPerDay);
            lstWorker.add(workers[i]);
        }

        /*
            sort workers by moneyPerHour
         */
        lstWorker.sort((o1, o2) -> (int) (o2.moneyPerHour() - o1.moneyPerHour()));
        /*
            print workers
         */
        for (Worker worker : lstWorker) {
            System.out.println(worker);
        }

        /*
            merge student list and worker list into one big human list
         */
        ArrayList<Human> lstHuman = new ArrayList<>();
        lstHuman.addAll(lstStudent);
        lstHuman.addAll(lstWorker);
        /*
            sort Student and Worker by firstName and then lastName
         */
//        lstHuman.sort(new SortHumanByName());
        lstHuman.sort((o1, o2) -> {
            String s1 = o1.getFirstName();
            String s2 = o2.getFirstName();
            int sComp = s1.compareTo(s2);
            if (sComp != 0) {
                return sComp;
            }
            String x1 = o1.getLastName();
            String x2 = o2.getLastName();
            return x1.compareTo(x2);
        });
        /*
            print students and workers
         */
        for (Object human : lstHuman) {
            System.out.println(human);
        }
//        ArrayList<List> lstHuman = Stream.concat(lstStudent.stream(), lstWorker.stream()).collect(Collectors.toList());
    }
}
