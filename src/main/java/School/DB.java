package School;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static Connection initial(){
        Connection myConn = null;
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "student";
        String pass = "student";
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection(url, user, pass);
//            System.out.println("Database connection successful!\n");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return myConn;
    }
}
