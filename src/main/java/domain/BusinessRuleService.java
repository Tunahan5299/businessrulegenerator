package domain;

import java.util.List;
import java.sql.SQLException;

import persistence.BusinessRuleApexDao;
import persistence.BusinessRuleApexDaoImpl;


public class BusinessRuleService{
    /*BusinessRuleApexDao businessRuleApexDao = new BusinessRuleApexDaoImpl();

    public List<BusinessRule> getAllBusinessRules(){
        return BusinessRuleApexDao.findAll();
    }

    private static BusinessRuleService uniqueInstance;

    private BusinessRuleService(){}

    public static BusinessRuleService getInstance(){
        if (BusinessRuleService.uniqueInstance == null){
            BusinessRuleService.uniqueInstance = new BusinessRuleService();
        }
    }

    public void CreateBusinessRuleUsingStrategy(businessRule bsr, BusinessRuleGenerationStrategy strategy, ){
        bsr.assignType(strategy.create(jsonObject));
        bsr.Generate();
    }

   public boolean DeleteBusinessRule(){
        return true;
    }*/


}