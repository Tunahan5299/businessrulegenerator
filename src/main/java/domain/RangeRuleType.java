package domain;

import javax.json.JsonArray;
import javax.json.JsonObject;

import domain.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RangeRuleType implements BSRRuleType {
    public RangeRuleType(String table, String attribute, String operator, String value1, String value2) {
    }

    @Override
    public RuleType create(Connection con) throws SQLException {
        Statement stmt = null;
        String query = "SELECT * FROM " +
                "RULE WHERE VALIDATIONEXECUTION_ID = 0;";

        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int bsrId = rs.getInt("ID"); //voor connectie tussen attribute en 
                String table = rs.getString("table");
                String attribute = rs.getString("attribute");
                String operator = rs.getString("operator"); // omzetten naar daadwerkelijke operator of code die van nummer operator maakt
                String value1 = rs.getString(""); //niet in rule
                String value2 = rs.getString(""); //niet in rule
                
                RuleType rangeRuleType = new RangeRuleType(table, attribute, operator, value1, value2);
                return rangeRuleType;
            }
        }
    }
}
        /*    
        String table = jsonObject1.getString("table");
        String operator = jsonObject1.getString("operator");
        String column = jsonObject1.getString("column");
        String startRange = jsonObject1.getString("startRange");
        String endRange = jsonObject1.getString("endRange");
        boolean isDate = jsonObject1.getBoolean("isDate");

        RuleType atteRangeRule = new AttributeRangeRule(table, operator, column, startRange, endRange, isDate);
        return atteRangeRule;*/