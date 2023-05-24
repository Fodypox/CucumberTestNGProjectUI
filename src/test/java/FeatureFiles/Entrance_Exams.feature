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

