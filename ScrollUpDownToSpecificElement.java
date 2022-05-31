package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpDownToSpecificElement {
    @Test
    public void scrollUpDown() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumhq.org/download");
        Thread.sleep(2000);

        WebElement webElement = driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
        int x = webElement.getLocation().getX();
        int y = webElement.getLocation().getY();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + ", " + y + ")");
        Thread.sleep(3000);
        driver.close();
    }
}
