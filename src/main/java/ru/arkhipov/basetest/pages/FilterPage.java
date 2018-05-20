package ru.arkhipov.basetest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.arkhipov.basetest.steps.BaseSteps;

import java.util.List;

public class FilterPage extends BasePageObject {



    @FindBy(xpath = "//div[@class='bFacetFilters']//*[contains(text(), 'Бренды')]/following-sibling::div")
    WebElement brandList;

    @FindBy(xpath = "//input[@class='eFromToInput_InputField mFrom']")
    WebElement fieldPrice;


    @FindBy(xpath = "//div[@class='bFiltersHor']//div[@class='bFlatButton mMicro mWhite']")
    WebElement fieldApply;

    @FindBy(xpath = "//a[contains(text(), 'От ')]")
    WebElement fieldApplyCheck;

    @FindBy(xpath = "//div[text()='Корзина']")
    public WebElement basket;


    @FindBy(xpath = "//div[@class='bOneTile inline jsUpdateLink mRuble ']")
    List<WebElement> productList;

    public void selectBrandList(List<String> brands){
        brands.forEach(brand ->
            brandList.findElement(By.xpath(".//*[contains(text(), '" + brand + "')]")).click());
    }



    public void setFieldPrice(String price){
        waiting(fieldPrice);
        fieldPrice.clear();
        fieldPrice.sendKeys(price);
        fieldPrice.sendKeys(Keys.ENTER);
        fieldApply.click();
        waiting(BaseSteps.getDriver().findElement(By.xpath("//a[contains(text(), 'От " + price + "')]" )));
    }

    public void addToBasket(){
        for(int i = 0; i < productList.size(); i++){
            if(i%2==0){
                productList.get(i).click();
                new ProductPage().add();
                BaseSteps.getDriver().navigate().back();
                waiting(fieldApplyCheck);
            }
        }
    }


}
