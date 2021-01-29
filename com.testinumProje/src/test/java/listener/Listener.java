package listener;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

import java.util.concurrent.TimeUnit;

public class Listener extends BaseTest implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        driver.get(baseUrl);
        log.info("gitti gidiyor açıldı");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("test başarılı");
        log.info("başarılı");

    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("test başarısız");
        log.error("fail");

    }

    
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("test atlandı");
        log.warn("skip");

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        log.info("browser açıldı");

    }

    public void onFinish(ITestContext iTestContext) {
        log.info("browser kapatıldı");
        driver.quit();
    }
}
