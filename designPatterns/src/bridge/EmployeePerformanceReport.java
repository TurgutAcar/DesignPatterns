package bridge;

public class EmployeePerformanceReport extends Report {

	
	public EmployeePerformanceReport(IReportFormat reportFormat) {
		super(reportFormat);
	}

	@Override
	public void display(){
		System.out.println("calisan performans raporu");
		super.display();
	}

}
