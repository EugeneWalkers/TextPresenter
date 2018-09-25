package Controller;

import com.sun.istack.internal.NotNull;

import java.util.Map;

import Interactor.Analyzer;
import Interactor.Report;
import Interactor.RequestModel;
import Presenters.HTMLPresenter.HTMLPresenter;
import Presenters.PDFPresenter.PDFPresenter;

/**
 *
 */
public class Controller {

    private final RequestModel model;
    private final Report report;
    private Presenter presenter;

    /**
     * Default constructor
     */
    public Controller(final RequestModel model, final Analyzer analyzer) {
        this.model = model;
        this.report = analyzer.analyze();

        setUpPresenter();
    }

    private void setUpPresenter() {
        switch (model) {
            //noinspection DefaultNotLastCaseInSwitch
            default:
            case PDF:
                presenter = new PDFPresenter();

                break;
            case HTML:
                presenter = new HTMLPresenter();

                break;
        }
    }

    public void show(){
        presenter.showReport(report);
    }

}