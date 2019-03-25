package danning.cubecart.stepdefs;

import cucumber.api.java8.En;
import danning.cubecart.RunCukeTest;
import org.junit.Assert;

public class LoginStepdefs extends RunCukeTest implements En {
  private String username;
  private String password;

  public LoginStepdefs() {

    Given("^valid username and password$", () -> {
      username = lib.get("username");
      password = lib.get("password");
    });

    When("^user enters the username and password$", () -> {
      loginPage.setUsernameInputBox(username);
      loginPage.setPasswordInputBox(password);
    });

    And("^user clicks on login button$", () -> {
      loginPage.clickOnLoginBtn();
    });

    Then("^user should see the admin control panel$", () -> {
      Assert.assertTrue(adminControlPanelPage.isNavigationDisplayed());
    });

  }
}
