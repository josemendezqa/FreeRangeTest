package pages;

import java.util.List;

public class RegistryPage extends BasePage{

    public RegistryPage() {
        super(driver);
        //TODO Auto-generated constructor stub
    }
   
    private String planDropdown = "//select[@id='cart_cart_item_attributes_plan_with_interval']";

    public List<String> returnPlanDropdownValues(){
        return getDropdownValues(planDropdown);
    }

}
