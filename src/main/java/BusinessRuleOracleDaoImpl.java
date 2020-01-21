import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BusinessRuleOracleDaoImpl extends OracleBaseDao implements BusinessRuleDao {

    public BusinessRuleOracleDaoImpl() throws SQLException {
        super();
    }

    public BusinessRule save(BusinessRule b) {
        try {
            PreparedStatement pstmnt = conn.prepareStatement("INSERT INTO businessrule (naam, type, omschrijving, foutmelding, status) VALUES (?, ?, ?, ?, ?)");
            pstmnt.setString(1, b.getNaam());
            pstmnt.setString(2, b.getType());
            pstmnt.setString(3, b.getOmschrijving());
            pstmnt.setString(4, b.getFoutmelding());
            pstmnt.setInt(5, b.getStatus());

            pstmnt.executeUpdate();

            pstmnt.close();
        } catch (SQLException sqlex) {
            System.out.println("SQLException: " + sqlex.getMessage());
        }

        return b;
    }

    public BusinessRule update(BusinessRule b) {
        try {
            PreparedStatement pstmnt = conn.prepareStatement("UPDATE businessrule SET naam = ?, type = ?, omschrijving = ?, foutmelding = ?, status = ? WHERE naam = ?");
            pstmnt.setString(1, b.getNaam());
            pstmnt.setString(2, b.getType());
            pstmnt.setString(3, b.getOmschrijving());
            pstmnt.setString(4, b.getFoutmelding());
            pstmnt.setInt(5, b.getStatus());

            pstmnt.executeUpdate();

            pstmnt.close();
        }
        catch (SQLException sqlex) {
            System.out.println("SQLException: " + sqlex.getMessage());
        }

        return b;
    }

    public boolean delete(BusinessRule b) {
        try {
            PreparedStatement pstmnt = conn.prepareStatement("DELETE FROM businessrule WHERE naam = ?");
            pstmnt.setString(1, b.getNaam());
            pstmnt.executeUpdate();


            return true;
        } catch (SQLException sqlex) {
            System.out.println("SQLException: " + sqlex.getMessage());
        }

        return false;
    }
}

