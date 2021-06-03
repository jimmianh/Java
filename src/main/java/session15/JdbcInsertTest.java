//package session15;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//public class JdbcInsertTest {
//    public static void main(String[] args) {
//        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop",
//                "root","");
//            Statement stmt = conn.createStatement();
//        {
//            String sqlDelete="from book where id >=3000 and it <= 40000";
//            System.out.println("the Sql statement is:" + sqlDelete + "\n" );
//            int countDelete = stmt.executeUpdate(sqlDelete);
//            System.out.println(countDelete +" records inserted.\n");
//
//            String sqlInsert = "insert into books values(3001,'Gone Fishing','kumar',11.11,11)";
//            System.out.println("the Sql statement is:" + sqlInsert+"\n");
//            int countInserted = stmt.executeUpdate(sqlInsert);
//            System.out.println(countInserted + "records inserted \n");
//
//            sqlInsert="insert into books values " +"(3002,'Gone Fishing 2','Kunar',22.22,22),"
//        }
//}
