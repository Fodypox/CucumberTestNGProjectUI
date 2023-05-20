Feature: Validate functionality of Grade Excuse Types under Education Setup

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario: As an admin I would like add Grade Excuse Types
    Given As an admin user I would like to click these steps.
      | Education        |
      | Setup            |
      | Grade Categories |
    When  The admin clicks the Add button.
    And   Enter a name.
    And   Click on Active toggle button.
    And   Click on Affect to Total.
    And   Type on Description.
    And   Click on Save button.
    Then  Grade Excuse Type successfully created success message should be visible.

  Scenario: [NEGATIVE] As an admin try to add Grade Excuse Types that had created with the same name as before, check the unsuccessful message
    Given As an admin user I would like to click these steps.
      | Education        |
      | Setup            |
      | Grade Categories |
    When  The admin clicks the Add button.
    And   Enter a name that already exist.
    And   Click on Active toggle button.
    And   Click on Affect to Total.
    And   Type on Description.
    And   Click on Save button.
    Then  Unsuccessful message should be visible.