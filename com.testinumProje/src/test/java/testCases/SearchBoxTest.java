package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.SearchBoxFunction;
import utils.BaseTest;

@Listeners({Listener.class})
public class SearchBoxTest extends BaseTest {

    @Test
    public void SearchFormTest() throws InterruptedException {
        SearchBoxFunction searchBoxFunction = new SearchBoxFunction(driver);
        searchBoxFunction.SearchBoxForm();
    }
}
