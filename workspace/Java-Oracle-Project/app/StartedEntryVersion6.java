package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class StartedEntryVersion6 {

   private static final String DB_IP = "192.168.127.165";
   private static final String DB_SID = "orcl";
   private static final String DB_USERNAME = "system";
   private static final String DB_PASSWORD = "oracle";

   /**
    * The main entry point
    *
    * @param args The arguments for the entry point
    */
   public static void main(String [] args) {
      String jdbcUrl = "jdbc:oracle:thin:@" + DB_IP + ":1521:" + DB_SID;
      int rowNum = 971 / 3;
      Connection connection = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         connection = DriverManager.getConnection(jdbcUrl, DB_USERNAME, DB_PASSWORD);
         System.out.println("Connected to Oracle database successfully.");

         String sql = "SELECT * FROM (SELECT t.* FROM SYSTEM.HELP t) WHERE ROWNUM <= ?";
         pstmt = connection.prepareStatement(sql);

         for (int i = 1; i <= 3; i++) {
            pstmt.setInt(1, rowNum * i);

            rs = pstmt.executeQuery();
            while (rs.next()) {
               System.out.println("Topic: " + rs.getString("topic") + ", Sequence: " + rs.getInt("seq") + ", Info: " + rs.getString("info"));
            }
            rs.close();
         }
      } catch (ClassNotFoundException e) {
         System.err.println("Oracle JDBC Driver not found. Include it in your library path.");
         e.printStackTrace();
      } catch (SQLException e) {
         System.err.println("Database connection error: " + e.getMessage());
         e.printStackTrace();
      } finally {
         try {
            if (rs != null) {
               rs.close();
            }
            if (pstmt != null) {
               pstmt.close();
            }
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }
}