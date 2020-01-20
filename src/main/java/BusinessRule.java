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
}
