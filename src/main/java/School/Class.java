package School;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Class {
    private static final Connection myCon = DB.initial();
    private static PreparedStatement myPs;
    private static final String className = " classes ";

    public static void showAllClasses(){
        try{
            myPs = myCon.prepareStatement("select * from " + className);
            ResultSet myRs = myPs.executeQuery();
            while(myRs.next()){
                System.out.println(myRs.getInt("id") + ", "
                        + myRs.getString("name"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void insertClass(String name) {
        try {
            myPs = myCon.prepareStatement("insert into " + className + " (name) value (?)");
            myPs.setString(1, name);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateClass(int id, String name) {
        try {
            myPs = myCon.prepareStatement("update " + className + " set name  = '?' where id = ?");
            myPs.setString(1, name);
            myPs.setInt(2, id);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteClass(int id) {
        try {
            myPs = myCon.prepareStatement("delete from " + className + " where id = ?");
            myPs.setInt(1, id);
            myPs.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
