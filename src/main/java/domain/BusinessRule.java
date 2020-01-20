package domain;

import java.util.Map;

import domain.*;

public class BusinessRule{
    private int id;
    private String name;
    private RuleType type;

    public BusinessRule(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void assignType(RuleType type){
        this.type = type;
    }

    public String Generate(){
        String plsql = type.generateRuleCode();
        Map<String, String> values = new HashMap<>();
        values.put("name", name);
        StrSubstItutor sub = StrSubstitutor(values, "(", ")");
        return bsrCode;
    }

    @override
    public String toString(){
        return "businessRule(" + "id=" + id + ", name=" + name + ", type=" + type + ")";
    }
}