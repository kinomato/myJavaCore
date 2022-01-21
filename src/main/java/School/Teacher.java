package School;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Teacher {
    private static final Connection myCon = DB.initial();
    private static PreparedStatement myPs;
    private static final String className = " teachers ";

    public static void showAllTeachers(){
        try{
            myPs = myCon.prepareStatement("select * from " + className);
            ResultSet myRs = myPs.executeQuery();
            while(myRs.next()){
                System.out.println(myRs.getInt("id") + ", "
                        + myRs.getString("name") + ", "
                        + myRs.getDouble("salary"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void insertTeacher(int classId, String name, double salary){
        try {
            myPs = myCon.prepareStatement("insert into" + className + "(classId,name,salary) value (?,?,?)");
            myPs.setInt(1, classId);
            myPs.setString(2, name);
            myPs.setDouble(3, salary);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateTeacher(int id, int classId, String name, double salary) {
        try {
            myPs = myCon.prepareStatement("update" + className
                    + "set classId = ?,name = '?',salary = ?"
                    + "where id = ?");
            myPs.setInt(1, classId);
            myPs.setString(2, name);
            myPs.setDouble(3, salary);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteTeacher(int id) {
        try {
            myPs = myCon.prepareStatement("delete from" + className + "where id = ?");
            myPs.setInt(1, id);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
