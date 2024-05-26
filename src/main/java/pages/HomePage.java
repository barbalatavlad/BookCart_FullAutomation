package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Biography')]")
    WebElement biographyCategory;

    @FindBy(xpath = "//a[contains(text(),'Fiction')]")
    WebElement fictionCategory;

    @FindBy(xpath = "//a[contains(text(),'Mystery')]")
    WebElement mysteryCategory;

    @FindBy(xpath = "//a[contains(text(),'Fantasy')]")
    WebElement fantasyCategory;

    @FindBy(xpath = "//a[contains(text(),'Romance')]")
    WebElement romanceCategory;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean verifyBiographyCategoryIsThere() {
        waitUntilElementIsDisplayed(biographyCategory);
        return biographyCategory.isDisplayed();
    }

    public String getBiographyCategoryText() {
        return biographyCategory.getText();
    }

    public boolean verifyFictionCategoryIsThere() {
        waitUntilElementIsDisplayed(fictionCategory);
        return fictionCategory.isDisplayed();
    }

    public String getFictionCategoryText() {
        return fictionCategory.getText();
    }

    public boolean verifyMysteryCategoryIsThere() {
        waitUntilElementIsDisplayed(mysteryCategory);
        return mysteryCategory.isDisplayed();
    }

    public String getMysteryCategoryText() {
        return mysteryCategory.getText();
    }

    public boolean verifyFantasyCategoryIsThere() {
        waitUntilElementIsDisplayed(fantasyCategory);
        return fantasyCategory.isDisplayed();
    }

    public String getFantasyCategoryText() {
        return fantasyCategory.getText();
    }

    public boolean verifyRomanceCategoryIsThere() {
        waitUntilElementIsDisplayed(romanceCategory);
        return romanceCategory.isDisplayed();
    }

    public String getRomanceCategoryText() {
        return romanceCategory.getText();
    }
}
