import java.util.ArrayList;

public interface BusinessRuleOracleDao {

    BusinessRule save(BusinessRule b);
    BusinessRule update(BusinessRule b);
    boolean delete(BusinessRule b);
}
