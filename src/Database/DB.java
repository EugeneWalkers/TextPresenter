package Database;

import java.util.HashMap;
import java.util.Map;

import Interactor.Finances;

import static Interactor.Finances.*;

/**
 *
 */

final class DB {

    private static final DB INSTANCE = new DB();

    private final double dollar;
    private final double euro;
    private final double ruble;

    private DB() {
        dollar = 706.34;
        euro = 559.27;
        ruble = 800.01;
    }

    static DB getInstance() {
        return INSTANCE;
    }

    Map<Finances, Double> toMap() {
        final Map<Finances, Double> data = new HashMap<>();

        data.put(DOLLAR, dollar);
        data.put(EURO, euro);
        data.put(RUBLE, ruble);

        return data;
    }

}