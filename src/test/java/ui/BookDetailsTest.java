package ui;

import data.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BookDetailsPage;
import pages.HomePage;

public class BookDetailsTest extends BaseTest{

    @Test
    public void verifySimilarBookTitleTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clickHpThePrisoner();
        BookDetailsPage bookDetailsPage = new BookDetailsPage(driver);
        Assertions.assertTrue(bookDetailsPage.verifySimilarBooksTitleIsThere());
        String expectedTitleText = Constants.TITLE_TEXT;
        String actualTitleText = bookDetailsPage.getTitleText();
        Assertions.assertEquals(expectedTitleText,actualTitleText);
    }
}
