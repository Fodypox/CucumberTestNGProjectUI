Feature:Validate functionality of Grading Scheme under Education Setup

  Background: Login with valid username and password
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    And I go to the grading Scheme page

  Scenario: Validate as an Admin User I should be able to add a new Grading Scheme under the Education Setup
    And I click on the add button to create new Grading Scheme
    And I fill up the new grading scheme form
    And I click on the save button
    Then User should see the success message for adding new grading Scheme

  Scenario: (NEGATIVE Case)Validate as an Admin User I should not be able to add a new Grading Scheme under the Education Setup with a created name
    And I click on the add button to create new Grading Scheme
    And I fill up the new grading scheme form
    And I click on the save button
    Then User should see the warning message for adding new grading Scheme with a created name

  Scenario: Validate as an Admin User I should be able to edit a created Grading Scheme under the Education Setup
    And I click on the edit button of my grading scheme
    And I change the name input with a new name
    And I click on the save button
    Then User should see the success message for editing new grading Scheme

  Scenario: (NEGATIVE Case)Validate as an Admin User I should not be able to add a new Grading Scheme without data under the Education Setup
    And I click on the add button to create new Grading Scheme
    And I click on the type button
    Then User should see the required message for adding new grading Scheme without data

  Scenario: Validate as an Admin User I should be able to delete a Grading Scheme under the Education Setup
    And I click on the add button to create new Grading Scheme
    And I fill up the new grading scheme form with new data
    And I click on the save button
    Then User should see the success message for adding new grading Scheme
    And i click on the delete buttons
    Then User should see the success message for deleting created grading Scheme
