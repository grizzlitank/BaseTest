package ru.arkhipov.basetest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePageObject{


    @FindBy(xpath = "//div[@class='bHeaderCategoryLinks ']")
    WebElement electronics;

    @FindBy(xpath = "//div[@class='close-icon eDYbanner_close jsCloseBanner']")
    WebElement close1;


    public void select(String value){
        close1.click();
        electronics.findElement(By.xpath("./a[text()='" + value + "']")).click();
    }








}


