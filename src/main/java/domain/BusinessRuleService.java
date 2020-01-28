package domain;

import domain.BusinessRule;

import java.sql.ResultSet;

public class BusinessRuleService{
    private static BusinessRuleService uniqueInstance;

    private BusinessRuleService(){}

    public static BusinessRuleService getInstance(){
        if (BusinessRuleService.uniqueInstance == null){
            BusinessRuleService.uniqueInstance = new BusinessRuleService();
        }
    }

    public static void CreateBusinessRule(BusinessRule rule, BSRRuleType strategy, ResultSet rs){
        System.out.println("Create Business Rule Niffo!");
        bsr.assignType(strategy.create(jsonObject));
        bsr.Generate();
    }

    public boolean DeleteBusinessRule(){
        return true;
    }


}