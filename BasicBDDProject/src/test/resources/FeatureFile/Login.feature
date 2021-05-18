@Smoke
Feature: Test of the login feature
 
  Scenario: Login scenario
    Given I launch the Login page
    When I enter the username
    And I enter the password
    And I click on Login button
    Then I should be navigated to Home Page

 