package pt.ipp.isep.dei.examples.tdd.basic.domain;

public class Bookmark {
    private String url;
    private String keyword;
    private int rating;

    public Bookmark(String url){
        this.url = url;
        keyword = "";
        rating = 1;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
