package com.example.NewsFetcherApplication.Controller;

import com.example.NewsFetcherApplication.Model.NewsArticle;
import com.example.NewsFetcherApplication.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/search")
    public List<NewsArticle> searchNews(@RequestParam String query){
        return newsService.fetchNewsArticle(query);
    }
}
