package com.example.nyt; // <============= CHANGE ME

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/***
 * Model class for news articles. This should be 100% familiar to you.
 */
public class Article {

    // unique identifier of an article
    public int id;
    public String title;

    @SerializedName("abstract")
    public String abstracts;

    public String url;
    public String byline;
    public String published_date;
    public ArrayList<Media> media;

    public static class Media{
        @SerializedName("media-metadata")
        public ArrayList<MediaMetadata> mediaMetadata;

        public static class MediaMetadata{
            public String url;
        }


    }
    public String purl = media.get(0).mediaMetadata.get(0).url;






    public Article(int articleID, String headline, String author, String summary, String content, String imageDrawableId) {
        this.id = articleID;
        this.title = headline;
        this.byline= author;
        this.abstracts = summary;


        // Added this line for temporary way of showing images
        this.purl = imageDrawableId;
    }

    public int getArticleID() {
        return id;
    }

    public void setArticleID(int articleID) {
        this.id = articleID;
    }


    public String getHeadline() {
        return title;
    }

    public void setHeadline(String headline) {
        this.title = headline;
    }

    public String getAuthor() {
        return byline;
    }

    public void setAuthor(String author) {
        this.byline = author;
    }

    public String getSummary() {
        return abstracts;
    }

    public void setSummary(String summary) {
        this.abstracts = summary;
    }


    public String getImageDrawableId() {
        return purl;
    }

    public void setImageDrawableId(String imageDrawableId) {
        this.purl = imageDrawableId;
    }
}
