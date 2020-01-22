package persistence;

import java.util.ArrayList;

import domain.BusinessRule;

public interface BusinessRuleOracleDao {

    BusinessRule save(BusinessRule b);
    BusinessRule update(BusinessRule b);
    boolean delete(BusinessRule b);
}
