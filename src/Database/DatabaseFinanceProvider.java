package Database;

import java.util.Map;

import Interactor.FinanceProvider;
import Interactor.Finances;

/**
 *
 */

public class DatabaseFinanceProvider implements FinanceProvider {

    private static final DatabaseFinanceProvider INSTANCE = new DatabaseFinanceProvider();
    private final DB database = DB.getInstance();

    private DatabaseFinanceProvider() {
    }

    public static DatabaseFinanceProvider getInstance() {
        return INSTANCE;
    }

    @Override
    public Map<Finances, Double> getFinances() {
        return database.toMap();
    }

}