Feature:Validate Functionality of SalaryParameters Under Human Resource

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    When Navigate to SalaryParameters Under Human Resource

  Scenario: Add SalaryParameters Under Human Resource
    Given Click on add button
    And Add a name as "Sam", validFrom, Key as "text", New value
    Then Success message should be displayed

  Scenario: Add SalaryParameters Under Human Resource for Negative Scenario
    Given Click on add button
    And Add a name as "Sam", validFrom, Key as "text", New value
    Then warning message should be displayed


  Scenario: Add SalaryParameters Under Human Resource without name for Negative Scenario
    And Click on add button
    And Add a name as "", validFrom, Key as "text", New value
    Then Required Error message should be displayed

  Scenario: Edit SalaryParameters Under Human Resource
    Given Click on edit button
    And Change the Key as "Hello"
    When Click on save button
    Then Success message should be displayed

  Scenario: Delete SalaryParameters Under Human Resource
    Given Click on delete button
    And Click on delete confirm button
    Then Success message should be displayed


















