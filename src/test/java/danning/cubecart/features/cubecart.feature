Feature: Cubecart Test Automation

  @login
  Scenario: As an Admin, the user can login the system with a valid username and password
    Given valid username and password
    When user enters the username and password
    And user clicks on login button
    Then user should see the admin control panel

  @addCategory
  Scenario: As an Admin, the user can create a new Inventory Category
    Given user can see the admin panel page with category name and description
    When user enters categories page and clicks on add categoryLink
    And user fills general and description tabs
    And user clicks on save button
    Then user should see the category was successfully created

  @deleteCategory
  Scenario: As an Admin, the user can delete an existing Inventory Category
    Given user can see the categories page
    When user clicks on delete link under existing category
    Then user should see the category was successfully deleted

  @addProduct
  Scenario: As an Admin, the user can add new products
    Given user is on products page and data is given
    # product name, Manufacturer/brand, condition, product code(automatically), weight,dimension unit, height, depth,stock level, stock level warning, Google Category,
      # description,
        # retail Price, sale price, cost price, tax class, tax included, minimum quantity purchase.
    When user fills product  general tab
    And user fills product description tab
    And user fills product pricing tab
    And user clicks on save button for add product
    Then user can see a new product was created

  @addProductsCategories
  Scenario: As an Admin, the user can assign products to categories
    Given user can see the products and have categories name for assignment
    When user open the product and Categories Tag
    And user choose a categories and clicks on save
    Then user can see product was successfully updated

  Scenario: As an Admin, the user can add manufacturer
    Given user is on the manufacturer page, and data are given
    When user adds a manufacture
    Then user can see a new manufacture was created

  Scenario: As an Admin, the user can do Bulk Price Change
    Given user is on the Bulk Price Change page, and data are given
    When user updates the price
    Then user can see the price is updated

  Scenario: As an Admin, the user can create new promotional code
    Given user is on the promotional code page, and data are given
    When user adds a new promotional code
    Then user can see a new promotional code was created

  Scenario: As an Admin, the user can view Customers Orders
    Given user is on the AdminControlPane
    When user clicks on Orders link
    Then user is on the Customers OrdersPage

  Scenario: As an Admin, the user can create order
    Given user is on the customers orders page, and data are given
    When user adds a new customers order with data
    Then user can see a new customers order is created

  Scenario: As an Admin, the user can search orders
    Given user obtains the data
    When user search for orders
    Then user found the order or no result

  # this function is disable in demo
  # Scenario: As an Admin, the user can change store settings

  Scenario: As an admin, the user can create news letter
    Given user is on the newsletter page, and data are given
    When user creates a new newsletter
    Then user can see a new newsletter was created