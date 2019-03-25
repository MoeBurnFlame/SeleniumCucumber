package danning.cubecart.lib.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CubeCartLib {
  //general
  @JsonProperty
  private String url = "https://demo.cubecart.com/cc6/admin_5xArPd.php";
  @JsonProperty
  private String username = "cubecart";
  @JsonProperty
  private String password = "cubecart";

  //category
  @JsonProperty
  private String categoryName = "Selenium Master";
  @JsonProperty
  private String categoryDescription = "This is a description.";

  //product
  //General
  @JsonProperty
  private String productName = "Selenium Master Product";
  @JsonProperty
  private String productManufacturer = "Sony";
  @JsonProperty
  private String productCondition = "Refurbished";
  @JsonProperty
  private String productWeight = "12";
  @JsonProperty
  private String productDimensionUnit = "Inches (in)";
  @JsonProperty
  private String productWidth = "12";
  @JsonProperty
  private String productHeight = "12";
  @JsonProperty
  private String productDepth = "12";
  @JsonProperty
  private String productStockLevel = "12";
  @JsonProperty
  private String productStockLevelWarning = "13";
  //
  @JsonProperty
  private String productDescription = "This is a test Product.";
  @JsonProperty
  private String productShortDescription = "SM Test";
  @JsonProperty
  private String productRetailPrice = "12";
  @JsonProperty
  private String productSalePrice = "12";
  @JsonProperty
  private String productCostPrice = "12";
  @JsonProperty
  private String productTaxClass = "Standard Tax";
  @JsonProperty
  private String productMinimumQuantityPurchase = "12";
  /*
  @JsonProperty
  private String productDiscountQuantity = "24";
  @JsonProperty
  private String productDiscountPrice = "250";
  */
  @JsonProperty
  private String productCategory = "Hi-Fi";
  /**
   * @Manufacturer
   */
  @JsonProperty
  private String manufacturerName = "SeleniumAutomation";
  @JsonProperty
  private String manufacturerUrl = "https://www.seleniumhq.org/";

  /**
   * @BulkPriceChange
   */
  @JsonProperty
  private String bulkPriceTarget = "Update selected products";
  @JsonProperty
  private String bulkPriceMethod = "By Amount";
  @JsonProperty
  private String bulkPriceAction = "Add";
  @JsonProperty
  private String bulkPriceField = "Retail Price";
  @JsonProperty
  private String bulkPriceAmount = "5";
  @JsonProperty
  private String targetProductsName = "3D Glasses TDG-BR200/W";

  /**
   * @PromotianalCode
   */
  @JsonProperty
  private String codeName = "seleniumCode";
  @JsonProperty
  private String codeDescription = "test description";
  @JsonProperty
  private String discountType = "Percentage Discount";
  @JsonProperty
  private String discountValue = "25";
  @JsonProperty
  private String codeExpires = "";
  @JsonProperty
  private String codeAllowedUses = "";
  @JsonProperty
  private String codeMinimumSubtotal = "";
  @JsonProperty
  private String discountAppliesToShippingCost = "false";
  @JsonProperty
  private String FreeShipping = "true";
  @JsonProperty
  private String orderNumber = "";

  /**
   * @order_billing
   */
  @JsonProperty
  private String order_findCustomers = "Bill J Owens";
  @JsonProperty
  private String order_title = "Test Equipment";
  @JsonProperty
  private String order_firstName = "Bill";
  @JsonProperty
  private String order_lastName = "Owens";
  @JsonProperty
  private String order_companyName = "Perisolution";
  @JsonProperty
  private String order_addressLine1 = "1234 Wizzhood Dr";
  @JsonProperty
  private String order_addressLine2 = "";
  @JsonProperty
  private String order_townOrCity = "Hattiesburg";
  @JsonProperty
  private String order_country = "United States";
  @JsonProperty
  private String order_county = "Mississippi";
  @JsonProperty
  private String order_postcode = "39402";
  @JsonProperty
  private String order_email = "bettie2007@hotmail.com";
  @JsonProperty
  private String order_phone = "6012446056";
  @JsonProperty
  private String order_mobile = "6014341483";

  /**
   * @order_delivery
   */
  @JsonProperty
  private String del_title = "unknown";
  @JsonProperty
  private String del_firstName = "selenium";
  @JsonProperty
  private String del_lastName = "master";
  @JsonProperty
  private String del_companyName = "";
  @JsonProperty
  private String del_addressLine1 = "4422 Twitccz Ave";
  @JsonProperty
  private String del_addressLine2 = "";
  @JsonProperty
  private String del_townOrCity = "Hattiesburg";
  @JsonProperty
  private String del_country = "United States";
  @JsonProperty
  private String del_county = "Mississippi";
  @JsonProperty
  private String del_postcode = "Mississippi";
  @JsonProperty
  private String del_dispatchDate = "";
  @JsonProperty
  private String del_shippingMethod = "";
  @JsonProperty
  private String del_shippingProduct = "";
  @JsonProperty
  private String del_deliveryTracking = "";
  @JsonProperty
  private String del_weight = "";
  @JsonProperty
  private String order_inventoryProduct = "Sony KDL-32HX753 3D TV";
  @JsonProperty
  private String orderStatus = "Order Complete";

  /**
   * @store
   * ignore
   */

  /**
   * @newsletter
   */
  @JsonProperty
  private String subject = "Test";
  @JsonProperty
  private String senderName = "SM";
  @JsonProperty
  private String senderEmail = "sm@sm.com";
  @JsonProperty
  private String newsletterContents = "tttteeeesssstttt";

  public CubeCartLib() {

  }

}
