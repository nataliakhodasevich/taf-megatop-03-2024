# Megatop 

## Tools

* Postman
* IntelliJ IDEA
* Selenium WebDriver
* REST Assured
* JUnit
* Jenkins
* Maven

## Segments tested:

cart
search
login
favourites
home page


## Project structure(main)

Page Objects для страниц(PageLocator и Page с методами для работы с элементами)
Генератор логина и пароля(domain.Utils)
Steps для объединения цепочек повторяющихся действий
Для API тестирования LoginService(перегруженный метод getBody и Map для headers) и SearchService с Map для headers.
driver (singleton pattern)

## Project structure(test)

BaseTest(настройка драйвера)
тестовые классы для:
Логина
Корзины
Поиска
Избранного
Домашней страницы
