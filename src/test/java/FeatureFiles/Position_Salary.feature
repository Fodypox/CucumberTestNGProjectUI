Feature:Validate functionality of Position Salary under Human Resources Salary

  Background: Login with valid username and password
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully
    And I go to the Position Salary page

  Scenario: Validate as an Admin User I should be able to add a new Position Salary under Human Resources Salary
    And I click on the add button to create new Position Salary
    And I fill up by position salary name
    And I click on the save button for Position Salary
    Then User should see the success message for adding new Position Salary

  Scenario: Validate as an Admin User I should not be able to add a new Position Salary under the Human Resources Salary by empty name
    And I click on the add button to create new Position Salary again
    And I leave the blank new position salary name
    Then User should see the warning message for adding new Position Salary with a created name

  Scenario: Validate as an Admin User I should be able to edit a created Position Salary under Human Resources Salary (Negative)
    And I click on the edit button of Position Salary
    And I change the name input with a new name for Position Salary
    And I click on the save button for edited position salary
    Then User should see the success message for editing new Position Salary

  Scenario: Validate as an Admin User I should not be able to edit a new Position Salary under Human Resources Salary (Negative)
    And I click on the edit button to create new Position Salary
    And I save new position salary as empty name
    Then User should see the warning message for editing new Position Salary without any data

  Scenario: Validate as an Admin User I should be able to delete a Position Salary under Human Resources Salary
    And I click on the trash button
    And I click on the delete button
    Then User should see the success message for deleting created Position Salary
