package domain;

public class BusinessRule {
    private String naam;
    private String type;
    private String omschrijving;
    private String foutmelding;
    private int status;

    public BusinessRule(String naam, String type, String omschrijving, String foutmelding, int status) {
        this.naam = naam;
        this.type = type;
        this.omschrijving = omschrijving;
        this.foutmelding = foutmelding;
        this.status = status;
    }

    public BusinessRule(int bsrId, String bsrName) {
    }

    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public String getFoutmelding() {
        return foutmelding;
    }

    public int getStatus() {
        return status;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public void setFoutmelding(String foutmelding) {
        this.foutmelding = foutmelding;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
//package domain;
//
//import java.util.Map;
//
//import domain.*;
//
//public class {
//    private int id;
//    private String name;
//    private RuleType type;
//
//    public (int id, String name){
//        this.id = id;
//        this.name = name;
//    }
//
//    public void assignType(RuleType type){
//        this.type = type;
//    }
//
//    public String Generate(){
//        String plsql = type.generateRuleCode();
//        Map<String, String> values = new HashMap<>();
//        values.put("name", name);
//        StrSubstItutor sub = StrSubstitutor(values, "(", ")");
//        return bsrCode;
//    }
//
//    @override
//    public String toString(){
//        return "businessRule(" + "id=" + id + ", name=" + name + ", type=" + type + ")";
//    }
//}