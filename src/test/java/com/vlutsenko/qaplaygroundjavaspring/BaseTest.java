package com.vlutsenko.qaplaygroundjavaspring;

import com.vlutsenko.framework.config.annotations.LazyAutowired;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;

@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {

    @LazyAutowired
    protected WebDriver driver;
    @LazyAutowired
    protected WebDriverWait wait;

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}
