package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.BasePage;

import javax.management.StringValueExp;
import java.util.List;

public class SignInFunction extends BasePage {

    private By btnSignIn = By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[3]/div/div[1]");
    private By SignInBtn =By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[3]/div/div[2]/a/div/div[2]");
    private By SignInButton = By.id("H-Register");
    private By firstname = By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/form[1]/div[2]/div/div/div[2]/input");
    private By lastname = By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/form[1]/div[3]/div/div/div[2]/input");
    private By email = By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/form[1]/div[4]/div/div/div[2]/input");
    private By password = By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/form[1]/div[6]/div/div/div[2]/div/input");
    private By phone = By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/form[1]/div[7]/div/div/div[2]/input[1]");
    private By checkBox = By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/form[1]/div[8]/div/div/label/span[1]");
    private By submitBtn = By.id("SubmitForm");

    public SignInFunction(WebDriver driver) {
        super(driver);
    }


    public void SignInForm()  {
        element(btnSignIn).click();
        element(SignInBtn).click();
        element(SignInButton).click();
        element(firstname).sendKeys("selenium");
        element(lastname).sendKeys("Testinium");
        element(email).sendKeys("selenium@test.com");
        element(password).sendKeys("123Aasd!'");
        element(phone).sendKeys("5302345678");
        element(checkBox).click();
        element(submitBtn).click();
        System.out.println("şuan login işleminiz gerçekleşti");

    }
}
