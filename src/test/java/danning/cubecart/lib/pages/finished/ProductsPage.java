package danning.cubecart.lib.pages.finished;

import danning.cubecart.lib.pages.root.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends CommonPage {
  @FindBy(xpath = "//a[contains(text(),'Add Product')]")
  private WebElement addProductLink;

  public void clicksOnAddproductLink() {
    clicksOn(addProductLink);
  }

  public ProductsPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  @FindBy(id = "name")
  private WebElement productName;

  public void setProductName(String name) {
    sendKeys(productName, name);
  }

  @FindBy(id = "manufacturer")
  private WebElement manufacturer;

  public void setManufacturer(String name) {
    selectVisibleText(manufacturer, name);
  }

  @FindBy(id = "condition")
  private WebElement condition;

  public void setCondition(String name) {
    selectVisibleText(condition, name);
  }

  @FindBy(id = "product_weight")
  private WebElement product_weight;

  public void setProduct_weight(String name) {
    sendKeys(product_weight, name);
  }

  @FindBy(id = "dimension_unit")
  private WebElement dimension_unit;

  public void setDimension_unit(String name) {
    selectVisibleText(dimension_unit, name);
  }

  @FindBy(id = "product_width")
  private WebElement product_width;

  public void setProduct_width(String name) {
    sendKeys(product_width, name);
  }

  @FindBy(id = "product_height")
  private WebElement product_height;

  public void setProduct_height(String name) {
    sendKeys(product_height, name);
  }

  @FindBy(id = "product_depth")
  private WebElement product_depth;

  public void setProduct_depth(String name) {
    sendKeys(product_depth, name);
  }

  @FindBy(id = "stock_level")
  private WebElement stock_level;

  public void setStock_level(String name) {
    sendKeys(stock_level, name);
  }

  @FindBy(id = "stock_warning")
  private WebElement stock_warning;

  public void setStock_warning(String name) {
    sendKeys(stock_warning, name);
  }


  public void fillGeneralTag(String productName, String manufacturer, String condition, String product_weight,
                             String dimension_unit, String product_width, String product_height, String product_depth,
                             String stock_level, String stock_warning, String google_category) {
    setProductName(productName);
    setManufacturer(manufacturer);
    setCondition(condition);
    setProduct_weight(product_weight);
    setDimension_unit(dimension_unit);
    setProduct_width(product_width);
    setProduct_height(product_height);
    setProduct_depth(product_depth);
    setStock_level(stock_level);
    setStock_warning(stock_warning);
  }

  /**
   * @DescriptionTab
   */
  @FindBy(id = "tab_description")
  private WebElement tab_description;

  public void clicksOnDescriptionTab() {
    clicksOn(tab_description);
  }

  @FindBy(xpath = "//div[@id='cke_1_contents']//iframe")
  private WebElement descriptionTextInputFrame;
  @FindBy(xpath = "//div[@id='cke_1_contents']//iframe")
  private WebElement ShortDescriptionTextInputFrame;
  @FindBy(xpath = "//html/body")
  private WebElement textInputField;

  public void setDescription(String content) {
    driver.switchTo().frame(descriptionTextInputFrame);
    sendKeys(textInputField, content);
    driver.switchTo().parentFrame();
  }

  public void setShortDescription(String content) {
    driver.switchTo().frame(ShortDescriptionTextInputFrame);
    sendKeys(textInputField, content);
    driver.switchTo().parentFrame();
  }
  public void fillDescription(String description,String shortDescription){
    setDescription(description);
    setShortDescription(shortDescription);
  }

  /**
   * @Pricing
   */

  @FindBy(id = "tab_pricing")
  private WebElement tab_pricing;

  public void clicksOnPricingTab() {
    clicksOn(tab_pricing);
  }

  @FindBy(id = "price")
  private WebElement price;

  public void setPrice(String number) {
    sendKeys(price, number);
  }

  @FindBy(id = "sale_price")
  private WebElement sale_price;

  public void setSalePrice(String number) {
    sendKeys(sale_price, number);
  }

  @FindBy(id = "cost_price")
  private WebElement cost_price;

  public void setCostPrice(String number) {
    sendKeys(cost_price, number);
  }

  @FindBy(id = "tax_type")
  private WebElement tax_type;

  public void setTaxType(String name) {
    selectVisibleText(tax_type, name);
  }
  @FindBy(id = "minimum_quantity")
  private WebElement minimum_quantity;
  public void setMinimumQuantity(String number){
    sendKeys(minimum_quantity,number);
  }
  @FindBy(xpath = "//input[@value='Save']")
  private WebElement saveBtn;
  public void clicksOnSaveBtn(){
    clicksOn(saveBtn);
  }
  public void fillPricingTab(String price,String sale_price,String cost_price,String tax_type,String minimum_quantity){
    setPrice(price);
    setSalePrice(sale_price);
    setCostPrice(cost_price);
    setTaxType(tax_type);
    setMinimumQuantity(minimum_quantity);
  }
  @FindBy(className = "success")
  private WebElement infoText;
  public boolean isCategorySuccessfulCreated() {
    waitUntilElementIsPresent(infoText);
    if (infoText.getText().equals("Product successfully created."))
      return true;
    else
      return false;
  }
  //part2
  private WebElement productLink;
  public boolean isProductExist(String name){
    productLink = driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]"));
    return productLink.isDisplayed();
  }

  public void clicksOnProductLink(){
    clicksOn(productLink);
  }
  @FindBy(id = "tab_category")
  private WebElement tab_category;
  public void clicksOnCategoryTab(){
    clicksOn(tab_category);
  }
  private WebElement targetCategory;
  public void clicksOnCategoryCheckBox(String name){
    targetCategory = findElement(By.xpath("//td[contains(text(),'"+name+"')]/..//input"));
    clicksOn(targetCategory);
  }
  public boolean isCategorySuccessfulUpdated() {
    waitUntilElementIsPresent(infoText);
    if (infoText.getText().equals("Product successfully updated."))
      return true;
    else
      return false;
  }
}
