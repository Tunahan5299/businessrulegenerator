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
