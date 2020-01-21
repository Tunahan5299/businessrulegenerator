import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BusinessRuleOracleDaoImpl extends OracleBaseDao implements BusinessRuleDao {

    public BusinessRuleOracleDaoImpl() throws SQLException {
        super();
    }

    public BusinessRule save(BusinessRule b) {
        try {
            PreparedStatement pstmnt = conn.prepareStatement("INSERT INTO businessrule (type) VALUES (?)");
            pstmnt.setInt(1, k.getKaartNummer());
            pstmnt.setDate(2, k.getGeldigTot());
            pstmnt.setInt(3, k.getKlasse());
            pstmnt.setFloat(4, k.getSaldo());
            pstmnt.setInt(5, k.getEigenaar().getReizigerID());

            pstmnt.executeUpdate();

            pstmnt.close();
        }
        catch (SQLException sqlex) {
            System.out.println("SQLException: " + sqlex.getMessage());
        }

        return k;
    }
}
