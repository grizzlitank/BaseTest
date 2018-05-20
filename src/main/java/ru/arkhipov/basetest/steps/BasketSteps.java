package ru.arkhipov.basetest.steps;

import io.qameta.allure.Step;
import ru.arkhipov.basetest.pages.BasketPage;
import ru.arkhipov.basetest.pages.ElectronicsPage;

public class BasketSteps {

    @Step("все выбранные девайсы есть в корзине")
    public void checkDevices(){
        new BasketPage().checkBasket();
    }

    @Step("удалили все")
    public void delete(){
        new BasketPage().delete();
    }

    @Step("корзина пуста")
    public void deleteCheck(){
        new BasketPage().checkDelete();
    }


}
