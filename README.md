# PayDai-Assignment

# Introduction

This project is an HTTP service built using **Java Spring Boot** and **Selenium WebDriver**. The service takes a search term as input, performs a search on Google News, and returns a list of news article URLs from the first page of the search results.

# Getting Started

### Softwares Needed

1. [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
2. [Spring Tool Suite (STS)](https://spring.io/tools)
3. [Maven](https://maven.apache.org/)
4. [ChromeDriver](https://chromedriver.chromium.org/downloads) (Ensure the correct version matches your Chrome browser version)
5. [Selenium](https://www.selenium.dev/downloads/)

### Setup Instructions

#### 1. Clone the Repository

```bash
git clone <repository-url>
cd <project-directory>
```

#### 2. Download ChromeDriver

Make sure to download ChromeDriver and place the path in the `application.properties` file.

### Update Settings

In `application.properties`, specify the correct path to the ChromeDriver executable on your machine.

```properties
# PROJECT_FOLDER/src/main/resources/application.properties

# Path to ChromeDriver
selenium.webdriver.chrome.driver-path=C:/tools/chromedriver/chromedriver.exe
```

## Download Dependencies using Maven

Build the project using Maven by running the following command in the project directory.

```bash
mvn clean install
```

## Running the Project

You can run the project via Spring Tool Suite (STS) or from the terminal:

### Using STS:

Right-click the project, go to Run As, and select Spring Boot App.

### Using Terminal:

```bash
mvn spring-boot:run
```

## Testing the Service

Once the service is running (on localhost or in the cloud), you can test it using tools like Postman or cURL.

### Sample cURL Request

```bash
curl -X POST http://localhost:8080/search/news \
     -H "Content-Type: application/json" \
     -d '{"searchTerm": "indian sports news"}'
```

## Sample Response

```json
[
  {
    "url": "https://sports.ndtv.com/article-url-1"
  },
  {
    "url": "https://indianexpress.com/article-url-2"
  }
]
```

## Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.2/maven-plugin/reference/html/)
- [Selenium WebDriver Documentation](https://www.selenium.dev/documentation/en/)

## Guides

The following guides may help you in understanding key concepts of this project:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Selenium WebDriver in Java](https://www.selenium.dev/documentation/en/webdriver/)


## Support
For support, email singh.ankit424@gmail.com.

