package factorymethod;

public class StudentReportFactory extends ReportFactory {
	@Override
    public Report createReport() {

        return new StudentReport();
    }

}
