package com.expertzlab.javatraining.querytable;

import java.sql.*;

/**
 * Created by gireeshbabu on 24/11/16.
 *
 * mysql> delimiter //

 mysql> CREATE PROCEDURE listuser (OUT param1 INT)
 -> BEGIN
 ->   SELECT COUNT(*) INTO param1 FROM user_info;
 -> END//
 Query OK, 0 rows affected (0.00 sec)

 mysql> delimiter ;

 mysql> CALL simpleproc(@a);
 Query OK, 0 rows affected (0.00 sec)

 mysql> SELECT @a;
 */
public class CallableStatements {

    public static void main(String[] args) throws SQLException {

        CallableStatements table = new CallableStatements();
        Connection connection =  table.getConnection();
        CallableStatement statement = table.createStatement(connection);
        table.executeStatement(statement);

    }

    private Connection getConnection() throws SQLException {
        String userid = "root";
        String password = "";
        // Get a connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sample",
                userid, password);
        return  conn;
    }

    private CallableStatement createStatement(Connection connection) throws SQLException {

        String procedureCall = "{ call listuser(?)}";
        CallableStatement cstmt = connection.prepareCall(procedureCall);
        cstmt.registerOutParameter(1,Types.NUMERIC);
        return cstmt;

    }

    private void executeStatement(CallableStatement statement) throws SQLException {


        statement.execute();
        int str = statement.getInt(1);
        System.out.println("Result "+ str);

    }

}
