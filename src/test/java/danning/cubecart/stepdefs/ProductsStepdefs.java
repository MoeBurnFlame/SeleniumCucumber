package danning.cubecart.stepdefs;

import cucumber.api.java8.En;
import danning.cubecart.RunCukeTest;
import org.junit.Assert;

public class ProductsStepdefs extends RunCukeTest implements En {
  //Instance variables
  private String productName, productManufacturer, productCondition, productWeight, productDimensionUnit, productWidth,
          productHeight, productDepth, productStockLevel, productStockLevelWarning, productGoogleCategory,
          productDescription, productShortDescription, productRetailPrice, productSalePrice, productCostPrice,
          productTaxClass, productMinimumQuantityPurchase, productDiscountQuantity, productDiscountPrice, productCategory;

  public ProductsStepdefs() {
    Given("^user is on products page and data is given$", () -> {
      productName = lib.get("productName");
      productManufacturer = lib.get("productManufacturer");
      productCondition = lib.get("productCondition");
      productWeight = lib.get("productWeight");
      productDimensionUnit = lib.get("productDimensionUnit");
      productWidth = lib.get("productWidth");
      productHeight = lib.get("productHeight");
      productDepth = lib.get("productDepth");
      productStockLevel = lib.get("productStockLevel");
      productStockLevelWarning = lib.get("productStockLevelWarning");
      productDescription = lib.get("productDescription");
      productShortDescription = lib.get("productShortDescription");
      productRetailPrice = lib.get("productRetailPrice");
      productSalePrice = lib.get("productSalePrice");
      productCostPrice = lib.get("productCostPrice");
      productTaxClass = lib.get("productTaxClass");
      productMinimumQuantityPurchase = lib.get("productMinimumQuantityPurchase");
      //productDiscountQuantity = lib.get("productDiscountQuantity");
      //productDiscountPrice = lib.get("productDiscountPrice");

      adminControlPanelPage.clicksOn_productsLink();
      productsPage.clicksOnAddproductLink();
    });

    When("^user fills product  general tab$", () -> {
      productsPage.fillGeneralTag(productName, productManufacturer, productCondition, productWeight
              , productDimensionUnit, productWidth, productHeight, productDepth, productStockLevel
              , productStockLevelWarning, productGoogleCategory);
    });

    And("^user fills product description tab$", () -> {
      productsPage.clicksOnDescriptionTab();
      productsPage.fillDescription(productDescription, productShortDescription);
    });

    And("^user fills product pricing tab$", () -> {
      productsPage.clicksOnPricingTab();
      productsPage.fillPricingTab(productRetailPrice, productSalePrice, productCostPrice, productTaxClass, productMinimumQuantityPurchase);
    });
    And("^user clicks on save button for add product$", () -> {
      productsPage.clicksOnSaveBtn();
    });
    Then("^user can see a new product was created$", () -> {
      Assert.assertTrue(productsPage.isCategorySuccessfulCreated());
    });

    /**
     * @addProductCategories
     */
    Given("^user can see the products and have categories name for assignment$", () -> {
      productName = lib.get("productName");
      productCategory = lib.get("productCategory");
      Assert.assertTrue(productsPage.isProductExist(productName));
    });
    When("^user open the product and Categories Tag$", () -> {
      productsPage.clicksOnProductLink();
      productsPage.clicksOnCategoryTab();
    });
    And("^user choose a categories and clicks on save$", () -> {
      productsPage.clicksOnCategoryCheckBox(productCategory);
      productsPage.clicksOnSaveBtn();
    });
    Then("^user can see product was successfully updated$", () -> {
      Assert.assertTrue(productsPage.isCategorySuccessfulUpdated());
    });
  }
}
