package com.selenium.testing.Project1_Online_E_Commerce_Website_Automation.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            String path = System.getProperty("user.dir") + "/reports/extent.html";

            ExtentSparkReporter reporter = new ExtentSparkReporter(path);
            reporter.config().setReportName("Automation Test Report");
            reporter.config().setDocumentTitle("Selenium Test Results");

            extent = new ExtentReports();
            extent.attachReporter(reporter);

            extent.setSystemInfo("Project", "Online E-Commerce Website");
            extent.setSystemInfo("Environment", "QA");

        }

        return extent;
    }
}
