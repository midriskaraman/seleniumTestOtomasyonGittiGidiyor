package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;
    public Select sel;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait =new WebDriverWait(driver,20);
    }


    public WebElement element(By locator){
        actions = new Actions(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElement(locator);
    }

    public void sendKeys(By locator , String value){
        element(locator).sendKeys(value);
    }
}

