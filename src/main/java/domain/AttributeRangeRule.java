//package domain;
//
//import java.io.StringReader;
//import javax.json.JsonObject;
//
//import domain.*;
//
////@Path("/generate")
//public class businessRule {
//    //private BusinessRuleService service = ServiceProvider.getBusinessRuleService();
//
//    //@POST
//    //@PATH("/generate")
//    //@PRODUCES("application/json")
//    public Response test(String JSONdata){
//        BusinessRuleGenerationStrategy strategy = null;
//        System.out.println(JSONdata);
//        JsonReader jsonReader = Json.createreader(new StringReader(JSONdata));
//        int strat = jsonObject.getInt("ruleType");
//        int bsrID = jsonObject.getInt("ruleID");
//        String bsrName = jsonObject.getString("name");
//
//        BusinessRule rule = new BusinessRule(bsrID, bsrName);
//
//        switch(strat){
//            case 1:
//                System.out.println("AttributeRangeRule");
//                strategy = new AttributeRangeRuleStrategy();
//                break;
//            case 2:
//                System.out.println("andere rule");
//                break;
//        }
//
//        businessRule.CreateBusinessRuleUsing(rule, strategy, jsonObject);
//    }
//}
