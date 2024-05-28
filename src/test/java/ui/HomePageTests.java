package ui;

import data.Constants;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pages.HomePage;

public class HomePageTests extends BaseTest {

    @Test
    public void verifyHomePageBiographyCategoryTest() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.verifyBiographyCategoryIsThere());
        String actualCategoryText = homePage.getBiographyCategoryText();
        String expectedCategoryText = Constants.BIOGRAPHY_BUTTON_TEXT;
        Assertions.assertEquals(expectedCategoryText, actualCategoryText);
    }

    @Test
    public void verifyHomePageFictionCategoryTest() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.verifyFictionCategoryIsThere());
        String actualCategoryText = homePage.getFictionCategoryText();
        String expectedCategoryText = Constants.FICTION_BUTTON_TEXT;
        Assertions.assertEquals(expectedCategoryText, actualCategoryText);
    }

    @Test
    public void verifyHomePageMysteryCategoryTest() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.verifyMysteryCategoryIsThere());
        String actualCategory = homePage.getMysteryCategoryText();
        String expectedCategory = Constants.MYSTERY_BUTTON_TEXT;
        Assertions.assertEquals(expectedCategory, actualCategory);
    }

    @Test
    public void verifyHomePageFantasyCategoryTest() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.verifyFantasyCategoryIsThere());
        String actualCategory = homePage.getFantasyCategoryText();
        String expectedCategory = Constants.FANTASY_BUTTON_TEXT;
        Assertions.assertEquals(expectedCategory, actualCategory);
    }

    @Test
    public void verifyHomePageRomanceCategoryTest() {
        HomePage homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.verifyRomanceCategoryIsThere());
        String actualCategory = homePage.getRomanceCategoryText();
        String expectedCategory = Constants.ROMANCE_BUTTON_TEXT;
        Assertions.assertEquals(expectedCategory, actualCategory);
    }
}
