package com.Syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        //go to google.com
        //go to fb.com
        //go back to goole.com

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.navigate().to("https://www.facebook.com/");
        //introduce some sleep witch wait or pause for 2000 miliseconds (2 sec)
        Thread.sleep(2000);
        driver.navigate().back();

        // go back to FB com
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(1000);
        //wait for 1 sec
        //refresh the page
        driver.navigate().refresh();
        // quit
        driver.quit();

    }
}
