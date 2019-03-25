package danning.cubecart.lib.pages.finished;

import danning.cubecart.lib.pages.root.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BulkPriceChangePage extends CommonPage {
  public BulkPriceChangePage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }
  public void fill(String targetProductsName,String bulkPriceTarget,String bulkPriceMethod
          , String bulkPriceAction,String bulkPriceField,String bulkPriceAmount){
    clicksOnCheckBox(targetProductsName);
    setBulkPriceTarget(bulkPriceTarget);
    setBulkPriceMethod(bulkPriceMethod);
    setBulkPriceAction(bulkPriceAction);
    setPriceValue(bulkPriceAmount);
    setPriceField(bulkPriceField);
    clicksOnSaveBtn();
  }
  @FindBy(id = "bulk_price_target")
  private WebElement bulk_price_target;

  public void setBulkPriceTarget(String value) {
    selectVisibleText(bulk_price_target,value);
  }
  @FindBy(id = "bulk_price_method")
  private WebElement bulk_price_method;

  public void setBulkPriceMethod(String value) {
    selectVisibleText(bulk_price_method,value);
  }
  @FindBy(id = "bulk_price_action")
  private WebElement bulk_price_action;

  public void setBulkPriceAction(String value) {
    selectVisibleText(bulk_price_action,value);
  }
  @FindBy(name = "price[value]")
  private WebElement priceValue;
  public void setPriceValue(String value){
    sendKeys(priceValue,value);
  }
  @FindBy(name = "price[field]")
  private WebElement priceField;

  public void setPriceField(String value) {
    selectVisibleText(priceField,value);
  }
  private WebElement checkBox;
  public void clicksOnCheckBox(String name){
    checkBox = findElement(By.xpath("//td[contains(text(),'"+name+"')]/.."));
    clicksOn(checkBox);
  }
  @FindBy(xpath = "//input[@value='Save']")
  private WebElement saveBtn;
  public void clicksOnSaveBtn(){
    clicksOn(saveBtn);
  }

  @FindBy(className = "success")
  private WebElement infoText;
  public boolean isPriceUpdated() {
    waitUntilElementIsPresent(infoText);
    if (infoText.getText().equals("Prices have been updated accordingly."))
      return true;
    else
      return false;
  }
}
