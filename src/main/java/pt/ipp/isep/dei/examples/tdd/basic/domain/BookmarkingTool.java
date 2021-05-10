package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.*;

public class BookmarkingTool {
    private ArrayList<Bookmark> savedBookmarks = new ArrayList<>();

    public Bookmark addBookmark(String url){
        if(!checkIfUrlValid(url)) return null;
        Bookmark bookmark = new Bookmark(url);
        if(!checkIfNotDuplicate(url)) { //is duplicated
            for (Bookmark nextBookmark : savedBookmarks) {
                if (nextBookmark.getUrl().equals(url)) {
                    nextBookmark.setRating(nextBookmark.getRating() + 1);
                    return nextBookmark;
                } }
        }
        savedBookmarks.add(bookmark);
        return bookmark;
    }

    public boolean addKeywordToUrl(String keyword, String url){
        if(url==null || keyword==null || url.isEmpty()|| keyword.isEmpty() || savedBookmarks.isEmpty()) return false;
        Iterator<Bookmark> bookmark = savedBookmarks.iterator();
        while(bookmark.hasNext()){
            Bookmark nextBookmark = bookmark.next();
            if (nextBookmark.getUrl().equals(url)) {
                nextBookmark.setKeyword(keyword);
                return true;
            }
        }
        return true;
    }

    public boolean checkIfUrlValid(String url){
        if(url == null || url.isEmpty()) return false;
        try{
            new URL(url).toURI();
        }catch (Exception e){
            return false;
        }
        return true;

    }

    public boolean checkIfNotDuplicate(String url){
        if(url==null) return false;
        boolean isNotDuplicate = true;
        while(isNotDuplicate && savedBookmarks.iterator().hasNext()){
            if (savedBookmarks.iterator().next().getUrl().equals(url)) isNotDuplicate = false;
        }
        return isNotDuplicate;
    }


    public ArrayList<Bookmark> getSavedBookmarks() {
        return savedBookmarks;
    }

    public void setSavedBookmarks(ArrayList<Bookmark> savedBookmarks) {
        this.savedBookmarks = savedBookmarks;
    }

}
