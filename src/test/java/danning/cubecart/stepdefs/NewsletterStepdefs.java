package danning.cubecart.stepdefs;

import cucumber.api.java8.En;
import danning.cubecart.RunCukeTest;
import org.junit.Assert;

public class NewsletterStepdefs extends RunCukeTest implements En {
  private String subject,senderName,senderEmail,newsletterContents;
  public NewsletterStepdefs() {
    Given("^user is on the newsletter page, and data are given$", () -> {
      subject = lib.get("subject");
      senderName = lib.get("senderName");
      senderEmail = lib.get("senderEmail");
      newsletterContents = lib.get("newsletterContents");
      adminControlPanelPage.clicksOn_newslettersLink();
    });
    When("^user creates a new newsletter$", () -> {
      newsletterPage.clicksOnCreateNewsletterLink();
      newsletterPage.fill(subject,senderName,senderEmail,newsletterContents);
    });
    Then("^user can see a new newsletter was created$", () -> {
      Assert.assertTrue(newsletterPage.isNewsletterSuccessfulCreated());
    });
  }
}
