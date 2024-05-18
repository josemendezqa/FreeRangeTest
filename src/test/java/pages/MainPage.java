package pages;

public class MainPage extends BasePage {

    private String sectionLink = "//a[@href and normalize-space()='%s']";
    private String elegirPlanButton = "//a[@href and normalize-space()='Elegir Plan']";

    public MainPage(){
        super(driver);
    }

    public void navigateToFreeRangeTester(){
        navigateTo("https://www.freerangetesters.com");        
    }

    public void clickOnSectionNavigationBar(String section){
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOnElegirPlanButton(){
        clickElement((elegirPlanButton));
    }
    
}
