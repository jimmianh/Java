package session13;

import java.sql.*;

public class JdbcPreparedStatementTest {
    public static void main(String[] args) throws SQLException {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop",
                "root","");
            Statement stmt = conn.createStatement();

        PreparedStatement pstmt = conn.prepareStatement("insert into books values(?,?,?,?,?)");
        PreparedStatement pstmtSelect = conn.prepareStatement("select * from books");
        ){
            pstmt.setInt(1, 6008);
            pstmt.setString(2, "Ngọc Anh Quả Chanh");
            pstmt.setString(3, "DatSmoke");
            pstmt.setDouble(4,88.88);
            pstmt.setInt(5,88);
            int rowInserted = pstmt.executeUpdate();
            System.out.println(rowInserted+ "rows affected");

            pstmt.setInt(1,5004);
            pstmt.setString(2, "Mahjong");
            rowInserted = pstmt.executeUpdate();
            System.out.println(rowInserted+ "rows affected");

            ResultSet resultSet = pstmtSelect.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id")+ ","
                + resultSet.getString("author") + ","
                +resultSet.getString("title") + ","
                +resultSet.getDouble("price")+ ","
                +resultSet.getInt("qty"));
            }
        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
}
