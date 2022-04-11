package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrower {
    public static void main(String[] args) {
        //Store URL in string datatype
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //set the property from chrome browser
        System.setProperty("webdriver.gecko.driver", "divers/geckodriver.exe");
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

        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
       // System.out.println("current URL = " + driver.getCurrentUrl());
        //Enter the password to password field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime456@gmail.com");
        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("77989");
        driver.close();


    }
}