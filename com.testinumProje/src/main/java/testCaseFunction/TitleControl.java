package testCaseFunction;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BasePage;

public class TitleControl extends BasePage {
    public TitleControl(WebDriver driver) {
        super(driver);
    }

    public String title(){
        return driver.getTitle();
    }
    public void titleControl(){
        Assert.assertEquals(title(),"GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi");
        System.out.println("gitti gidiyor sitesine giriş yapılmıştır");
    }


}
