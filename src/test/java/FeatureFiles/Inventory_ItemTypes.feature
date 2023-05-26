Feature:Item Types under Inventory Setup
#Ayse coded
  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    And  Click on Inventory page Scheme

  Scenario:Validate to add a New Item Type
    Given Click on add button to add new item Type
    When Fill up the New Item Type form
    And Click on Save button
    Then Validate successfully message is displayed

  Scenario:Validate to add an already existed Item
    Given Click on add button to add new item Type
    When Fill up the New Item Type form
    And Click on Save button
    Then Warning message should be displayed

  Scenario: Validate to edit added item
    Given Click on edit button
    When Change description on item
    And Click on Save button
    Then Validate successfully message is displayed

  Scenario: Validate to delete item
    Given Click on delete button
    When Click on delete confirm button
    Then Success message should be displayed

  Scenario:Validate without any input for Negative Scenario
    Given Click on add button to add new item Type
    When Click on Save button
    Then Warning message should be displayed when saved empty inputs