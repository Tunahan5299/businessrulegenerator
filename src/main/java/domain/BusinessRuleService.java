//package domain;
//
//import javax.json.jsonObject;
//
//import domain.*;
//
//public class BusinessRuleService{
//    private static BusinessRuleService uniqueInstance;
//
//    private BusinessRuleService(){}
//
//    public static BusinessRuleService getInstance(){
//        if (BusinessRuleService.uniqueInstance == null){
//            BusinessRuleService.uniqueInstance = new BusinessRuleService();
//        }
//    }
//
//    public void CreateBusinessRuleUsingStrategy(businessRule bsr, BusinessRuleGenerationStrategy strategy, ){
//        bsr.assignType(strategy.create(jsonObject));
//        bsr.Generate();
//    }
//
//    public boolean DeleteBusinessRule(){
//        return true;
//    }
//
//
//}