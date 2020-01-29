package bridge;

public class SalesReport extends Report {

	public SalesReport(IReportFormat reportFormat) {
		super(reportFormat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void display(){
		System.out.println("satis raporu");
		super.display();
	}

}
