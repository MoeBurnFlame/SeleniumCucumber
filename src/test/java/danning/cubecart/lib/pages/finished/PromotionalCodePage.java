package danning.cubecart.lib.pages.finished;

import danning.cubecart.lib.pages.root.CommonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromotionalCodePage extends CommonPage {
  public PromotionalCodePage(WebDriver driver){
    super(driver);
    PageFactory.initElements(driver,this);
  }




  @FindBy(xpath = "//a[contains(text(),'Create Promotional Code')]")
  private WebElement createPromotionalCodeLink;
  public void clicksOnCreatePromotionalCodeLink(){
    clicksOn(createPromotionalCodeLink);
  }
  @FindBy(id = "form-code")
  private WebElement codeName;
  public void setCodeName(String name){
  sendKeys(codeName,name);
  }
  @FindBy(id = "form-description")
  private WebElement description;
  public void setDescription(String content){
    sendKeys(description,content);
  }

  @FindBy(id = "form-type")
  private WebElement formType;
  public void setFormType(String content){
    selectVisibleText(formType,content);
  }

  @FindBy(id = "form-value")
  private WebElement formValue;
  public void setFormValue(String content){
    sendKeys(formValue,content);
  }

  @FindBy(name = "coupon[expires]")
  private WebElement formExpires;
  public void setFormExpires(String content){
    sendKeys(formExpires,content);
  }

  @FindBy(id = "form-allowed")
  private WebElement formAllowed;
  public void setFormAllowed(String content){
    sendKeys(formAllowed,content);
  }

  @FindBy(id = "form-minimum")
  private WebElement formMinimum;
  public void setFormMinimum(String content){
    sendKeys(formMinimum,content);
  }

  @FindBy(xpath = "//img[@rel='#form-shipping']")
  private WebElement dasc;
  public void clickOnDiscountAppliesToShippingCostCheckBox(String b){
    if (b.equalsIgnoreCase("true"))
    clickAction(dasc);
  }
  @FindBy(xpath = "//img[@rel='#form-free_shipping']")
  private WebElement fs;
  public void clickOnFreeShippingCheckBox(String b){
    if (b.equalsIgnoreCase("true"))
    clickAction(fs);
  }

  @FindBy(name = "coupon[cart_order_id]")
  private WebElement orderNumber;
  public void setOrderNumber(String content){
    sendKeys(description,content);
  }
  @FindBy(xpath = "//input[@value='Save']")
  private WebElement saveBtn;
  public void clicksOnSaveBtn(){
    clicksOn(saveBtn);
  }

  @FindBy(className = "success")
  private WebElement infoText;
  public boolean isPromotionalCodeAdded() {
    waitUntilElementIsPresent(infoText);
    if (infoText.getText().equals("Promotional code added."))
      return true;
    else
      return false;
  }

  public void fill(String codeName,String codeDescription,String discountType,String discountValue
          ,String codeExpires,String codeAllowedUses,String codeMinimumSubtotal
          ,String discountAppliesToShippingCost,String FreeShipping,String orderNumber){
    setCodeName(codeName);
    setDescription(codeDescription);
    setFormType(discountType);
    setFormValue(discountValue);
    setFormExpires(codeExpires);
    setFormAllowed(codeAllowedUses);
    setFormMinimum(codeMinimumSubtotal);
    clickOnDiscountAppliesToShippingCostCheckBox(discountAppliesToShippingCost);
    clickOnFreeShippingCheckBox(FreeShipping);
    setOrderNumber(orderNumber);
    clicksOnSaveBtn();
  }
}
