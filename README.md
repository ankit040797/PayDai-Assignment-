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

### 2. Download ChromeDriver

Make sure to download ChromeDriver and place the path in the `application.properties` file.

### Update Settings

In `application.properties`, specify the correct path to the ChromeDriver executable on your machine.

```properties
# PROJECT_FOLDER/src/main/resources/application.properties

# Path to ChromeDriver
selenium.webdriver.chrome.driver-path=C:/tools/chromedriver/chromedriver.exe


