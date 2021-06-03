//package session14;
//
//import java.sql.*;
//
//public class MainDrink {
//    public static void main(String[] args) {
//        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/drink",
//                "root","");
//            Statement stmt = conn.createStatement();
//
//            PreparedStatement pstmt = conn.prepareStatement("insert into drink values(?,?,?,?,?)");
//            PreparedStatement pstmtSelect = conn.prepareStatement("select * from drink");
//        ){
//            pstmt.setInt(1, 6);
//            pstmt.setString(2, "Nước chanh");
//            pstmt.setString(3, "Việt Nam");
//            pstmt.setDouble(4,8888);
//            int rowInserted = pstmt.executeUpdate();
//            System.out.println(rowInserted+ "rows affected");
//
//            pstmt.setInt(1,7);
//            pstmt.setString(2, "Dưa hấu Đỏ");
//            pstmt.setString(3, "Việt Nam");
//            pstmt.setDouble(4,8888);
//            rowInserted = pstmt.executeUpdate();
//            System.out.println(rowInserted+ "rows affected");
//
//            ResultSet resultSet = pstmtSelect.executeQuery();
//            while(resultSet.next()){
//                System.out.println(resultSet.getInt("id")+ ","
//                        + resultSet.getString("Name") + ","
//                        +resultSet.getString("Xuất xứ") + ","
//                        +resultSet.getDouble("giá"));
//            }
//
//            String sqlUpdate = "UPDATE user SET password='123456' WHERE id=1";
//            numberRowsAffected = st.executeUpdate(sqlUpdate);
//            System.out.println("Affected rows after updated: " + numberRowsAffected);
//
//        }catch (SQLException exception){
//            exception.printStackTrace();
//        }
//    }
//}
