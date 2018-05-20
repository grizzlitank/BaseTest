package ru.arkhipov.basetest.steps;



import io.qameta.allure.Step;
import ru.arkhipov.basetest.pages.MainPage;


public class MainPageSteps {



    @Step("выбрана вкладка {value}")
    public void selectElectronics(String value){
        new MainPage().select(value);
    }



}
