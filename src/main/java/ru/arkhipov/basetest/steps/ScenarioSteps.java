package ru.arkhipov.basetest.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.arkhipov.basetest.pages.BasketPage;

import java.util.List;


public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();

    ElectronicsSteps electronicsSteps = new ElectronicsSteps();

    FilterSteps filterSteps = new FilterSteps();

    BasketSteps basketSteps = new BasketSteps();



    @When("^выбрана вкладка \"(.+)\"$")
    public void selectElectronicsStep(String value){
        mainPageSteps.selectElectronics(value);
    }

    @When("^выбран девайс \"(.+)\"$")
    public void selectDeviceStep(String device){
        electronicsSteps.selectDevice(device);
    }

    @When("^выбран брэнд \"(.+)\"$")
    public void selectBrandStep(List<String> brands){
        filterSteps.selectBrand(brands);
    }

    @When("^выбрана нижняя граница цены \"(.+)\"$")
    public void setPriceStep(String price){
        filterSteps.setPrice(price);
    }


    @When("^добавлены товары$")
    public void addProductsStep(){
        filterSteps.addProducts();
    }

    @When("^перешли в корзину$")
    public void getBasketStep(){
        filterSteps.getBasket();
    }

    @Then("^все выбранные девайсы есть в корзине$")
    public void checkDevicesStep(){
        basketSteps.checkDevices();
    }

    @When("^удалили все$")
    public void deleteStep(){
        basketSteps.delete();
    }

    @Then("^корзина пуста$")
    public void deleteCheckStep(){
        basketSteps.deleteCheck();
    }









}
