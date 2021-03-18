Feature: Login Feature

Background: User successfully logged in
When user opens the "chrome" browser and exe "E:\\AutomationSupport\\MavenFramework\\primusBank\\src\\main\\resources\\DRIVERS\\chromedriver.exe"
When User enters the url "http://primusbank.qedgetech.com/"


@smoketest
Scenario: Login functionality for valid username and password

When user enters "Admin" as username
When user enters "Admin" as password 
When user click on Login button
Then user is on "Admin" main page and get message as Welcome to Admin	


