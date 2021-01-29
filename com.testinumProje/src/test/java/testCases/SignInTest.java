package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.SignInFunction;
import utils.BaseTest;

@Listeners({Listener.class})
public class SignInTest extends BaseTest {

    @Test
    public void signTest()  {
        SignInFunction signInFunction =new SignInFunction(driver);
        signInFunction.SignInForm();
    }

}
