package domain;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domain.

public class businessRule {

    public static void viewTable(Connection con) throws SQLException {
        Statement stmt = null;
        String query = "SELECT ID, NAME, BUSINESSRULE_ID FROM " +
                    "RULE WHERE VALIDATIONEXECUTION_ID = 0;";

        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int bsrRuleType = rs.getInt("BusinessType_ID"); //Businessrule Rule Type
                int bsrId = rs.getInt("ID"); //businessRule Id
                String bsrName = rs.getString("NAME"); //businessRule Naam
                System.out.println("Business rule aanmaken met format: " + bsrRuleType + " met als Id: " + bsrId + " en naam: " + bsrName);

                BusinessRule rule = new BusinessRule(bsrId, bsrName);
                BSRRuleType strategy = null;

                switch(bsrRuleType){
                    case 0:
                        System.out.println("Range Rule");
                        strategy = new RangeRuleType();
                        break;
                    case 1:
                        System.out.println("Compare Rule");
                        strategy = new CompareRuleType();
                        break;
                    case 2:
                        System.out.println("Compare(Tuple) Rule");
                        strategy = new CompareTupleRuleType();
                        break;
                }

                BusinessRuleService.CreateBusinessRule(rule, strategy, rs);
            }
        }
    }
    /*public Response test(String JSONdata){
        BusinessRuleGenerationStrategy strategy = null;
        System.out.println("data");
        int strat = 1; //jsonObject.getInt("ruleType");
        int bsrID = 1; //jsonObject.getInt("ruleID");
        String bsrName = "Jood"; //jsonObject.getString("name");

        BusinessRule rule = new BusinessRule(bsrID, bsrName);

        switch(strat){
            case 1:
                System.out.println("AttributeRangeRule");
                strategy = new AttributeRangeRuleStrategy();
                break;
            case 2:
                System.out.println("andere rule");
                break;
        }

        BusinessRuleService.CreateBusinessRule(rule, strategy, jsonObject);
    }*/
}