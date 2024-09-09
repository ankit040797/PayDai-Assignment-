package com.example.NewsFetcherApplication.Model;

import com.example.NewsFetcherApplication.Service.NewsService;

public class NewsArticle {
    private String url;

    public NewsArticle(){
    }
    public NewsArticle(String url){
        this.url=url;
    }

    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url=url;
    }
}
