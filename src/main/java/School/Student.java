package School;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student {
    private static final Connection myCon = DB.initial();
    private static PreparedStatement myPs;
    private static final String className = " students ";

    public static void showAllStudents(){
        try{
            myPs = myCon.prepareStatement("select * from " + className);
            ResultSet myRs = myPs.executeQuery();
            while(myRs.next()){
                System.out.println(myRs.getInt("id") + ", "
                        + myRs.getString("name") + ", "
                        + myRs.getInt("grade"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void insertStudent(int classId, String studentName, int grade) {
        try {
            myPs = myCon.prepareStatement("insert into " + className + " (classId,name,grade) value (?,?,?)");
            myPs.setInt(1, classId);
            myPs.setString(2, studentName);
            myPs.setInt(3, grade);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateStudent(int id, int classId, String studentName, int grade) {
        try {
            myPs = myCon.prepareStatement("update " + className
                    + " set classId  = ?, name = '?', grade = ? "
                    + " where id = ?");
            myPs.setInt(1, classId);
            myPs.setString(2, studentName);
            myPs.setInt(3, grade);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(int id) {
        try {
            myPs = myCon.prepareStatement("delete from " + className + " where id = ?");
            myPs.setInt(1, id);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
