Feature: Validate functionality of Subject Category under Education Setup

  Background: Login with valid username and password
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    And I go to the Subject Category


  Scenario: Validate as an Admin User I should be able to add a new Subject Category under the Education Setup
    Given Add new Subject Category
    When Have verify success message
    Then Find added Subject Category
    And Delete added Subject Category


