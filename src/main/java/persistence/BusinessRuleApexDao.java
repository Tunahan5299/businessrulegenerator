package persistence;

import java.sql.SQLException;
import java.util.List;

import domain.BusinessRule;

public interface BusinessRuleApexDao {
    List<BusinessRule> findAll();
}
