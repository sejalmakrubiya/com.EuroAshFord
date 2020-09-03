import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CalculaterVAt {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\shop\\sejal\\Sejal Testing\\software\\Chrome Driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.euroashfords.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        //click on RESOURCES BUTTON
        driver.findElement(By.xpath("//a[@href=\"#\"]")).click();
        //Click on CALCULATER BUTTON
        driver.findElement(By.xpath("//a[@href=\"http://www.euroashfords.co.uk/calculators/\"]")).click();
        //Click on VAT button
        driver.findElement(By.xpath("//a[@href=\"http://www.euroashfords.co.uk/calculators/vat/\"]")).click();
        //Enter Starting figure (£)
        driver.findElement(By.id("startingfigure")).sendKeys("5000.00");
        //Enter Does this figure already include VAT?
        driver.findElement(By.id("alreadyincludevat")).sendKeys("Yes");
        //Click on calculater button
        driver.findElement(By.id("pbCalculate")).click();
    }
}
