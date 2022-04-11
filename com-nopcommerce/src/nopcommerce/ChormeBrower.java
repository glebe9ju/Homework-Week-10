package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChormeBrower {
    public static void main(String[] args) {
        //store URL in String datatype
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //set the property from chrome brower
        System.setProperty("webdriver.chrome.driver", "divers/chromedriver.exe");
        //creating object of webdriver interface
        WebDriver driver = new ChromeDriver();// Driver object
        //launch the URL
        driver.get(baseUrl);
        //to maximize URL window
        driver.manage().window().maximize();
        //give the implicitly time to the diver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//decide the time when to launch
         //print the title of the page
        //  String title = driver.getTitle();
        System.out.println("Title : " + driver.getTitle());
        //print the current URL
        System.out.println("current URL = " + driver.getCurrentUrl());

        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);
        System.out.println("current URL =" + driver.getCurrentUrl());
        //enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime123@Ggmail.com");
        //enter the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Prime123");
        driver.close();
    }

}
