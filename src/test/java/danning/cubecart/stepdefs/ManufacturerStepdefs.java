package danning.cubecart.stepdefs;

import cucumber.api.java8.En;
import danning.cubecart.RunCukeTest;
import org.junit.Assert;

public class ManufacturerStepdefs extends RunCukeTest implements En {
  private String manufacturerName,manufacturerUrl;
  public ManufacturerStepdefs() {
    Given("^user is on the manufacturer page, and data are given$", () -> {
      manufacturerName=lib.get("manufacturerName");
      manufacturerUrl=lib.get("manufacturerUrl");
      adminControlPanelPage.clicksOn_manufacturersLink();
      manufacturerPage.clicksOnAddManufacturerLink();
    });

    When("^user adds a manufacture$", () -> {
      manufacturerPage.setManu_name(manufacturerName);
      manufacturerPage.setManu_site(manufacturerUrl);
      manufacturerPage.clicksOnSubmitBtn();
    });

    Then("^user can see a new manufacture was created$", () -> {
      Assert.assertTrue(manufacturerPage.isManufacturerSuccessfulAdded());
    });

  }
}
