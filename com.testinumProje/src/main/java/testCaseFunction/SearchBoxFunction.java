package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.BasePage;

import java.util.List;

public class SearchBoxFunction extends BasePage {

    private By searchBar = By.className("sc-4995aq-0 sc-14oyvky-0 iYMTpq");
    private By searchBtn = By.className("qjixn8-0 sc-1bydi5r-0 hKfdXF");
    private By searchResultTags = By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[5]/ul");
    private By productOne = By.id("product_id_635619110");
    private By productOneImg = By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[3]/div[2]/ul/li[1]/a/div/p/img");
    private By addToBasket = By.xpath("/html/body/div[3]/div[3]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[8]/div[3]/section/div/div/div[2]/form/button");
    private By price = By.cssSelector("#sp-price-highPrice");
    private By bucket= By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[3]/a/div[1]/span[2]");
    private By price2 = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div/div[3]/div/div[1]/div/div[5]/div[2]/div[3]/p");

    private By productAdet = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div[4]/div/span[2]");
    private By deleteProduct = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div[3]/div/div[2]/div/a[1]/i");
    private By emptyBucket = By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[2]/h2");



    public SearchBoxFunction(WebDriver driver) {
        super(driver);
    }

    public void SearchBoxForm() throws InterruptedException {
        element(searchBar).sendKeys("bilgisayar");
        element(searchBtn).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element(searchResultTags));
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(searchResultTags);
        boolean check = false;
        for (WebElement elem :elements) {
            if (elem.getText().equals("2")) {
                check = true;
                wait.until(ExpectedConditions.elementToBeClickable(elem));
                elem.click();
                break;
            }
        }
        assert check;
        Thread.sleep(5000);

        js.executeScript("arguments[0].scrollIntoView();",element(productOne));
        element(productOneImg).click();
        String expectedPrice = driver.findElement(price).getText();

        element(addToBasket).click();
        element(bucket).click();

        String actualPrice = driver.findElement(price2).getText();
        Assert.assertEquals(actualPrice,expectedPrice);
        System.out.println("fiyatlar karşılaştırıldı ve doğrulandı");
        element(productAdet).click();
        element(deleteProduct).click();
        System.out.println(" sepette "+ element(emptyBucket).getText());


    }
}
