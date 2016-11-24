package com.expertzlab.javatraining.querytable;

import java.sql.*;

/**
 * Created by gireeshbabu on 24/11/16.
 */
public class InsertToTable {

    public static void main(String[] args) throws SQLException {

        InsertToTable table = new InsertToTable();
        Connection connection =  table.getConnection();
        PreparedStatement statement = table.createStatement(connection);
         table.executeStatement(statement);
        //System.out.println("Status of exec =" + status);

    }

    private Connection getConnection() throws SQLException {
        String userid = "root";
        String password = "";
        // Get a connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sample",
                userid, password);
        return  conn;
    }

    private PreparedStatement createStatement(Connection connection) throws SQLException {

        // Create a statement for executing SQL
        PreparedStatement stmt = connection.prepareStatement("insert into user_info values(?,?,?)");
        //PreparedStatement stmt = connection.prepareStatement("Update user_info set lastname = ? where firstname=?");
        return stmt;

    }

    private boolean executeStatement(PreparedStatement statement) throws SQLException {
        // Execute a query / SELECT statement
        statement.setString(1,"ram");
        statement.setString(2,"vijay");
        statement.setInt(3,25);
        boolean status = statement.execute();
        /*
        String[] names = {"Jacob", "Jordan", "Jeffery"};
        statement.setObject(1, names);
        statement.setString(2,"gireesh");
        statement.executeUpdate();
        */

        return status;
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
}
