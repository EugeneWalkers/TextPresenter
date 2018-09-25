package Presenters.PDFPresenter;

import Controller.Presenter;
import Interactor.Report;

/**
 *
 */
public class PDFPresenter implements Presenter {

    @Override
    public void showReport(final Report report) {
        System.out.println("PDF-PRESENTER:\n");
        System.out.println(report);
    }
}