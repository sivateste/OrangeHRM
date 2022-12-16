
Feature: 
As admin user add emp

  Scenario Outline: Validate add emp with multiple data
  Given user navigate orangehrm url"http://orangehrm.qedgetech.com/"
  When user logs in as "Admin" and password as "Qedge123!@#"
  When user click login button
  When user click pim
  When user enter as "<firstname>" and "<middlename>" and "<Lastname>" 
  When user click save button
  When user validate url
  Then user close browser
  
    Examples: 
      | FirstName  | MiddleName | LastName  |
      | Siva |Selenium |Testing |
			| Siva1 |Selenium |Testing |
			| Siva2 |Selenium |Testing |
			| Siva3 |Selenium |Testing |
			| Siva4 |Selenium |Testing |
			