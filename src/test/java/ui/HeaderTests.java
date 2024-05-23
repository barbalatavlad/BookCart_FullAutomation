package ui;

import data.Constants;
import data.ErrorMessages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pages.HeaderPage;

public class HeaderTests extends BaseTest {

    @Test
    public void verifyHeaderColourTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        String actualColour = headerPage.getHeaderColor();
        String expectedColour = Constants.BLUE_COLOR;
        Assertions.assertEquals(expectedColour, actualColour, ErrorMessages.INCORRECT_COLOR);
    }

    @Test
    public void verifyHeaderHomebuttonTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        boolean actualIsButtonDisplayed = headerPage.verifyHomebuttonIsThere();
        boolean expectedIsButtonDisplayed = true;
        Assertions.assertEquals(expectedIsButtonDisplayed, actualIsButtonDisplayed);
        Assertions.assertTrue(actualIsButtonDisplayed);
        String actualButtonText = headerPage.getHomebuttonText();
        String expectedButtonText = Constants.BOOK_CART_BUTTON_TEXT;
        Assertions.assertEquals(expectedButtonText, actualButtonText);
    }

    @Test
    public void verifyHeaderSearchbarTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        Assertions.assertTrue(headerPage.verifySearchbarIsThere());
        String actualSearchBarText = headerPage.getSearchBarText();
        String expectedSearchBarText = Constants.SEARCH_BAR_TEXT;
        Assertions.assertEquals(expectedSearchBarText, actualSearchBarText);
    }

    @Test
    public void verifyHeaderShoppingCartTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        Assertions.assertTrue(headerPage.verifyShoppingCartButtonIsThere());
    }

    @Test
    public void verifyHeaderLoginButtonTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        Assertions.assertTrue(headerPage.verifyLoginButtonIsThere());
        String actualLoginButtonText = headerPage.getLoginButtonText();
        String expectedLoginButtonText = Constants.LOGIN_BUTTON_TEXT;
        Assertions.assertEquals(expectedLoginButtonText, actualLoginButtonText);
    }

    @Test
    public void verifyHeaderApiButtonTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        Assertions.assertTrue(headerPage.verifyApiButtonIsThere());
        String actualApiButtonText = headerPage.getApiButtonText();
        String expectedApiButtonText = Constants.API_BUTTON_TEXT;
        Assertions.assertEquals(expectedApiButtonText, actualApiButtonText);
    }

    @Test
    public void VerifyHeaderGitButtonTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        Assertions.assertTrue(headerPage.verifyGitButtonIsThere());
        String actualGitButtonText = headerPage.getGitButtonText();
        String expectedGitButtonText = Constants.GIT_BUTTON_TEXT;
        Assertions.assertEquals(expectedGitButtonText, actualGitButtonText);
    }

    @Test
    public void verifyHowManyBooksAre() {
        HeaderPage headerPage = new HeaderPage(driver);
        System.out.println(headerPage.getAllBooksNumberFromHomepage());
        Assertions.assertEquals(45, headerPage.getAllBooksNumberFromHomepage());
    }
}
