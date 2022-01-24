package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa2.fasttrackit.org:8008")
public class HomePage extends BasePage {




        @FindBy(css = "#menu-item-64 > a:nth-child(1)")
        private WebElementFacade accountLink;

        public void clickAccountLink() {
            clickOn(accountLink);
        }


}
