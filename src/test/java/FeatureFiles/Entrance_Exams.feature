Feature: Validate functionality of Entrance Exams under Entrance Exams Setup

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    And User should login successfully
    And Click on Entrance Exams parameter
    And Click on Setup parameter
    Then Click on Entrance Exams under Setup parameter

  Scenario: As an Admin user i should able to add new Exam
    And Click on Add Button
    And Fill name field
    And Select academic period
    And Select Grade Level
    And Click on Save button
    Then Successfully created message should displayed


  Scenario: As an Admin user i should able to add new Exam with only Reg start date filled
    And Click on Add Button
    And Fill name field
    And Select academic period
    And Select Grade Level
    And Fill Reg Start Date
    And Click on Save button
    Then Successfully created message should displayed


  Scenario: As an Admin user i should not be able to add New Exam with name field left blank
    And Click on Add Button
    And Select academic period
    And Select Grade Level
    And Click on Save button
    Then This field cannot be left blank message should displayed


  Scenario: As an Admin user i should able to edit Exams
    And Click on Edit Button
    And Enter new name
    And Click on Save button
    Then Successfully updated message should displayed

  Scenario: As an Admin user i should able to delete Exams
    And Click on delete button
    And Click on delete button in delete page
    Then Exam succesfully deleted message should displayed


