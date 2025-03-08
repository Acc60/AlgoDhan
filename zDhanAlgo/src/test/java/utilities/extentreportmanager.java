package utilities;

import org.testng.ITestListener;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreportmanager {
	
	public ExtentSparkReporter extentsparkrep;
	public ExtentReports extentrep;
	public ExtentTest extentte;
	
	String repname;
	
	public void onstart() {
		
		extentsparkrep=new ExtentSparkReporter(System.getProperty("user.dir"));
		
		extentrep=new ExtentReports();
		extentrep.attachReporter(extentsparkrep);
		
		extentsparkrep.config().setDocumentTitle("QA AUTOMATION TSTING INITIATIOn");
		extentsparkrep.config().setReportName("QA Test Result");
		extentsparkrep.config().setTheme(Theme.DARK);
		
	}
	

}
