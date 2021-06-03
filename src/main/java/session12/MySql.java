package session12;

import java.sql.*;

public class MySql {
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

            ResultSet rset = stmt.executeQuery("select id, qty from books where id in (1001, 1002)");
            System.out.println("-- Before UPDATE --");
            while(rset.next()) {
                System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
            }

            con.commit(); //commit select


            stmt.executeUpdate("update books set qty = qty + 1 where id = 1001");
            stmt.executeUpdate("update books set qty = qty + 1 where id = 1002");
            con.rollback(); //discard all changes since the last commit


            rset = stmt.executeQuery("select id, qty from books where id in (1001, 1002)");
            System.out.println("-- After UPDATE and Commit --");
            while(rset.next()) {
                System.out.println(rset.getInt("id") + ", " + rset.getInt("qty"));
            }
            con.commit(); //Commit select

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
