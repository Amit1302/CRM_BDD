Feature: HomePage features

Background: user login
Given user has logged into the application
|username|password|
|dasamit1770@gmail.com|Odoo@2023@2024|

Scenario: HomePage search box 
Given user is on the homepage
When user clicks on the search box
Then user search for "ecommerce"

Scenario Outline: create a new database 
Given user is on the homepage
When user clicks on create button
Then user selects eCommerce
And user clicks on continue
When user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on startsnow button
Then it shows an error message "Your domain must be at least 4 characters long"

Examples:
|SheetName|RowNumber|
|Sheet1|0|
