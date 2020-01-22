package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleBaseDao {
    private static final String DB_URL = "jdbc:oracle:thin:@//ondora04.hu.nl:8521/educ09";
    private static final String DB_USER = "stud1741106";
    private static final String DB_PASS = "stud1741106";
    protected static Connection conn;

    public OracleBaseDao() throws SQLException {
        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    protected static Connection getConnection() {
        return conn;
    }

    public static void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    System.out.println("gelukt");
                    conn.close();
                } catch (SQLException e) {
                    // ignore
                }
            }
        }
    }
}
