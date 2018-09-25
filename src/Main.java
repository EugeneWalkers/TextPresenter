import Controller.Controller;
import Interactor.RequestModel;
import Interactor.concreteAnalyzers.MendeleevAnalyzer;
import Interactor.concreteAnalyzers.SkorohodovAnalyzer;

public final class Main {

    public static void main(final String[] args){
        final Controller controllerWithSkorohodov = new Controller(RequestModel.HTML, new SkorohodovAnalyzer());
        controllerWithSkorohodov.show();
        System.out.println("\n\n\n\n");
        final Controller controllerWithMendeleev = new Controller(RequestModel.HTML, new MendeleevAnalyzer());
        controllerWithMendeleev.show();
    }

}
