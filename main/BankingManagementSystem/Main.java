package BankingManagementSystem;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/banking_system"; 
        String user = "root";
        String password = "0000";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected successfully!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SHOW DATABASES");

            while (rs.next()) {
                System.out.println("Database: " + rs.getString(1));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
