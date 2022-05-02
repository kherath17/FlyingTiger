import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.basePage;
import pageObjects.landPage;
import java.awt.*;

public class smokeTest {

    @BeforeTest
    public void setupDriver(){
            basePage.setDriver();
        }

    @Test(priority = 1)
    public void verifyPageNav() throws InterruptedException, AWTException {
        landPage lp = new landPage();
        Assert.assertEquals(lp.navUrl(),"Flying Tiger Copenhagen - Shop Online");
/*
        Assert.assertEquals(lp.checkSearchTextEntered(),"Trending");
        Assert.assertEquals(lp.navEnquiryPage(),"Enquiry Form");
        Assert.assertEquals(lp.sideBarpop(),"Find a store");
        
 */
        Assert.assertEquals(lp.signInForm(),"My account");
    }
/*
    @Test (priority = 2)
    public void verifySearchBoxActive() throws InterruptedException, AWTException {
        landPage lp = new landPage();
        Assert.assertEquals(lp.checkSearchTextEntered(),"Trending");
        lp.closeSearch();
    }

    @Test (priority = 3)
    public void verifyInuqiryFrmNav() throws InterruptedException {
        landPage lp = new landPage();
        Assert.assertEquals(lp.navEnquiryPage(),"Enquiry Form");
    }
    @Test(priority = 4)
    public void verifySideBar() throws InterruptedException, AWTException {
        landPage lp = new landPage();
        Assert.assertEquals(lp.sideBarpop(),"Find a store");
    }
@Test(priority = 5)
public void verifySigninForm() throws InterruptedException {
        landPage lp = new landPage();
        Assert.assertEquals(lp.signInForm(),"My account");
}

 */
    @AfterTest
    public void quitDriver(){
        basePage.tearDown();
    }
}
