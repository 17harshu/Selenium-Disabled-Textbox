package com.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpAndDown {
    @Test
    public void scrollUpDown() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumhq.org/download");
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver; //typecasting driver object to JavascriptExecutor interface type

        for (int i = 1; i < 10; i++) {
            //scroll down on the webpage
            js.executeScript("window.scrollBy(0, 500)");
            Thread.sleep(2000);
        }

        for (int i = 1; i < 10; i++) {
            //scroll up on the webpage
            js.executeScript("window.scrollBy(0, -500)");
            Thread.sleep(2000);
        }
        driver.close();
    }
}

