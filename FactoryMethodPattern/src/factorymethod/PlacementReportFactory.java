package factorymethod;

public class PlacementReportFactory extends ReportFactory {
	@Override
    public Report createReport() {

        return new PlacementReport();
    }

}
