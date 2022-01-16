package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".products-grid .item")
    private List<WebElementFacade> listOfProducts;

    @FindBy(css = ".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2)")
    private WebElementFacade Sort;

    @FindBy(css = ".category-products > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > select:nth-child(2) > option:nth-child(3)")
    private WebElementFacade SortPrice;

    public void clickonSort(){clickOn(Sort);}
    public void clickonSortPrice(){clickOn(SortPrice);}

    public boolean SortByPrice(){
        waitFor(listOfProducts.get(0));
        for(WebElementFacade element : listOfProducts){
            //if(element.findElement(By.cssSelector("")) < element.findElement(By.cssSelector("")));
        }
        return true;
    }

    public boolean openProduct(String name){
        waitFor(listOfProducts.get(0));
        for (WebElementFacade element : listOfProducts){
            if (element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(name)){
                element.findElement(By.cssSelector("a")).click();
                return true;
            }
        }
        return false;
    }
}
