package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class messageInq {
    WebDriver driver=basePage.driver;
    public String chkMessage() throws InterruptedException, AWTException {
        driver.get("https://flyingtiger.com/");
        driver.findElement(By.xpath("(//div[@class='custom-icon-envelop custom-icon-envelop--outer'])[1]")).click();
        driver.findElement(By.xpath("(//input[@placeholder='Your first name...'])[1]")).sendKeys("Eshan");
        driver.findElement(By.xpath("(//input[@placeholder='Your last name...'])[1]")).sendKeys("Herath");
        driver.findElement(By.xpath("(//input[@placeholder='Your email address...'])[1]")).sendKeys("eshan123@gmail.com");

        driver.findElement(By.xpath("(//select[@name='select-2'])[1]")).click();
        Select sel = new Select(driver.findElement(By.xpath("(//select[@name='select-2'])[1]")));
        sel.selectByValue("Albania");

        driver.findElement(By.xpath("(//select[@name='select'])[1]")).click();
        Select sel2= new Select(driver.findElement(By.xpath("(//select[@name='select'])[1]")));
        //sel2.selectByValue("Online store");
        sel2.selectByIndex(2);
/*
        driver.findElement(By.xpath("(//select[@name='select-3'])")).click();
        Select sel3= new Select (driver.findElement(By.xpath("(//select[@name='select-3'])")));
        sel3.selectByValue("My order");

        driver.findElement(By.xpath("(//textarea[@name='textarea'])[1]")).sendKeys("Random Text");

 */

        driver.findElement(By.xpath("(//button[@class='action submit classic-button'])[1]")).click();

        Thread.sleep(5000);
        String message = driver.findElement(By.xpath("(//div[@class='message success']/div/h4)[1]")).getText();
        return message;
    }
}
