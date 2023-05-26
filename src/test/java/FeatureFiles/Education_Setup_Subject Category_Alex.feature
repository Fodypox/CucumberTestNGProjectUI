Feature: Validate functionality of Subject Category under Education Setup

  Background: Login with valid username and password
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    And I go to the Subject Category


  Scenario: Num1 Validate as an Admin User I should be able to add a new Subject Category under the Education Setup
    Given Add new Subject Category
    When Have verify success message
    Then Find added Subject Category
    And Delete added Subject Category


  Scenario: Num 2 (NEGATIVE Case) Validate as an Admin User I should not be able to add a new Grading Scheme under the Education Setup with a created name
    Given Add new Subject Category
    When Have verify success message
    Then Find added Subject Category
    And Delete added Subject Category


  Scenario: Num 3 Edit new Subject Category
    Given Add new Subject Category
    When Find added Subject Category
    And I edit Subject Category
    Then Have verify success message
    And Find added Subject Category
    And Delete added Subject Category