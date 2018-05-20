package ru.arkhipov.basetest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.arkhipov.basetest.util.Stash;

public class ProductPage extends BasePageObject {


    @FindBy(xpath = "//div[text()='Добавить в корзину']")
    WebElement addToBasket;

    @FindBy(xpath = "//h1")
    WebElement title;

    public void add(){
        addTitle();
        addToBasket.click();
    }

    public void addTitle(){
        Stash.add(title.getText());
    }

}
