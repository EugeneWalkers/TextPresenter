package Interactor.concreteAnalyzers;

import java.util.Map;

import Interactor.AbstractAnalyzer;
import Interactor.Finances;
import Interactor.Report;

/**
 *
 */

public class MendeleevAnalyzer extends AbstractAnalyzer {

    @Override
    public Report analyze() {
        final Map<Finances, Double> finances = provider.getFinances();

        return new Report(finances);
    }
}