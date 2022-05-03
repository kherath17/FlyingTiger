package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class myAccountPage {
    WebDriver driver=basePage.driver;
    landPage lp = new landPage();


    public String enterDetails() throws InterruptedException, AWTException {
        lp.navUrl();
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(120));
        wt.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='navUser-action navUser-action--account']"))));
        driver.findElement(By.xpath("//a[@class='navUser-action navUser-action--account']")).click();

        Thread.sleep(5000);
        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_ESCAPE);
        rb.keyRelease(KeyEvent.VK_ESCAPE);

        driver.findElement(By.xpath("//input[@id='customer_email']")).sendKeys("test17@gmail.com");
        driver.findElement(By.xpath("//input[@id='customer_password']")).sendKeys("test123");

        Thread.sleep(8000);
        rb.keyPress(KeyEvent.VK_ESCAPE);
        rb.keyRelease(KeyEvent.VK_ESCAPE);

        driver.findElement(By.xpath("//input[@value='Log in']")).click();

        Thread.sleep(5000);

        String loggedIn = driver.findElement(By.xpath("//a[@id='customer_logout_link']")).getText();
        return loggedIn;

        /*
        driver.findElement(By.xpath("//input[@name='customer[first_name]']")).sendKeys("Test12");
        driver.findElement(By.xpath("//input[@name='customer[last_name]']")).sendKeys("Test1");
        driver.findElement(By.xpath("(//input[@name='customer[email]'])[2]")).sendKeys("Test56@gmail.com");
        driver.findElement(By.xpath("(//input[@name='customer[password]'])[2]")).sendKeys("Test1");
        driver.findElement(By.xpath("//input[@value='Create account']")).click();

        //Thread.sleep(1000);
        //driver.findElement(By.xpath("//a[@class='navUser-action navUser-action--account']")).click();
        Thread.sleep(5000);

        rb.keyPress(KeyEvent.VK_ESCAPE);
        rb.keyRelease(KeyEvent.VK_ESCAPE);



        Thread.sleep(2000);
        String loggedIn = driver.findElement(By.xpath("//h2[@class='title title--large']")).getText();



        //String userSuccessText = driver.findElement(By.xpath("//div[@class='form-message form-message--success']/ul/li")).getText();
        return loggedIn;

         */
    }

}
