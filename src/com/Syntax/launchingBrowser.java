package com.Syntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
        //set the path driver to link it with our class

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create a WebDriver instance (=driver)
        WebDriver driver=new ChromeDriver();
        //use the get() function to open up the required website
        driver.get("https://www.google.com/");

        // get the URL of the website
        String url=driver.getCurrentUrl();
        //print the url

        System.out.println(url);

        //get the title

        String title=driver.getTitle();//print url
        System.out.println(title);//get title

        //close the crome

        driver.quit();
        driver.close();
    }
}
