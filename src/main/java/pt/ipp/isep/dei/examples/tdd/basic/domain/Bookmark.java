package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.net.URL;

public class Bookmark {
    private final String url;
    private String domain;
    private String keyword;
    private int rating;

    public Bookmark(String url) {
        this.url = url;
        keyword = "";
        rating = 1;
        domain = "";
    }

    public String getUrl() {
        return url;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public int getRating() {
        return rating;
    }

    public void increaseRating() {
        this.rating++;
    }

    public boolean checkIfUrlValid(String url) {
        if (url == null || url.isEmpty()) return false;
        try {
            new URL(url).toURI();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean setDomainByUrl(String url){
        if(!checkIfUrlValid(url)) {
            this.domain= "";
            return false;
        }
        String[] splitURL =url.split("/");

        this.domain= splitURL[2];
        return true;
    }
    public String getDomain(){
        return domain;
    }

    public boolean deleteTag(){
        return true;
    }
}
