package ru.arkhipov.basetest.steps;

import io.qameta.allure.Step;
import ru.arkhipov.basetest.pages.ElectronicsPage;
import ru.arkhipov.basetest.pages.FilterPage;

import java.util.List;

public class FilterSteps {



    @Step("выбран брэнд {brands}")
    public void selectBrand(List<String> brands){
        new FilterPage().selectBrandList(brands);
    }

    @Step("выбрана нижняя граница цены {price}")
    public void setPrice(String price){
        new FilterPage().setFieldPrice(price);
    }

    @Step("добавлены товары")
    public void addProducts(){
        new FilterPage().addToBasket();
    }

    @Step("перешли в корзину")
    public void getBasket(){
        new FilterPage().basket.click();
    }
}
