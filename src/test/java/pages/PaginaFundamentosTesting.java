package pages;


public class PaginaFundamentosTesting extends BasePage{

    private String introTestingLink = "//a[@href and normalize-space()='Introducción al Testing de Software']";


    public PaginaFundamentosTesting() {
        super(driver);
        //TODO Auto-generated constructor stub
    }

    public void clickIntroTestingLink(){
        clickElement(introTestingLink);
    }
    
}
