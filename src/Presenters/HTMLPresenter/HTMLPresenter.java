package Presenters.HTMLPresenter;

import Controller.Presenter;
import Interactor.Report;

/**
 *
 */
public class HTMLPresenter implements Presenter {

    @Override
    public void showReport(final Report report) {
        System.out.println("HTML-PRESENTER:\n");
        System.out.println(report);
    }
}