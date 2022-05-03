import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.*;

import java.awt.*;

public class regressionTest {

    @BeforeTest
    public void setupDriver(){
        basePage.setDriver();
    }

    @Test(priority = 0)
    public void verifyUserLogin() throws InterruptedException, AWTException {
        myAccountPage ac = new myAccountPage();
        Assert.assertEquals(ac.enterDetails(),"Log out");
    }
/*
    @Test(priority = 1)
    public void verifyItemAdded() throws InterruptedException, AWTException {
        landPage lp = new landPage();
        Assert.assertEquals(lp.addToBag(),"Megaphone");
    }
    @Test(priority = 2)
    public void verifyInquiry() throws InterruptedException, AWTException {
        messageInq ms = new messageInq();
        Assert.assertEquals(ms.chkMessage(),"Thanks for getting in touch! ");
    }
    @Test(priority = 3)
    public void verifyStoreLocate() throws InterruptedException, AWTException {
        storeLocator st = new storeLocator();
        Assert.assertEquals(st.storeLocate(),"Germany");
    }

 */

    @AfterTest
    public void quitDriver(){
        basePage.tearDown();
    }
}

