package School;

import java.sql.*;

public class SchoolMySql {
    public static void main(String[] args) throws SQLException {

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

//        String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "student";
        String pass = "student";
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection(url, user, pass);

            System.out.println("Database connection successful!\n");

            // 2. Create a statement
            myStmt = myConn.createStatement();


            // 3. Execute SQL query

//            myStmt.executeUpdate(
//                    "insert into classes" +
//                            "(name)" +
//                            "value" +
//                            "('9A1')"
//            );
//            myStmt.executeUpdate(
//                    "insert into classes" +
//                            "(name)" +
//                            "value" +
//                            "('9A2')"
//            );
//            myStmt.executeUpdate(
//                    "insert into classes" +
//                            "(name)" +
//                            "value" +
//                            "('9A3')"
//            );
//            myStmt.executeUpdate(
//                    "insert into students" +
//                            "(classId,grade,name)" +
//                            "value" +
//                            "(1,50,'Nguyen Van A')"
//            );
//            myStmt.executeUpdate(
//                    "insert into students" +
//                            "(classId,grade,name)" +
//                            "value" +
//                            "(1,56,'Nguyen Van B')"
//            );
//            myStmt.executeUpdate(
//                    "insert into students" +
//                            "(classId,grade,name)" +
//                            "value" +
//                            "(1,58,'Nguyen Van C')"
//            );
//            myStmt.executeUpdate(
//                    "insert into students" +
//                            "(classId,grade,name)" +
//                            "value" +
//                            "(2,60,'Tran Van A')"
//            );
//            myStmt.executeUpdate(
//                    "insert into students" +
//                            "(classId,grade,name)" +
//                            "value" +
//                            "(2,66,'Tran Van B')"
//            );
//            myStmt.executeUpdate(
//                    "insert into students" +
//                            "(classId,grade,name)" +
//                            "value" +
//                            "(2,68,'Tran Van C')"
//            );
//            myStmt.executeUpdate(
//                    "insert into students" +
//                            "(classId,grade,name)" +
//                            "value" +
//                            "(3,78,'Pham Van A')"
//            );
//            myStmt.executeUpdate(
//                    "insert into students" +
//                            "(classId,grade,name)" +
//                            "value" +
//                            "(3,76,'Pham Van B')"
//            );
//            myStmt.executeUpdate(
//                    "insert into students" +
//                            "(classId,grade,name)" +
//                            "value" +
//                            "(3,78,'Pham Van C')"
//            );
//            myStmt.executeUpdate(
//                    "insert into teachers" +
//                            "(classId,name,salary)" +
//                            "value" +
//                            "(1,'Bui Thi Thanh',8000)"
//            );
//            myStmt.executeUpdate(
//                    "insert into teachers" +
//                            "(classId,name,salary)" +
//                            "value" +
//                            "(2,'Lam Van Diem',9000)"
//            );
//            myStmt.executeUpdate(
//                    "insert into teachers" +
//                            "(classId,name,salary)" +
//                            "value" +
//                            "(3,'Nguyen Thi Duyen',2000)"
//            );
//            myStmt.executeUpdate(
//                    "insert into disciplines" +
//                            "(numOfExs,numOfLecs,teacherId)" +
//                            "value" +
//                            "(5,5,1)"
//            );
//            myStmt.executeUpdate(
//                    "insert into disciplines" +
//                            "(numOfExs,numOfLecs,teacherId)" +
//                            "value" +
//                            "(6,6,2)"
//            );
//            myStmt.executeUpdate(
//                    "insert into disciplines" +
//                            "(numOfExs,numOfLecs,teacherId)" +
//                            "value" +
//                            "(6,6,3)"
//            );
//            int rowAffected = myStmt.executeUpdate(
//                    "insert into employees" +
//                            "(last_name,first_name,email,department,salary)" +
//                            "value" +
//                            "('Wright','Eric','ericwright@foo.com','HR',33000.00)"
//            );
            myRs = myStmt.executeQuery("select * from classes");


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
