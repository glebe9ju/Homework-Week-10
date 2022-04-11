package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowser {
    public static void main(String[] args) {
        //Store URL in string datatype
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //set the property from chrome browser
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        //creating object of web driver interface
        WebDriver driver = new FirefoxDriver();
        //launch the URL
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //give the implicitly time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //String title = driver.getTitle();
        //print the title of the page
        System.out.println("Title :" + driver.getTitle());
        //print the current URL
        System.out.println("current URL =" + driver.getCurrentUrl());

        String loginUrl = "https://opensource-demo.orangehrmlive.com/";
        driver.navigate().to(loginUrl);
        System.out.println("current URL = " + driver.getCurrentUrl());
        //Enter the password to password field
        WebElement emailField = driver.findElement(By.id("txtUsername"));
        emailField.sendKeys("prime456@gmail.com");
        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("kiko7896");
        driver.close();


    }
}
