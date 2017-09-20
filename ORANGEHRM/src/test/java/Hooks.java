import cucumber.api.java.Before;
import cucumber.api.java.After;


import java.io.IOException;

/**
 * Created by Sudhakar on 13/09/2017.
 */
public class Hooks {
    BasePage base = new BasePage();
    @Before
    public  void setUp() throws IOException {

        base.openBrowser();
    }
    @After
    public  void tearDown()
    {
        //base.closeBrowser();
    }
}
