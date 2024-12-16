package com.vlutsenko.qaplaygroundjavaspring;

import com.vlutsenko.framework.config.annotations.LazyAutowired;
import org.openqa.selenium.WebDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterTest;

@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {

    @LazyAutowired
    protected WebDriver driver;

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}
