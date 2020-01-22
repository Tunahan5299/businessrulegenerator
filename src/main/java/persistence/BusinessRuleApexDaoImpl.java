package persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.BusinessRule;
import persistence.ApexBaseDao;
import persistence.BusinessRuleApexDao;

public class BusinessRuleApexDaoImpl extends ApexBaseDao implements BusinessRuleApexDao {

    public BusinessRuleApexDaoImpl() throws SQLException {
        super();
    }

    private List<BusinessRule> selectBusinessRule(String query) {
        List<BusinessRule> results = new ArrayList<BusinessRule>();

        try {
            Statement stmt = connapex.createStatement();
            ResultSet dbResultSet = stmt.executeQuery(query);

            while (dbResultSet.next()) {
                String naam = dbResultSet.getString("naam");
                String type = dbResultSet.getString("type");
                String omschrijving = dbResultSet.getString("omschrijving");
                String foutmelding = dbResultSet.getString("foutmelding");
                int status = dbResultSet.getInt("status");

                BusinessRule businessrule = new BusinessRule(naam, type, omschrijving, foutmelding, status);
                results.add(businessrule);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

        return results;
    }

    public List<BusinessRule> findAll() {
        return selectBusinessRule(
                "SELECT * FROM businessrule");
    }
}
