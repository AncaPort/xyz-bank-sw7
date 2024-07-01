Feature: XYZ Bank Customer Login Page

  Background: Given I am on Home Page

 @author_Shital @sanity @regression
  Scenario:As a Customer, I should login and log out successfully
    Given I click on Customer Login Tab
    And I Search customer that is created
    And I click on Login Button
    Then I should verify Logout Tab displayed.
    And I click on Logout
    Then I should verify Name text displayed.

 @author_Shital @smoke @regression
  Scenario:As a Customer, I should Deposit money successfully
    Given I click on Customer Login Tab
    And I Search customer that is created
    And I click on Login Button
    And I click on Deposit Tab
    Then I Enter amount "1000"
    And I click on Deposit Button
    Then I should verify message Deposit Successful


 @author_Shital @regression
  Scenario:As a Customer, I should Withdraw money successfully
    Given I click on Customer Login Tab
    And I Search customer that is created
    And I click on Login Button
    And I click on Withdrawl Tab
    Then I Enter Withdrawl amount "50"
    And I click on Withdraw Button
    Then I should verify message Transaction successful