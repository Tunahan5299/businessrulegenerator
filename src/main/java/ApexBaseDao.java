import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ApexBaseDao {
    private static final String DB_URL = "jdbc:oracle:thin:@//ondora04.hu.nl:8521/educ09";
    private static final String DB_USER = "stud1740016";
    private static final String DB_PASS = "stud1740016";
    protected static Connection connapex;

    public ApexBaseDao() throws SQLException {
        connapex = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    protected static Connection getConnection() {
        return connapex;
    }

    public static void closeConnection() throws SQLException {
        if (connapex != null) {
            connapex.close();
        }
    }

    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
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
