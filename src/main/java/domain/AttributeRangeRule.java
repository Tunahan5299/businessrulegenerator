/*package domain;

import java.io.StringReader;
import javax.json.JsonObject;

import domain.*;

public class businessRule {
    private BusinessRuleService service = ServiceProvider.getBusinessRuleService();

    public Response test(String JSONdata){
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

        businessRule.CreateBusinessRuleUsing(rule, strategy, jsonObject);
    }
}
*/