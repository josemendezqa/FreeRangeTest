package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.MainPage;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.RegistryPage;
import org.testng.asserts.SoftAssert;



public class FreeRangeSteps {

    MainPage mainPage = new MainPage();
    PaginaCursos cursosPage = new PaginaCursos(); 
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    RegistryPage registryPage = new RegistryPage();

    SoftAssert softAssert = new SoftAssert();

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

    @Then("I can validate option on the options in the checkout page")
    public void validateCheckoutPlans(){
        List<String> lista = registryPage.returnPlanDropdownValues();
        List<String> expectedList = Arrays.asList("Academia: $16.99 / mes • 12 productos",
        "Academia: $176 / año • 12 productos", "Free: Gratis • 3 productos");
        
        Assert.assertEquals(expectedList, lista);


    }

    public void Ejemplulis() {
        String palabraEsperada = "Pepe";
        String palabraEncontrada = "Papa";
 
        // Soft Assertions: No detienen la ejecución al fallar. Ideal para verificar
        // muchas cosas pequeñas a la vez.
        softAssert.assertEquals(palabraEsperada, palabraEncontrada);
        softAssert.assertTrue(palabraEncontrada.contains(palabraEsperada));
        softAssert.assertNotEquals(palabraEncontrada,palabraEsperada);
 
        softAssert.assertAll(); //verifica todas las condiciones anteriores e indica cuales fallaron y cuales pasaron
 
    }


}
