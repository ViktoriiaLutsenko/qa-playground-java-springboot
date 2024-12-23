package com.vlutsenko.qaplaygroundjavaspring.page;

import com.vlutsenko.framework.config.annotations.LazyComponentPrototypeScope;
import com.vlutsenko.framework.page.AbstractComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@LazyComponentPrototypeScope
public class HomePage extends AbstractComponent {

    @FindBy(css = ".hero-content h1")
    private WebElement titleElement;

    @FindBy(css = ".card-course h3")
    private List<WebElement> courseCardTitles;

    @Value("${app.url}")
    private String url;

    public String getTitleText() {
        return titleElement.getText();
    }

    public void clickOnCard(String cardName) {
        courseCardTitles
            .stream()
            .filter(t -> Objects.equals(t.getText(), cardName))
            .findFirst()
            .orElseThrow(NoSuchElementException::new)
            .click();

    }

    public void goTo() {
        driver.get(url);
    }

    @Override
    public boolean isAt() {
        return wait.until(d -> titleElement.isDisplayed());
    }
}
