package com.expertzlab.javatraining.querytable;

import java.sql.*;

/**
 * Created by gireeshbabu on 24/11/16.
 */
public class QueryTable {

    public static void main(String[] args) throws SQLException {

        QueryTable table = new QueryTable();
        Connection connection =  table.getConnection();
        Statement statement = table.createStatement(connection);
        ResultSet resultSet = table.executeStatement(statement);
        table.processRows(resultSet);

        statement.close();
        connection.close();

    }

    private Connection getConnection() throws SQLException {
        String userid = "root";
        String password = "";
        // Get a connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sample",
                userid, password);
        return  conn;
    }

    private Statement createStatement(Connection connection) throws SQLException {

        // Create a statement for executing SQL
        Statement stmt = connection.createStatement();
        /*
        JdbcRowSet rowSet = new JdbcRowSetImpl(connection);
        rowSet.setCommand("SELECT * FROM user_info");
        rowSet.execute();

        while (rowSet.next()){
            System.out.println(rowSet.getString(1));
            System.out.println(rowSet.getString(2));
        }
        */

        return stmt;

    }

    private ResultSet executeStatement(Statement statement) throws SQLException {
        // Execute a query / SELECT statement
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user_info");


        return resultSet;
    }

    private void processRows(ResultSet resultSet) throws SQLException {
        // Loop until all rows have been processed
        while (resultSet.next()) {
            // Loop until all columns in current row have been processed
            for (int i = 1; i <= 3; i++) {
                // Print out the current value
                System.out.print(resultSet.getObject(i));
                // Put a comma between each value
                if (i < 3) {
                    System.out.println(",");
                }
            }
            // Start the next row's values on a new line
            System.out.println("");
        }

    }

    private void processRows1(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            Array sqlArray = resultSet.getArray(2);
            ResultSet arraySet = sqlArray.getResultSet();
            while (arraySet.next()) {
                System.out.println(arraySet.getObject(2));
            }
        }
    }

}
