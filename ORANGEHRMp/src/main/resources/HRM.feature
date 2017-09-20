Feature: OrangeHrm Login/out

  @loginpage
  Scenario: admin Login and logout
    Given I am navigating to orrangeHRM Website
    When I enter username and password
    Then I click on Login button
    And I should login sucessfuly
    And I should logout sucessfuly

  @addemp
  Scenario: PIM add new Employee
    Given I am navigating to orrangeHRM Website
    When I enter username and password
    And I click on Login button
    Then I click on PIM button
    And I add new Employee

  @search
  Scenario: PIM search Employee
    Given I am navigating to orrangeHRM Website
    When I enter username and password
    And I click on Login button
    Then I click on PIM button
    And I click on Employee list
    Then I Search by Employee Name
    And I should logout sucessfuly

@delete
  Scenario: PIM delete Employee
    Given I am navigating to orrangeHRM Website
    When I enter username and password
    And I click on Login button
    Then I click on PIM button
    And I click on Employee list
    And I select by name and delete employee
    And I should logout sucessfuly

