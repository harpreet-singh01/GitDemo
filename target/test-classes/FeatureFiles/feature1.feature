Feature: Shopping App

  @test
  Scenario: To search the things1
    Given User searches "Cucumber"
    Then Search result should get displayed "Cucumber"

  @test
  Scenario: To search the things and move to checkout Page
    Given User searches "Brinjal"
    And Added items to cart
    And User proceeded to Chekout page for purchase
    Then verify selected "Brinjal" items are displayed in check out page
