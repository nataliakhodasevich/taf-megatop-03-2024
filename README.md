# Megatop 

AUT  [Megatop](https://megatop.by/)

## Tools

* Postman
* IntelliJ IDEA
* Selenium WebDriver
* REST Assured
* JUnit
* Jenkins
* Maven

## Segments for testing

* cart
* search
* login
* favourites
* home page


## Project structure(main)

* Page Objects for pages(PageLocator and Page which contains methods for interactions with elements)
* Login and password generation (domain.Utils)
* Steps for complex actions
* For API testing: LoginService(getBody and Map for headers) and SearchService with Map for headers.
* driver (singleton pattern)

## Project structure(test)

BaseTest(driver settings) and 
test classes for:
* Login
* Cart
* Search
* Favourites
* HomePage
