package com.Syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximazeWindow {
    public static void main(String[] args) {
        //go to google.com
        //maximaze your window

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        //maximaze
        driver.manage().window().maximize();
        //fullscreen
        driver.manage().window().fullscreen();
        driver.quit();
    }
}
