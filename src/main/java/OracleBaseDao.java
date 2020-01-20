import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleBaseDao {
//    private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@//ondora04.hu.nl:8521/EDUC09";
    private static final String DB_USER = "stud1740016";
    private static final String DB_PASS = "stud1740016";
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
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    System.out.println("gelukt");
                    conn.close();
                } catch (SQLException e) {
                    // ignore
                    System.out.println(e);
                }
            }
        }
    }


}
