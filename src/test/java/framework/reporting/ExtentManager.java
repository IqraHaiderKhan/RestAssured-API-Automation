package framework.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
            ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
            reporter.config().setDocumentTitle("API Automation Report");
            reporter.config().setReportName("RestAssured API Test Execution");
            extent = new ExtentReports();
            extent.attachReporter(reporter);
        }
        return extent;
    }
}
