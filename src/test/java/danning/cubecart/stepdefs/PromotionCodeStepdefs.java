package danning.cubecart.stepdefs;

import cucumber.api.java8.En;
import danning.cubecart.RunCukeTest;
import org.junit.Assert;

public class PromotionCodeStepdefs extends RunCukeTest implements En {
  private String codeName, codeDescription, discountType, discountValue, codeExpires, codeAllowedUses
          , codeMinimumSubtotal, discountAppliesToShippingCost, FreeShipping, orderNumber;

  public PromotionCodeStepdefs() {
    Given("^user is on the promotional code page, and data are given$", () -> {
      codeName = lib.get("codeName");
      codeDescription = lib.get("codeDescription");
      discountType = lib.get("discountType");
      discountValue = lib.get("discountValue");
      codeExpires = lib.get("codeExpires");
      codeAllowedUses = lib.get("codeAllowedUses");
      codeMinimumSubtotal = lib.get("codeMinimumSubtotal");
      discountAppliesToShippingCost = lib.get("discountAppliesToShippingCost");
      FreeShipping = lib.get("FreeShipping");
      orderNumber = lib.get("orderNumber");
      adminControlPanelPage.clicksOn_promotionalCodesLink();
    });
    When("^user adds a new promotional code$", () -> {
      promotionalCodePage.clicksOnCreatePromotionalCodeLink();
      promotionalCodePage.fill(codeName, codeDescription, discountType, discountValue, codeExpires, codeAllowedUses
              , codeMinimumSubtotal, discountAppliesToShippingCost, FreeShipping, orderNumber);
    });
    Then("^user can see a new promotional code was created$", () -> {
      Assert.assertTrue(promotionalCodePage.isPromotionalCodeAdded());
    });
  }
}
