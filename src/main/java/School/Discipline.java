package School;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Discipline {
    private static final Connection myCon = DB.initial();
    private static PreparedStatement myPs;
    private static final String className = " disciplines ";

    public static void showAllDisciplines() {
        try {
            myPs = myCon.prepareStatement("select * from " + className);
            ResultSet myRs = myPs.executeQuery();
            while (myRs.next()) {
                System.out.println(myRs.getInt("id") + ", "
                        + myRs.getInt("teacherId") + ", "
                        + myRs.getInt("numOfLecs") + ", "
                        + myRs.getInt("numOfExs")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertDiscipline(int teacherId, int numOfLectures, int numOfExercises) {
        try {
            myPs = myCon.prepareStatement("insert into" + className
                    + "(numOfLecs,numOfExs,teacherId)"
                    + " value (?,?,?)");
            myPs.setInt(1, numOfExercises);
            myPs.setInt(2, numOfLectures);
            myPs.setInt(3, teacherId);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateDiscipline(int teacherId, int numOfLectures, int numOfExercises) {
        try {
            myPs = myCon.prepareStatement("update" + className
                    + "set numOfLecs = ?,numOfExs= ?,teacherId= ?"
                    + "where id = ?");
            myPs.setInt(1, numOfExercises);
            myPs.setInt(2, numOfLectures);
            myPs.setInt(3, teacherId);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteDiscipline(int id) {
        try {
            myPs = myCon.prepareStatement("delete from" + className + "where id = ?");
            myPs.setInt(1, id);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
