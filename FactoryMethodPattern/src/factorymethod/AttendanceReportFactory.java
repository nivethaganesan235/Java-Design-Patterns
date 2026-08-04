package factorymethod;

public class AttendanceReportFactory extends ReportFactory {
	@Override
    public Report createReport() {

        return new AttendanceReport();
    }

}
