import oracle.jdbc.OracleConnection;

import java.sql.*;

public class Main {

    public static Connection getConnect() {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//ondora04.hu.nl:8521/EDUC09", "stud1740016", "stud1740016");
            return conn;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;

    }

    public static void main(String[] args) throws SQLException {

        Statement stmt = getConnect().createStatement();

        String sql = "SELECT code, omschrijving FROM CURSUSSEN";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String code = rs.getString("code");
            String omschrijving = rs.getString("omschrijving");

            System.out.println(code);
            System.out.println(omschrijving);
    }
        rs.close();

}

}