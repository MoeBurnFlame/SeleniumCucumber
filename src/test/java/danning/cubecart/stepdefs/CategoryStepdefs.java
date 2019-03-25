package danning.cubecart.stepdefs;

import cucumber.api.java8.En;
import danning.cubecart.RunCukeTest;
import org.junit.Assert;

public class CategoryStepdefs extends RunCukeTest implements En {
  private String categoryName;
  private String categoryDescription;
  public CategoryStepdefs() {

    Given("^user can see the admin panel page with category name and description$", () -> {
        adminControlPanelPage.isNavigationDisplayed();
        categoryName=lib.get("categoryName");
        categoryDescription=lib.get("categoryDescription");
    });

    When("^user enters categories page and clicks on add categoryLink$", () -> {
      adminControlPanelPage.clicksOn_categoriesLink();
      categoryPage.clicksOnAddCategory();
    });

    And("^user fills general and description tabs$", () -> {
      categoryPage.fillCategoryInfo(categoryName,categoryDescription);
    });

    And("^user clicks on save button$", () -> {
      categoryPage.clicksOnSaveBtn();
    });

    Then("^user should see the category was successfully created$", () -> {
      Assert.assertTrue(categoryPage.isCategorySuccessfulCreated());
    });

    Given("^user can see the categories page$", () -> {
      categoryPage.isAddCategoryLinkDisplayed();
      categoryName=lib.get("categoryName");
    });

    When("^user clicks on delete link under existing category$", () -> {
      categoryPage.deleteCategory(categoryName);
    });

    Then("^user should see the category was successfully deleted$", () -> {
      Assert.assertTrue(categoryPage.isCategorySuccessfulDeleted());
    });

  }
}
