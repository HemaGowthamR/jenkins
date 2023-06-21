Feature: To validate the facebook login page with valid and invalid parameters

 
  Scenario: To validate the login with valid email and password
    Given To launch fb login page
    When To pass the data to email text box
    And To pass the data to password text box
    Then then need to click the login button