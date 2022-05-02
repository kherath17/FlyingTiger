package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class landPage {
    WebDriver driver=basePage.driver;

    public String navUrl(){
        driver.get("https://flyingtiger.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//button[contains(text(),'Accept all')])[1]")).click();
        String pageTitle= driver.getTitle();
        return pageTitle;
    }

    public String checkSearchTextEntered() throws InterruptedException, AWTException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='navUser-action navUser-action--search'])[1]")).click();
        Thread.sleep(10000);

        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_ESCAPE);
        rb.keyRelease(KeyEvent.VK_ESCAPE);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(500));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//span[@class='klevuHeadingText'])[2]"))));

        String searchText=driver.findElement(By.xpath("(//span[@class='klevuHeadingText'])[2]")).getText();
        return  searchText;
    }

    public void closeSearch(){
        driver.findElement(By.xpath("//div[@class='search-form--close']")).click();
    }

    public String navEnquiryPage() throws InterruptedException {
        driver.get("https://flyingtiger.com/");
        driver.findElement(By.xpath("(//div[@class='custom-icon-envelop custom-icon-envelop--outer'])[1]")).click();
        Thread.sleep(5000);
        String pgTitle = driver.getTitle();
        return pgTitle;
    }

    public String sideBarpop() throws InterruptedException, AWTException {
        driver.get("https://flyingtiger.com/");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[@class='navUser-action navUser-action--header-menu']")).click();
        Thread.sleep(5000);

        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_ESCAPE);
        rb.keyRelease(KeyEvent.VK_ESCAPE);

        //driver.findElement(By.xpath("//a[@class='navUser-action navUser-action--header-menu']")).click();
        Thread.sleep(5000);
        String sideBarText = driver.findElement(By.xpath("(//a[@class='header-menu-additional__store-finder'])[2]")).getText();
       return sideBarText;
    }

    public String signInForm() throws InterruptedException {
        driver.get("https://flyingtiger.com/");
        driver.findElement(By.xpath("//a[@class='navUser-action navUser-action--account']")).click();
        Thread.sleep(5000);
        String signInPg = driver.findElement(By.xpath("//p[@class='title']")).getText();
        return signInPg;
    }

}
