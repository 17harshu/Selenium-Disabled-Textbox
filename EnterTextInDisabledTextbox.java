package com.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterTextInDisabledTextbox {
    @Test
    public void textInDisabledBox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\test\\java\\com\\demo\\DisabledTest.html");
        Thread.sleep(2000);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        javascriptExecutor.executeScript("document.getElementById('t1').value=''");

        javascriptExecutor.executeScript("document.getElementById('t1').value='re-written text'");
        Thread.sleep(2000);

        javascriptExecutor.executeScript("document.getElementById('t2').value=''");
        Thread.sleep(2000);

        javascriptExecutor.executeScript("document.getElementById('t2').value='Text filled 2'");
        Thread.sleep(2000);
        driver.close();
    }
}
