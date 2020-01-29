import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BusinessRuleMain {
    //Business rule van ene database naar andere database overzetten
    public static void main(String[] args) throws SQLException {
//        BusinessRuleOracleDaoImpl brdao = new BusinessRuleOracleDaoImpl();
//        BusinessRule br1 = new BusinessRule("Rule2", "rule", "Vdsgdsfd", "fout", 0);
//        brdao.save(br1);
//        BusinessRuleApexDaoImpl bradao = new BusinessRuleApexDaoImpl();
//        printAllBusinessRules(bradao);
        Connection connapex = DriverManager.getConnection("jdbc:oracle:thin:@//ondora04.hu.nl:8521/educ09", "stud1740016", "stud1740016");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xepdb1", "TUNAHAN", "admin");

        //Insert van ene database naar de ander
        String sql = "INSERT INTO Rule(" + "ID," + "Name," + "Tabel," + "Attribute," + "BusinessType_ID," + "FailureHandling_ID," + "ValidationExecution_ID," + "Operator_ID)" + "VALUES(?,?,?,?,?,?,?,?)";

        Statement statement = connapex.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        PreparedStatement pstmt = conn.prepareStatement(sql);

        ResultSet rs = statement.executeQuery("SELECT * FROM Rule WHERE ID = 3");


        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String tabel = rs.getString(3);
            String attribute = rs.getString(4);
            int businesstypeid = rs.getInt(5);
            int failurehandlingid = rs.getInt(6);
            int validationexecutionid = rs.getInt(7);
            int operatorid = rs.getInt(8);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, tabel);
            pstmt.setString(4, attribute);
            pstmt.setInt(5, businesstypeid);
            pstmt.setInt(6, failurehandlingid);
            pstmt.setInt(7, validationexecutionid);
            pstmt.setInt(8, operatorid);
            pstmt.executeUpdate();

        }

        //Verwijder wat in de ene database zit ook in de ander
//        String sql = "DELETE FROM Rule WHERE ID = ?";
//
//        Statement statement = connapex.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//
//        PreparedStatement pstmt = conn.prepareStatement(sql);
//
//        ResultSet rs = statement.executeQuery("DELETE FROM Rule WHERE ID = 1");
//
//
//        while (rs.next()) {
//            int id = rs.getInt(1);
//            pstmt.setInt(1, id);
//            pstmt.executeUpdate();
//
//        }

        //Wijzigen
//        String sql = "UPDATE Rule SET " + "ID," + "Name," + "Tabel," + "Attribute," + "BusinessType_ID," + "FailureHandling_ID," + "ValidationExecution_ID," + "Operator_ID WHERE ID = ?";
//
//        Statement statement = connapex.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//
//        PreparedStatement pstmt = conn.prepareStatement(sql);
//
//        ResultSet rs = statement.executeQuery("SELECT * FROM Rule WHERE ID = 1");
//
//
//        while (rs.next()) {
//            int id = rs.getInt(1);
//            String name = rs.getString(2);
//            String tabel = rs.getString(3);
//            String attribute = rs.getString(4);
//            int businesstypeid = rs.getInt(5);
//            int failurehandlingid = rs.getInt(6);
//            int validationexecutionid = rs.getInt(7);
//            int operatorid = rs.getInt(8);
//            pstmt.setInt(1, id);
//            pstmt.setString(2, name);
//            pstmt.setString(3, tabel);
//            pstmt.setString(4, attribute);
//            pstmt.setInt(5, businesstypeid);
//            pstmt.setInt(6, failurehandlingid);
//            pstmt.setInt(7, validationexecutionid);
//            pstmt.setInt(8, operatorid);
//            pstmt.executeUpdate();
//
//        }
        connapex.close();
        conn.close();

    }

//    public static void printAllBusinessRules(BusinessRuleApexDao brdao) throws SQLException {
//        System.out.println("---- Alle business rules in de database:");
//
//        List<BusinessRule> bList = brdao.findAll();
//
//        for (BusinessRule b : bList) {
//            System.out.println(b);
//        }
//        System.out.println();
//    }
}