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

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("the records selected are :");
            int rowCount = 0;

            while (rset.next()){
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title+ ", " + price+", "+qty);
                ++rowCount;
            }
            System.out.println("Total number of record = " + rowCount);

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
