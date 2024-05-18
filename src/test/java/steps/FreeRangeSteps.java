package steps;

import io.cucumber.java.en.*;
import pages.MainPage;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;

public class FreeRangeSteps {

    MainPage mainPage = new MainPage();
    PaginaCursos cursosPage = new PaginaCursos(); 
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        mainPage.navigateToFreeRangeTester();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section){
        mainPage.clickOnSectionNavigationBar(section);
    }

    @When("I select Elegir Plan")
    public void selectElegirPlan(){
       mainPage.clickOnElegirPlanButton();
    }


    @And("select Introduccion al Testing")
    public void navigateToIntro(){
        cursosPage.clickFundamentosTesting();
        fundamentosPage.clickIntroTestingLink();
    }



}
