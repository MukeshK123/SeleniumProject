Feature: Application Login

Scenario: Login to Home Page.

Given Customer is on Landing page
When Customer Logs into application with "JIn" and "1234@"
Then Home page is populated
And Customer Account details are displayed

Scenario: Login to Home Page.

Given Customer is on Landing page
When Customer Logs into application with "JIll" and "4321@"
Then Home page is populated
And Customer Account details are displayed

Scenario Outline: Login to Home Page.

Given Initialize the browser with chrome
And Navigate to "http://amazon.com" Site
And Click on Login link home page to land on secure sign in page
When User enters <username> and <password>
Then Verify the user is successfully logged in

Examples:

|username	|password	|
|test99@gmail.com	|123456	|
|test123@gmail	|12345	|


And Customer Account details are displayed