package ru.arkhipov.basetest.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.arkhipov.basetest.steps.BaseSteps;
import ru.arkhipov.basetest.util.Stash;

import java.util.List;

public class BasketPage extends BasePageObject {


    @FindBy(xpath = "//span[@class='eCartItem_nameValue']")
    List<WebElement> basketList;

    @FindBy(xpath = "//div[@class='eCartControls_infoDate']")
    public WebElement date;


    @FindBy(xpath = "//div[contains(text(), 'Удалить всё')]/parent::div")
    public WebElement deleteAll;

    @FindBy(xpath = "//span[contains(text(), 'пуста')]")
    public WebElement deleteCheck;

    public void checkBasket(){
        basketList.forEach(element -> {
            if(!Stash.check(element.getText())){
                throw new AssertionError("Элемента нет в корзине");
            }
        });
    }

    public void delete(){
        waiting(date);
        deleteAll.click();
    }

    public void checkDelete(){
        Assert.assertNotNull(deleteCheck);
    }


}
