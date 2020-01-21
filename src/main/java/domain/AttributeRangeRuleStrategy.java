package domain;

import javax.json.JsonArray;
import javax.json.JsonObject;

import domain.*;

public class AttributeRangeRuleStrategy implements BusinessruleGenerationStrategy{
    @Override
    public RuleType create(JsonObject jsonObject){
        JsonArray jsonarray = jsonObject.getJson.getJsonArray("values");
        JsonObject jsonObject1 = jsonarray.getJsonObject(0);
        String table = jsonObject1.getString("table");
        String operator = jsonObject1.getString("operator");
        String column = jsonObject1.getString("column");
        String startRange = jsonObject1.getString("startRange");
        String endRange = jsonObject1.getString("endRange");
        boolean isDate = jsonObject1.getBoolean("isDate");

        RuleType atteRangeRule = new AttributeRangeRule(table, operator, column, startRange, endRange, isDate);
        return atteRangeRule;
    }
}