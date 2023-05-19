Feature: Salary Type


  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

    Scenario: Num 1 Add new Salary Type
      Given My preconditions steps are get Salary Type ander Salary
      When I add new Salary Type
      Then I have verify success message
      And find added salary type
      And delete added salary type
      # Done

  Scenario: Num 2 Edit new Salary Type
    Given My preconditions steps are get Salary Type ander Salary
    When I add new Salary Type
    And find added salary type
    And I edit added salary type
    Then I have verify success edited message
    And find updated salary type
    And delete updated salary type
    #   Done


  Scenario: Num 3 Delete new Salary Type
    Given My preconditions steps are get Salary Type ander Salary
    When I add new Salary Type
    And find added salary type
    And delete added salary type
    Then I have verify success deleted message
    #   Done

  Scenario: Num 4 Add new Salary Type negative scenario
    Given My preconditions steps are get Salary Type ander Salary
    When I add new Salary Type
    And I try to add new Salary Type with the same parameters
    Then I have verify already exist message
    Then find and delete
    #  Done

  Scenario: Num 5 Find deleted Salary Type
    Given My preconditions steps are get Salary Type ander Salary
    When I add new Salary Type
    And find added salary type
    And delete added salary type
    And find added salary type
    Then i should be able to see no data message
    #  Done



