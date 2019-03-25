package danning.cubecart.lib.pages.finished;

import danning.cubecart.lib.pages.root.CommonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManufacturerPage extends CommonPage {
  public ManufacturerPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = "//a[contains(text(),'Add Manufacturer')]")
  private WebElement addManufacturerLink;

  public void clicksOnAddManufacturerLink() {
    clicksOn(addManufacturerLink);
  }

  @FindBy(id = "manu_name")
  private WebElement manu_name;

  public void setManu_name(String name) {
    sendKeys(manu_name, name + System.currentTimeMillis());
  }

  @FindBy(id = "manu_site")
  private WebElement manu_site;

  public void setManu_site(String name) {
    sendKeys(manu_site, name);
  }

  @FindBy(xpath = "//input[@value='Submit']")
  private WebElement submitBtn;

  public void clicksOnSubmitBtn() {
    clicksOn(submitBtn);
  }
  @FindBy(className = "success")
  private WebElement infoText;
  public boolean isManufacturerSuccessfulAdded() {
    waitUntilElementIsPresent(infoText);
    if (infoText.getText().equals("Manufacturer added."))
      return true;
    else
      return false;
  }
}
