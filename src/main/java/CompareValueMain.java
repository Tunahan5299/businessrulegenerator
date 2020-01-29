import java.sql.*;

public class CompareValueMain {
    public static void main(String[] args) throws SQLException {
        Connection connapex = DriverManager.getConnection("jdbc:oracle:thin:@//ondora04.hu.nl:8521/educ09", "stud1740016", "stud1740016");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "TUNAHAN", "admin");

        //Insert van ene database naar de ander
        String sql = "INSERT INTO Compare_Values(" + "ID," + "Value1" + "Value2" + "Rule_ID)" + "VALUES(?,?,?,?)";

        Statement statement = connapex.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        PreparedStatement pstmt = conn.prepareStatement(sql);

        ResultSet rs = statement.executeQuery("SELECT * FROM Compare_Value WHERE ID = ");


        while (rs.next()) {
            int id = rs.getInt(1);
            int value1 = rs.getInt(2);
            int value2 = rs.getInt(3);
            int ruleid = rs.getInt(4);
            pstmt.setInt(1, id);
            pstmt.setInt(2, value1);
            pstmt.setInt(2, value2);
            pstmt.setInt(2, ruleid);
            pstmt.executeUpdate();

        }
    }
}