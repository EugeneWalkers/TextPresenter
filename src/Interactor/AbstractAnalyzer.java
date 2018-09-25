package Interactor;

import Database.DatabaseFinanceProvider;

public abstract class AbstractAnalyzer implements Analyzer{

    protected FinanceProvider provider;

    {
        provider = DatabaseFinanceProvider.getInstance();
    }
}
