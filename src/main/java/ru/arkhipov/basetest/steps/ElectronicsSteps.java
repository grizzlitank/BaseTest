package ru.arkhipov.basetest.steps;

import io.qameta.allure.Step;
import ru.arkhipov.basetest.pages.ElectronicsPage;
import ru.arkhipov.basetest.pages.MainPage;

public class ElectronicsSteps {

    @Step("выбран девайс {device}")
    public void selectDevice(String device){
        new ElectronicsPage().selectLeftColumn(device);
    }
}
