package listeners;

import org.testng.ITestListener;

public class TestNGListeners implements ITestListener {

    public void onTestStart (ITestListener result){
        System.out.println("Test Started : " +result.toString());
    }
    public void onTestFailure (ITestListener result) {
        System.out.println("Test Failed : " + result.toString());
    }
    public void onTestSkipped (ITestListener result) {
        System.out.println("Test Skipped : " + result.toString());
    }

}
