import java.sql.*;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            System.out.println("🔌 Loading MySQL Driver...");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ Driver loaded!");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library_db",  // change to your DB
                "root",                             // your MySQL username
                "2003"                     // your password
            );

            System.out.println("✅ MySQL Connection Successful!");
        } catch (Exception e) {
            System.out.println("❌ Error in DBConnection:");
            e.printStackTrace();  // this will print the real issue
            return null;
        }
        return con;
    }
}



