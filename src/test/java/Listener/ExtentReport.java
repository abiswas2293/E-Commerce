package Listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReport implements ITestListener {

    private static ExtentReports extent;
    private static ExtentTest test;

    // Getter to use in your test classes / page classes
    public static ExtentTest getTest() {
        return test;
    }
    // Add this method
    public static void log(String message) {
        if (test != null) {
            test.info(message);        // Use .info() for general steps
        } else {
            System.out.println("ExtentTest is null: " + message); // fallback
        }
    }

    // Optional: You can also add these for more control
    public static void logPass(String message) {
        if (test != null) test.pass(message);
    }

    public static void logFail(String message) {
        if (test != null) test.fail(message);
    }
    @Override
    public void onStart(ITestContext context) {
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("SauceDemo Automation Report");
        spark.config().setReportName("Selenium Test Results");

        extent = new ExtentReports();
        extent.attachReporter(spark);

        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Java Version", System.getProperty("java.version"));
        extent.setSystemInfo("Browser", "Chrome");
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Create a new test node for every @Test method
        test = extent.createTest(result.getMethod().getMethodName(),
                result.getMethod().getDescription() != null ?
                        result.getMethod().getDescription() : "Test Execution");

        test.info("Test Started: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        if (test != null) {
            test.pass("Test Passed Successfully");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (test != null) {
            test.fail("Test Failed");
            test.fail(result.getThrowable());   // This adds the exception stack trace
            // You can add screenshot here later: test.addScreenCaptureFromPath(...);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        if (test != null) {
            test.skip("Test Skipped");
            test.skip(result.getThrowable());
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        if (extent != null) {
            extent.flush();        // ← Very Important
        }
    }
}