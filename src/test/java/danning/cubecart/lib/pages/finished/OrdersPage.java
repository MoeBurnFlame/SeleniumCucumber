package danning.cubecart.lib.pages.finished;

import danning.cubecart.lib.pages.root.CommonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage extends CommonPage {
  public OrdersPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  /**
   * @Create Order
   */
  @FindBy(xpath = "//a[contains(text(),'Create Order')]")
  private WebElement createOrderLink;

  public void clicksOnCreateOrderLink() {
    clicksOn(createOrderLink);
  }
  public boolean isCreateOrderLinkVisible(){
    return isDisplayed(createOrderLink);
  }

  @FindBy(xpath = "//a[contains(text(),'Billing')]")
  private WebElement billingLink;

  public void clicksOnBillingLink() {
    clicksOn(billingLink);
  }

  /**
   * @billing
   */
  @FindBy(id = "sum_name")
  private WebElement sum_name;
  @FindBy(id = "ajax_title")
  private WebElement ajax_title;
  @FindBy(id = "ajax_first_name")
  private WebElement ajax_first_name;
  @FindBy(id = "ajax_last_name")
  private WebElement ajax_last_name;
  @FindBy(id = "sum_company_name")
  private WebElement sum_company_name;
  @FindBy(id = "sum_line1")
  private WebElement sum_line1;
  @FindBy(id = "sum_line2")
  private WebElement sum_line2;
  @FindBy(id = "sum_town")
  private WebElement sum_town;
  @FindBy(id = "sum_country")
  private WebElement sum_country;
  @FindBy(id = "sum_state")
  private WebElement sum_state;
  @FindBy(id = "sum_postcode")
  private WebElement sum_postcode;
  @FindBy(id = "ajax_email")
  private WebElement ajax_email;
  @FindBy(id = "ajax_phone")
  private WebElement ajax_phone;
  @FindBy(id = "ajax_mobile")
  private WebElement ajax_mobile;

  public void setSum_name(String name) {
    sendKeys(sum_name, name);
  }

  public void setAjax_title(String name) {
    sendKeys(ajax_title, name);
  }

  public void setAjax_first_name(String name) {
    sendKeys(ajax_first_name, name);
  }

  public void setAjax_last_name(String name) {
    sendKeys(ajax_last_name, name);
  }

  public void setSum_company_name(String name) {
    sendKeys(sum_company_name, name);
  }

  public void setSum_line1(String name) {
    sendKeys(sum_line1, name);
  }

  public void setSum_line2(String name) {
    sendKeys(sum_line2, name);
  }

  public void setSum_town(String name) {
    sendKeys(sum_town, name);
  }

  public void setSum_country(String name) {
    selectVisibleText(sum_country, name);
  }

  public void setSum_state(String name) {
    selectVisibleText(sum_state, name);
  }

  public void setSum_postcode(String name) {
    sendKeys(sum_postcode, name);
  }

  public void setAjax_email(String name) {
    sendKeys(ajax_email, name);
  }

  public void setAjax_phone(String name) {
    sendKeys(ajax_phone, name);
  }

  public void setAjax_mobile(String name) {
    sendKeys(ajax_mobile, name);
  }

  @FindBy(xpath = "//input[@value='Save']")
  private WebElement saveBtn;

  public void clicksOnSaveBtn() {
    clicksOn(saveBtn);
  }

  public void fill_billing(String order_findCustomers, String order_title, String order_firstName
          , String order_lastName, String order_companyName, String order_addressLine1
          , String order_addressLine2, String order_townOrCity, String order_country, String order_county
          , String order_postcode, String order_email, String order_phone, String order_mobile) {
    setSum_name(order_findCustomers);
    setAjax_title(order_title);
    setAjax_first_name(order_firstName);
    setAjax_last_name(order_lastName);
    setSum_company_name(order_companyName);
    setSum_line1(order_addressLine1);
    setSum_line2(order_addressLine2);
    setSum_town(order_townOrCity);
    setSum_country(order_country);
    setSum_state(order_county);
    setSum_postcode(order_postcode);
    setAjax_email(order_email);
    setAjax_phone(order_phone);
    setAjax_mobile(order_mobile);
  }

  /**
   * @delivery
   */
  @FindBy(xpath = "//a[contains(text(),'Delivery')]")
  private WebElement deliveryLink;

  public void clicksOnDeliveryLink() {
    clicksOn(deliveryLink);
  }
  @FindBy(id = "d_ajax_title")
  private WebElement d_ajax_title;
  @FindBy(id = "d_ajax_first_name")
  private WebElement d_ajax_first_name;
  @FindBy(id = "d_ajax_last_name")
  private WebElement d_ajax_last_name;
  @FindBy(id = "d_sum_company_name")
  private WebElement d_sum_company_name;
  @FindBy(id = "d_sum_line1")
  private WebElement d_sum_line1;
  @FindBy(id = "d_sum_line2")
  private WebElement d_sum_line2;
  @FindBy(id = "d_sum_town")
  private WebElement d_sum_town;
  @FindBy(id = "d_sum_country")
  private WebElement d_sum_country;
  @FindBy(id = "d_sum_state")
  private WebElement d_sum_state;
  @FindBy(id = "d_sum_postcode")
  private WebElement d_sum_postcode;
  @FindBy(id = "sum_ship_date")
  private WebElement sum_ship_date;
  @FindBy(id = "sum_ship_method")
  private WebElement sum_ship_method;
  @FindBy(id = "sum_ship_product")
  private WebElement sum_ship_product;
  @FindBy(id = "sum_ship_tracking")
  private WebElement sum_ship_tracking;
  @FindBy(id = "sum_weight")
  private WebElement sum_weight;

  public void setD_ajax_title(String name) {
    sendKeys(d_ajax_title, name);
  }

  public void setD_ajax_first_name(String name) {
    sendKeys(d_ajax_first_name, name);
  }

  public void setD_ajax_last_name(String name) {
    sendKeys(d_ajax_last_name, name);
  }

  public void setD_sum_company_name(String name) {
    sendKeys(d_sum_company_name, name);
  }

  public void setD_sum_line1(String name) {
    sendKeys(d_sum_line1, name);
  }

  public void setD_sum_line2(String name) {
    sendKeys(d_sum_line2, name);
  }

  public void setD_sum_town(String name) {
    sendKeys(d_sum_town, name);
  }

  public void setD_sum_country(String name) {
    selectVisibleText(d_sum_country, name);
  }

  public void setD_sum_state(String name) {
    selectVisibleText(d_sum_state, name);
  }

  public void setD_sum_postcode(String name) {
    sendKeys(d_sum_postcode, name);
  }

  public void setSum_ship_date(String name) {
    sendKeys(sum_ship_date, name);
  }

  public void setSum_ship_method(String name) {
    sendKeys(sum_ship_method, name);
  }

  public void setSum_ship_product(String name) {
    sendKeys(sum_ship_product, name);
  }

  public void setSum_ship_tracking(String name) {
    sendKeys(sum_ship_tracking, name);
  }

  public void setSum_weight(String name) {
    sendKeys(sum_weight, name);
  }

  public void fill_delivery(String del_title, String del_firstName
          , String del_lastName, String del_companyName, String del_addressLine1
          , String del_addressLine2, String del_townOrCity, String del_country, String del_county
          , String del_postcode,String del_dispatchDate,String del_shippingMethod
          ,String del_shippingProduct,String del_deliveryTracking,String del_weight) {
    setD_ajax_title(del_title);
    setD_ajax_first_name(del_firstName);
    setD_ajax_last_name(del_lastName);
    setD_sum_company_name(del_companyName);
    setD_sum_line1(del_addressLine1);
    setD_sum_line2(del_addressLine2);
    setD_sum_town(del_townOrCity);
    setD_sum_country(del_country);
    setD_sum_state(del_county);
    setD_sum_postcode(del_postcode);
    setSum_ship_date(del_dispatchDate);
    setSum_ship_method(del_shippingMethod);
    setSum_ship_product(del_shippingProduct);
    setSum_ship_tracking(del_deliveryTracking);
    setSum_weight(del_weight);
  }
  @FindBy(xpath = "//a[contains(text(),'Inventory')]")
  private WebElement inventoryLink;

  public void clicksOnInventoryLink() {
    clicksOn(inventoryLink);
  }
  @FindBy(id = "ajax_name")
  private WebElement ajax_name;
  public void setAjax_name(String name){
    sendKeys(ajax_name,name);
  }
  @FindBy(xpath = "//a[@target='inventory-list']/i")
  private WebElement addLink;
  public void clicksOnAddLink(){
    clicksOn(addLink);
  }
  @FindBy(className = "success")
  private WebElement infoText;
  public boolean isOrderSuccessfulCreated() {
    waitUntilElementIsPresent(infoText);
    if (infoText.getText().equals("Order successfully created."))
      return true;
    else
      return false;
  }
  /**
   * @search
   */
  @FindBy(xpath = "//a[contains(text(),'Search Orders')]")
  private WebElement searchOrdersLink;

  public void clicksOnSearchOrdersLink() {
    clicksOn(searchOrdersLink);
  }
  @FindBy(id = "search_status")
  private WebElement orderStatus;
  public void setOrderStatus(String name){
    selectVisibleText(orderStatus,name);
  }
  public boolean isOrderSuccessfulFunded() {
    waitUntilElementIsPresent(infoText);
    if (infoText.getText().equals("Orders have been found that match your search criteria."))
      return true;
    else
      return false;
  }
  @FindBy(xpath = "//input[@value='Search']")
  private WebElement searchBtn;

  public void clicksOnSearchBtn() {
    clicksOn(searchBtn);
  }
}
