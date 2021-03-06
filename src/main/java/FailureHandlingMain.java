import java.sql.*;

public class FailureHandlingMain {
    public static void main(String[] args) throws SQLException {
        Connection connapex = DriverManager.getConnection("jdbc:oracle:thin:@//ondora04.hu.nl:8521/educ09", "stud1740016", "stud1740016");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "TUNAHAN", "admin");

        //Insert van ene database naar de ander
        String sql = "INSERT INTO Failure_Handling(" + "ID," + "Message)" + "VALUES(?,?)";

        Statement statement = connapex.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        PreparedStatement pstmt = conn.prepareStatement(sql);

        ResultSet rs = statement.executeQuery("SELECT * FROM Failure_Handling WHERE ID = ");


        while (rs.next()) {
            int id = rs.getInt(1);
            String message = rs.getString(2);
            pstmt.setInt(1, id);
            pstmt.setString(2, message);
            pstmt.executeUpdate();

        }
    }
}
