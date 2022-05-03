package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class storeLocator {
    WebDriver driver=basePage.driver;
    public String storeLocate() throws InterruptedException, AWTException {
        driver.get("https://flyingtiger.com/");
        driver.findElement(By.xpath("//a[@class='navUser-action navUser-action--store-finder']")).click();
        Thread.sleep(5000);
        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_ESCAPE);
        rb.keyRelease(KeyEvent.VK_ESCAPE);
        driver.findElement(By.xpath("//input[@class='stockist-search-field']")).click();
        Thread.sleep(5000);
        rb.keyPress(KeyEvent.VK_ESCAPE);
        rb.keyRelease(KeyEvent.VK_ESCAPE);
        driver.findElement(By.xpath("//input[@class='stockist-search-field']")).sendKeys("Germany");
        Thread.sleep(5000);
        rb.keyPress(KeyEvent.VK_ESCAPE);
        rb.keyRelease(KeyEvent.VK_ESCAPE);
        driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[@class='stockist-result-list']/ul/li[1]")).click();
        Thread.sleep(5000);
        String locate=driver.findElement(By.xpath("(//div[@class='stockist-result-addr-country'])[1]")).getText();
        return locate;
    }

}
