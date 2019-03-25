package danning.cubecart.lib.pages.finished;

import danning.cubecart.lib.pages.root.CommonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminControlPanelPage extends CommonPage {

  public AdminControlPanelPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(this.driver, this);
  }

  @FindBy(xpath = "//a[contains(text(),'Log Out')]")
  private WebElement logoutLink;

  public void clickOnLoginoutLink() {
    clicksOn(logoutLink);
  }

  @FindBy(id = "navigation")
  private WebElement navigationPanel;

  public boolean isNavigationDisplayed() {
    waitUntilElementIsPresent(navigationPanel);
    return navigationPanel.isDisplayed();
  }

  @FindBy(id = "Inventory")
  private WebElement inventoryTab;
  @FindBy(id = "menu_Inventory")
  private WebElement inventoryMenu;
  @FindBy(id = "nav_categories")
  private WebElement categoriesLink;

  @FindBy(id = "nav_products")
  private WebElement productsLink;
  @FindBy(xpath = "//ul[@id='menu_Inventory']/li/a[contains(text(),'Manufacturers')]")
  private WebElement manufacturersLink;
  @FindBy(xpath = "//ul[@id='menu_Inventory']/li/a[contains(text(),'Bulk Price Change')]")
  private WebElement bulkPriceChangeLink;
  @FindBy(xpath = "//ul[@id='menu_Inventory']/li/a[contains(text(),'Promotional Codes')]")
  private WebElement promotionalCodesLink;

  public void clicksOn_categoriesLink() {
    clicksOn(categoriesLink);
  }

  public void clicksOn_productsLink() {
    clicksOn(productsLink);
  }

  public void clicksOn_manufacturersLink() {
    clicksOn(manufacturersLink);
  }

  public void clicksOn_bulkPriceChangeLink() {
    clicksOn(bulkPriceChangeLink);
  }

  public void clicksOn_promotionalCodesLink() {
    clicksOn(promotionalCodesLink);
  }

  @FindBy(id = "Customers")
  private WebElement customersTab;
  @FindBy(id = "menu_Customers")
  private WebElement customersMenu;
  @FindBy(xpath = "//ul[@id='menu_Customers']/li/a[contains(text(),'Orders')]")
  private WebElement ordersLink;
  @FindBy(xpath = "//ul[@id='menu_Customers']/li/a[contains(text(),'Newsletters')]")
  private WebElement newslettersLink;

  public void clicksOn_ordersLink() {
    clicksOn(ordersLink);
  }

  public void clicksOn_newslettersLink() {
    clicksOn(newslettersLink);
  }


  @FindBy(id = "Settings")
  private WebElement settingsTab;
  @FindBy(id = "menu_Settings")
  private WebElement settingsMenu;
  @FindBy(id = "nav_settings")
  private WebElement storeSettingsLink;

  public void clicksOn_storeSettingsLink() {
    clicksOn(storeSettingsLink);
  }

}
