import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException {
//        BusinessRuleOracleDaoImpl brdao = new BusinessRuleOracleDaoImpl();
//
//        BusinessRule br1 = new BusinessRule("Rule1", "CompareRule", "Vergelijken", "Kan niet vergelijken", 0);
//
//        brdao.save(br1);

        BusinessRuleApexDaoImpl brdao = new BusinessRuleApexDaoImpl();

        brdao.findAll();

    }
}