Feature: Login page features

Scenario: verify Reset password link
Given user is on the login page
Then reset password link should be available 

Scenario: Login with correct credential
Given user is on the login page
When user enters the username as "dasamit1770@gmail.com"
And user enters the password as "Odoo@2023@2024"
And user clicks on login button
And user verifies the try it for free button is available on the homepage

Scenario: Login with incorrect userid and password
Given user is on the login page
When user enters the username as "admin"
And user enters the password as "123"
And user clicks on login button
And user verifies the alert should be "Wrong login/password"