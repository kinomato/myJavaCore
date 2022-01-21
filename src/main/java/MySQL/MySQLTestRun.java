package MySQL;

import java.sql.*;

public class MySQLTestRun {
    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

//        String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "student";
        String pass = "student";
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection(url, user, pass);

            System.out.println("Database connection successful!\n");

            // 2. Create a statement
            myStmt = myConn.createStatement();


            // 3. Execute SQL query
            int rowAffected = myStmt.executeUpdate(
                    "insert into employees" +
                            "(last_name,first_name,email,department,salary)" +
                            "value" +
                            "('Wright','Eric','ericwright@foo.com','HR',33000.00)"
            );
            myRs = myStmt.executeQuery("select * from employees");


            // 4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myRs != null) {
                myRs.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
    }
}
