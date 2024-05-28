package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HeaderPage extends BasePage {

    @FindBy(css = ".mat-toolbar.mat-primary")
    WebElement headerColor;

    @FindBy(xpath = "//span[contains(text(),'Book Cart')]")
    WebElement homebutton;

    @FindBy(xpath = "//span[contains(text(),'Book Cart')]")
    WebElement homebuttonText;

    @FindBy(css = ".ng-untouched .mat-mdc-autocomplete-trigger")
    WebElement searchbar;

    @FindBy(xpath = "//input[@type='search']")
    WebElement searchbarText;

    @FindBy(css = ".mat-badge")
    WebElement shoppingCartButton;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    WebElement loginButtonText;

    @FindBy(xpath = "//span[contains(text(),'Swagger')]")
    WebElement apiButton;

    @FindBy(xpath = "//span[contains(text(),'Swagger')]")
    WebElement apiButtonText;

    @FindBy(xpath = "//span[contains(text(),' GitHub ')]")
    WebElement gitButton;

    @FindBy(xpath = "//span[contains(text(),' GitHub ')]")
    WebElement gitButtonText;


    public HeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getHeaderColor() {
        waitUntilElementIsDisplayed(headerColor);
        return headerColor.getCssValue("background");
    }

    public boolean verifyHomebuttonIsThere() {
        waitUntilElementIsDisplayed(homebutton);
        return homebutton.isDisplayed();
    }

    public String getHomebuttonText() {
        waitUntilElementIsDisplayed(homebuttonText);
        return homebuttonText.getText();
    }

    public boolean verifySearchbarIsThere() {
        waitUntilElementIsDisplayed(searchbar);
        return searchbar.isDisplayed();
    }

    public String getSearchBarText() {
        waitUntilElementIsDisplayed(searchbarText);
        return searchbarText.getText();
    }

    public boolean verifyShoppingCartButtonIsThere() {
        waitUntilElementIsDisplayed(shoppingCartButton);
        return shoppingCartButton.isDisplayed();
    }

    public boolean verifyLoginButtonIsThere() {
        waitUntilElementIsDisplayed(loginButton);
        return loginButton.isDisplayed();
    }

    public String getLoginButtonText() {
        waitUntilElementIsDisplayed(loginButtonText);
        return loginButtonText.getText();
    }

    public boolean verifyApiButtonIsThere() {
        waitUntilElementIsDisplayed(apiButton);
        return apiButton.isDisplayed();
    }

    public String getApiButtonText() {
        waitUntilElementIsDisplayed(apiButtonText);
        return apiButtonText.getText();
    }

    public boolean verifyGitButtonIsThere() {
        waitUntilElementIsDisplayed(gitButton);
        return gitButton.isDisplayed();
    }

    public String getGitButtonText() {
        waitUntilElementIsDisplayed(gitButtonText);
        return gitButtonText.getText();
    }

    public int getAllBooksNumberFromHomepage() {
        return driver.findElements(By.cssSelector(".p-1.ng-star-inserted")).size();
    }
}
