package pages;

public class PaginaCursos extends BasePage {

    private String fundamentosTestingLink = "//a[@href and normalize-space()='Fundamentos del Testing']";


    public PaginaCursos() {
        super(driver);     
    }

    public void clickFundamentosTesting(){
        clickElement(fundamentosTestingLink);
    }


}
