package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookDetailsPage extends BasePage {
    public BookDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='mat-mdc-card-header-text'])[2]")
    WebElement similarBooksTitle;

    @FindBy(xpath = "(//div[@class='mat-mdc-card-header-text'])[2]")
    WebElement getSimilarBooksTitleText;

    public boolean verifySimilarBooksTitleIsThere() {
        return similarBooksTitle.isDisplayed();
    }

    public String getTitleText() {
        return getSimilarBooksTitleText.getText();
    }
}
