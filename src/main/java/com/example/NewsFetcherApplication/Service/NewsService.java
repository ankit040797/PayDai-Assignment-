package com.example.NewsFetcherApplication.Service;

import com.example.NewsFetcherApplication.Model.NewsArticle;
import lombok.Value;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService {

    @Value("${selenium.webdriver.chrome.driver-path}")
    private String chromeDriverPath;

    public List<NewsArticle> fetchNewsArticle(String query){
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver=new ChromeDriver();
        List<NewsArticle>articles=new ArrayList<>();

        try{
            driver.get("https://news.google.com");
            WebElement searchBox= driver.findElement(By.name("q"));
            searchBox.sendKeys(query);
            searchBox.submit();

            Thread.sleep(2000);

            List<WebElement> results=driver.findElements(By.cssSelector("a[href^='/articles/']"));

            for(WebElement result:results){
                String url=result.getAttribute("href");
                articles.add(new NewsArticle(url));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
        return articles;
    }

}
