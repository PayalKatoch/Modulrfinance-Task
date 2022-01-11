Feature: Modulr Customer User Login

Scenario: Modulr Customer login with valid credentials
Given User is on login page
When User enters username "Payal.Katoch43" and password "Samsung@12345"
And User clicks on Signin button
Then User landed on Home page "True"


Scenario: Modulr Customer login with invalid credentials
Given User is on login page
When User enters username "ABCD" and password "ABCD@#00"
And User clicks on Signin button
Then User landed on Home page "False"