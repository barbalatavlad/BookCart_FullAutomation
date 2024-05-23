package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HeaderPage extends BasePage {

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderColor() {
        return driver.findElement(By.cssSelector(".mat-toolbar.mat-primary")).getCssValue("background");
    }

    public boolean verifyHomebuttonIsThere() {
        return driver.findElement(By.xpath("//span[contains(text(),'Book Cart')]")).isDisplayed();
    }

    public String getHomebuttonText() {
        return driver.findElement(By.xpath("//span[contains(text(),'Book Cart')]")).getText();
    }

    public boolean verifySearchbarIsThere() {
        return driver.findElement(By.cssSelector(".ng-untouched .mat-mdc-autocomplete-trigger")).isDisplayed();
    }

    public String getSearchBarText() {
        return driver.findElement(By.xpath("//input[@type='search']")).getText();
    }

    public boolean verifyShoppingCartButtonIsThere() {
        return driver.findElement(By.cssSelector(".mat-badge")).isDisplayed();
    }

    public boolean verifyLoginButtonIsThere() {
        return driver.findElement(By.xpath("//span[contains(text(),'Login')]")).isDisplayed();
    }

    public String getLoginButtonText() {
        return driver.findElement(By.xpath("//span[contains(text(),'Login')]")).getText();
    }

    public boolean verifyApiButtonIsThere() {
        return driver.findElement(By.xpath("//span[contains(text(),'Swagger')]")).isDisplayed();
    }

    public String getApiButtonText() {
        return driver.findElement(By.xpath("//span[contains(text(),'Swagger')]")).getText();
    }

    public boolean verifyGitButtonIsThere() {
        return driver.findElement(By.xpath("//span[contains(text(),' GitHub ')]")).isDisplayed();
    }

    public String getGitButtonText() {
        return driver.findElement(By.xpath("//span[contains(text(),' GitHub ')]")).getText();
    }

    public int getAllBooksNumberFromHomepage() {
        return driver.findElements(By.cssSelector(".p-1.ng-star-inserted")).size();
    }


}
