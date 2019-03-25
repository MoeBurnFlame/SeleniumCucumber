package danning.cubecart.stepdefs;

import cucumber.api.java8.En;
import danning.cubecart.RunCukeTest;
import org.junit.Assert;

public class OrderStepdefs extends RunCukeTest implements En {
  private String order_findCustomers,  order_title,  order_firstName
          ,  order_lastName,  order_companyName,  order_addressLine1
          ,  order_addressLine2,  order_townOrCity,  order_country,  order_county
          ,  order_postcode,  order_email,  order_phone,  order_mobile
    //----------           breaking line         -----------------------
          , del_title,  del_firstName,  del_lastName,  del_companyName,  del_addressLine1
          ,  del_addressLine2,  del_townOrCity,  del_country,  del_county
          ,  del_postcode, del_dispatchDate, del_shippingMethod
          , del_shippingProduct, del_deliveryTracking, del_weight,order_inventoryProduct,orderStatus;
  public OrderStepdefs() {

    Given("^user is on the AdminControlPane$", () -> {
      Assert.assertTrue(adminControlPanelPage.isNavigationDisplayed());
    });
    When("^user clicks on Orders link$", () -> {
      adminControlPanelPage.clicksOn_ordersLink();
    });
    Then("^user is on the Customers OrdersPage$", () -> {
      Assert.assertTrue(ordersPage.isCreateOrderLinkVisible());
    });

    Given("^user is on the customers orders page, and data are given$", () -> {
      order_findCustomers = lib.get("order_findCustomers");
      order_title = lib.get("order_title");
      order_firstName = lib.get("order_firstName");
      order_lastName = lib.get("order_lastName");
      order_companyName = lib.get("order_companyName");
      order_addressLine1 = lib.get("order_addressLine1");
      order_addressLine2 = lib.get("order_addressLine2");
      order_townOrCity = lib.get("order_townOrCity");
      order_country = lib.get("order_country");
      order_county = lib.get("order_county");
      order_postcode = lib.get("order_postcode");
      order_email = lib.get("order_email");
      order_phone = lib.get("order_phone");
      order_mobile = lib.get("order_mobile");
      //---------------------------------------------------------
      del_title = lib.get("del_title");
      del_firstName = lib.get("del_firstName");
      del_lastName = lib.get("del_lastName");
      del_companyName = lib.get("del_companyName");
      del_addressLine1 = lib.get("del_addressLine1");
      del_addressLine2 = lib.get("del_addressLine2");
      del_townOrCity = lib.get("del_townOrCity");
      del_country = lib.get("del_country");
      del_county = lib.get("del_county");
      del_postcode = lib.get("del_postcode");
      del_dispatchDate = lib.get("del_dispatchDate");
      del_shippingMethod = lib.get("del_shippingMethod");
      del_shippingProduct = lib.get("del_shippingProduct");
      del_deliveryTracking = lib.get("del_deliveryTracking");
      del_weight = lib.get("del_weight");

      order_inventoryProduct =lib.get("order_inventoryProduct");

    });
    When("^user adds a new customers order with data$", () -> {
      ordersPage.clicksOnCreateOrderLink();
      ordersPage.clicksOnBillingLink();
      ordersPage.fill_billing(order_findCustomers,  order_title,  order_firstName
              ,  order_lastName,  order_companyName,  order_addressLine1
              ,  order_addressLine2,  order_townOrCity,  order_country,  order_county
              ,  order_postcode,  order_email,  order_phone,  order_mobile);
      ordersPage.clicksOnDeliveryLink();
      ordersPage.fill_delivery(del_title,  del_firstName,  del_lastName,  del_companyName,  del_addressLine1
              ,  del_addressLine2,  del_townOrCity,  del_country,  del_county
              ,  del_postcode, del_dispatchDate, del_shippingMethod
              , del_shippingProduct, del_deliveryTracking, del_weight);
      ordersPage.clicksOnInventoryLink();
      ordersPage.setAjax_name(order_inventoryProduct);
      ordersPage.clicksOnAddLink();
      ordersPage.clicksOnSaveBtn();
    });
    Then("^user can see a new customers order is created$", () -> {
      Assert.assertTrue(ordersPage.isOrderSuccessfulCreated());
    });
    Given("^user obtains the data$", () -> {
      orderStatus = lib.get("orderStatus");
    });
    When("^user search for orders$", () -> {
      ordersPage.clicksOnSearchOrdersLink();
      ordersPage.setOrderStatus(orderStatus);
      ordersPage.clicksOnSearchBtn();
    });
    Then("^user found the order or no result$", () -> {
      Assert.assertTrue(ordersPage.isOrderSuccessfulFunded());
    });

  }
}
