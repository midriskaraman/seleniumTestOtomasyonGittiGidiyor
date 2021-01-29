package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.TitleControl;
import utils.BaseTest;

@Listeners({Listener.class})
public class TitleControlTest extends BaseTest {

    @Test
    public void titleTest(){
        TitleControl titleControl = new TitleControl(driver);
        titleControl.titleControl();
    }
}
