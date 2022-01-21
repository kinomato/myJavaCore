package School;

public class App {
    public static void main (String[] args){
//        Class.insertClass("10A1");
//        Class.insertClass("10A2");
//        Class.insertClass("10A3");
//        Student.insertStudent(1,"Nguyen Van F",50);
//        Student.insertStudent(2,"Nguyen Van T",60);
//        Student.insertStudent(3,"Nguyen Van G",70);
//        Teacher.insertTeacher(1,"Bui Thi Thanh",4000.0);
//        Teacher.insertTeacher(2,"Lam Van Diem",8000.0);
//        Teacher.insertTeacher(3,"Nguyen Thi Duyen",7000.0);
//        Discipline.insertDiscipline(1,3,4);
//        Discipline.insertDiscipline(2,7,3);
//        Discipline.insertDiscipline(3,7,3);



        System.out.println("********Class******");
        Class.showAllClasses();
        System.out.println("********Student******");
        Student.showAllStudents();
        System.out.println("********Teacher******");
        Teacher.showAllTeachers();
        System.out.println("********Discipline******");
        Discipline.showAllDisciplines();
    }
}
