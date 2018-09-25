package Interactor;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public final class Report {

    private static final String GREETING = "Dear customer,\n\nYour balance:";
    private static final String CLOSER_AND_SIGNATURE = "Best regards,\n\nBank";
    private final Map<Finances, Double> balance;

    public Report(final Map<Finances, Double> balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        final StringBuilder reportGenerator = new StringBuilder(Report.GREETING).append("\n").append("\n");

        for (final Map.Entry<Finances, Double> entry : balance.entrySet()) {
            reportGenerator.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        reportGenerator.append("\n").append(Report.CLOSER_AND_SIGNATURE);

        return reportGenerator.toString();
    }

}