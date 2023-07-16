Feature: Customer navigation through product categories: Phones, Laptops and Monitors and test purchase functionality

    #Customer navigation through product categories: Phones, Laptops and Monitors
    #• Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
    #• Navigate to "Laptop" → "Dell i7 8gb" and click on "Add to cart". Accept pop up confirmation.
    #• Navigate to "Cart" → Delete "Dell i7 8gb" from cart.
    #• Click on "Place order".
    #• Fill in all web form fields.
    #• Click on "Purchase"
    #• Capture and log purchase Id and Amount.
    #• Assert purchase amount equals expected.
    #• Click on "Ok"

  @Adidas
  Scenario: Login as user
    Given I am on the homepage
    When I go to login page
    And I enter username "RegularUser79"
    And I enter password "UserPass79"
    And click the sign in button
    And dashboard should be displayed
  #Scenario: Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation
    And I am on the homepage
    And I navigate to the Laptop Category
    And Navigate to Sony vaio i5
    And click on Add to cart
    And Accept pop up confirmation
  #Scenario: Navigate to "Laptop" → "Dell i7 8gb" and click on "Add to cart". Accept pop up confirmation
    Then I am on the homepage
    And I navigate to the Laptop Category
    And Navigate to Dell i7 8gb
    And click on Add to cart
    Then Accept pop up confirmation
   # Scenario: Navigate to "Cart" → Delete "Dell i7 8gb" from cart
    Then I am on the homepage
    And Navigate to Cart
    And Delete "Dell i7 8gb" from cart
    And Click on Place order
    And Fill in all web form fields
    Then Click on Purchase
  #Scenario: Capture and log purchase Id and Amount. Assert purchase amount equals expected. Click on "Ok"
    Given  Capture and log purchase Id and Amount
    And Assert purchase amount equals expected
    Then Click on Ok