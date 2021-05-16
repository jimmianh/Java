package session13;

import java.sql.*;

public class Comit {
        public static void main(String[] args) throws SQLException {
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop",
                        "root","");
                Statement stmt = con.createStatement();

                String strSelect = "select title, price, qty from books";
                System.out.println("the SQL statement is:" +strSelect +"\n");

                // Step 3 & 4: Execute queries and process the query results
                // Disable auto-commit for the connection, which commits every SQL statement.
                con.setAutoCommit(false);
                // Before Changes
                ResultSet resultSet = stmt.executeQuery("select * from books");
                ResultSetMetaData resultSetMetaData =resultSet.getMetaData();
                int numColumns = resultSetMetaData.getColumnCount();
                for (int i = 1; i <= numColumns ; i++) {
                    System.out.printf("%-30s",resultSetMetaData.getColumnName(i));
                }
                System.out.println();
                for (int i = 1; i <= numColumns; i++) {
                    System.out.printf("%-30s","(" + resultSetMetaData.getColumnClassName(i)+ ")");
                }
                System.out.println();

                while(resultSet.next()){
                    for (int i = 1; i <= numColumns ; i++) {
                        System.out.printf("%-30s", resultSet.getString(i));
                    }
                    System.out.println();
                }
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

