package Interactor.concreteAnalyzers;

import java.util.Map;
import java.util.Random;

import Interactor.AbstractAnalyzer;
import Interactor.Finances;
import Interactor.Report;

public class SkorohodovAnalyzer extends AbstractAnalyzer {

    @Override
    public Report analyze() {
        final Map<Finances, Double> finances = provider.getFinances();
        final Random random = new Random();

        for (final Map.Entry<Finances, Double> entry : finances.entrySet()) {
            final double value = entry.getValue();
            if (random.nextBoolean()) {
                entry.setValue(value * 10);
            } else {
                entry.setValue(value / 10);
            }
        }

        return new Report(finances);
    }
}
