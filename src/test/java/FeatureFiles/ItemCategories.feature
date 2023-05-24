Feature: Item Categories under Inventory Setup

  #  Coded by Belgin D. #

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    When Navigate to Item Categories under Inventory Setup

  Scenario: Add Item Categories under Inventory Setup
    And Click on add button
    And Add a name as "xyz" and user type
    When Click on save button
    Then Success message should be displayed

  Scenario: Add Existing Item Categories for Negative Scenario
    And Click on add button
    And Add a name as "xyz" and user type
    When Click on save button
    Then Warning message should be displayed

  Scenario: Add Item Categories without any data for Negative Scenario
    And Click on add button
    When Click on save button
    Then Required message should be displayed

  Scenario: Edit Item Categories under Inventory Setup
    When Click on edit button
    And Change the name as "abc"
    When Click on save button
    Then Success message should be displayed

  Scenario: Delete Item Categories under Inventory Setup
    When Click on delete button
    And Click on delete confirm button
    Then Success message should be displayed




