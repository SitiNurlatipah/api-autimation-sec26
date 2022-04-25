Feature: User
  As an admin
  I want to see list of user
  So that I can create new user

  Scenario: Get-As admin I have able to get detail user
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user

  Scenario: Post - As admin I have able to create new user
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user

  Scenario: Delete - As Admin I have able to delete user
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive HTTP response code 204

  Scenario: Put - As Admin I have able to update user
    Given I set PUT api endpoints
    When I send PUT HTTP request
    Then I receive HTTP response code 201
    And I receive valid user latest data