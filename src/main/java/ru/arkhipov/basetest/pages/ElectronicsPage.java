package ru.arkhipov.basetest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends BasePageObject{


    @FindBy(xpath = "//div[@class='ePage_LeftColumn']")
    WebElement leftColumn;

    public void selectLeftColumn(String device){

        leftColumn.findElement(By.xpath(".//a[text()='" + device + "']")).click();
    }


}
