# woolworths-code-test
To design and implement browser-based automated tests


# Built With
1. Selenium Webdriver
2. JUnit
3. Maven
4. Cucumber


# Tasks
Write an automated browser-based test on eBay.com.au
1. Go to ebay.com.au. Search for books.
2. Click on the first item on the search
result. 
3. Add the book to the cart. 
4. Go to the Cart. Validate the book is added to
the cart. 
5. Remove the book from the cart. Validate the cart is empty.

# Folder Structure
## src/test/java
  1. pageobjects - Object repository for each page
  2. stepdefinitions - step difinitions to all the matching steps 
  3. TestScriptRunners - runner file to execute test scripts
  4. utilities - base page where driver instance is instansiated
## src/test/resources
  1. features - Test scenarios are available over here
  2. chromedriver.exe

# Running the tests
Navigate to src/test/java/TestScriptRunners and run the runner file

# Author
Chowsan Dudekula
