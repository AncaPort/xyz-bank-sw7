Feature: xyz Bank Manager Login Feature
  As a User I verify Bank Manager Login feature

  Background:I am on Home page
    Given I click on Bank Manager Login Tab

  @sanity @smoke @regression
  Scenario: Bank Manager Should Add Customer Successfully
    When I click on Add Customer Tab
    And I enter FirstName "<FirstName>"
    And I enter LastName "<LastName>"
    And I enter PostCode "<PostCode>"
    And I click on Add Customer Button
    And I Should verify Message customer added Successfully
    Then I click on ok button on popup

  @smoke @regression
  Scenario: Bank Manager Should Open Account Successfully
    When I click on Open Account Tab
    And I Search Customer that is created first
    And I select currency pound
    And I click on process button
    And I should verify Account created successfully
    Then I click on ok button on popup