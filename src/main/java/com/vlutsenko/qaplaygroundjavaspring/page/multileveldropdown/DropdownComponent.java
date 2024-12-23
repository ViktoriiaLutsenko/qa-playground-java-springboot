package com.vlutsenko.qaplaygroundjavaspring.page.multileveldropdown;

import com.vlutsenko.framework.config.annotations.LazyComponentPrototypeScope;
import com.vlutsenko.framework.page.AbstractComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@LazyComponentPrototypeScope
public class DropdownComponent extends AbstractComponent {

    @FindBy(css = "ul li:nth-child(4)")
    private WebElement dropDownButton;

    @FindBy(css = ".dropdown a")
    private List<WebElement> dropDownOptions;

    public void clickOnDropDownButton() {
        dropDownButton.click();
    }

    public void selectDropDownOption(String dropDownOptionName) {
        dropDownOptions
            .stream()
            .filter(o -> o.getText().contains(dropDownOptionName))
            .findFirst()
            .orElseThrow(NoSuchElementException::new)
            .click();
    }

    public List<String> getDropdownOptionsLinks() {
        return dropDownOptions
            .stream()
            .map(o -> o.getAttribute("href"))
            .collect(Collectors.toList());
    }

    public List<String> getDropdownOptionsText() {
        return dropDownOptions
            .stream()
            .map(WebElement::getText)
            .collect(Collectors.toList());
    }

    @Override
    public boolean isAt() {
        return wait.until((d) -> dropDownButton.isDisplayed());
    }
}
