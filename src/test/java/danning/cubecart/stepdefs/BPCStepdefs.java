package danning.cubecart.stepdefs;

import cucumber.api.java8.En;
import danning.cubecart.RunCukeTest;
import org.junit.Assert;

public class BPCStepdefs extends RunCukeTest implements En {
  private String bulkPriceTarget, bulkPriceMethod, bulkPriceAction, bulkPriceField, bulkPriceAmount, targetProductsName;

  public BPCStepdefs() {
    Given("^user is on the Bulk Price Change page, and data are given$", () -> {
      adminControlPanelPage.clicksOn_bulkPriceChangeLink();
      bulkPriceTarget = lib.get("bulkPriceTarget");
      bulkPriceMethod = lib.get("bulkPriceMethod");
      bulkPriceAction = lib.get("bulkPriceAction");
      bulkPriceField = lib.get("bulkPriceField");
      bulkPriceAmount = lib.get("bulkPriceAmount");
      targetProductsName = lib.get("targetProductsName");
    });
    When("^user updates the price$", () -> {
      bulkPriceChangePage.fill(targetProductsName,bulkPriceTarget
              ,bulkPriceMethod,bulkPriceAction,bulkPriceField,bulkPriceAmount);
    });
    Then("^user can see the price is updated$", () -> {
      Assert.assertTrue(bulkPriceChangePage.isPriceUpdated());
    });
  }
}
